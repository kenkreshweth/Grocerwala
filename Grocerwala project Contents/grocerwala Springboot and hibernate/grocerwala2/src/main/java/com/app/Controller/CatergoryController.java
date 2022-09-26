package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Category;
import com.app.response.Response;
import com.app.services.CategoryService;

@RestController
//@Transactional
public class CatergoryController {

	@Autowired
	private CategoryService cservice;
	
	@GetMapping(value="/getcat", produces="application/json")
	public ResponseEntity<?> getCategory() {
		
		List<Category> category = this.cservice.getCategory();
		
		if(!category.isEmpty()) {
			return ResponseEntity.ok(new Response("fetch successfully",this.cservice.getCategory(),true));
		}else {
			return ResponseEntity.ok(new Response("faild to fetch",null,false));
		}
	}
	
	@PostMapping("/add-cat")
		public ResponseEntity<?> setCategory(@RequestBody Category cat) {
		
			Category setCategory = cservice.setCategory(cat);
			
			if(setCategory != null) {
				return ResponseEntity.ok(new Response("added category successfully",setCategory,true));
			}else {
				return ResponseEntity.ok(new Response("faild to add",null,false));
			}
		}
	
	@PutMapping("/put-cat")
	public ResponseEntity<?> upateCategory(@RequestBody Category cat) {
		Category updatecategory = cservice.updatecategory(cat);

		if(updatecategory != null) {
			return ResponseEntity.ok(new Response("updated category successfully",updatecategory,true));
		}else {
			return ResponseEntity.ok(new Response("faild to add",null,false));
		}
	}
	
	@DeleteMapping("/delcat/{id}")
	public ResponseEntity<?> delCategory(@PathVariable int id) {
		boolean delCategory = cservice.delCategory(id);
		
		if(delCategory) {
			return ResponseEntity.ok(new Response("deleted category successfully",null,true));
		}else {
			return ResponseEntity.ok(new Response("faild to add",null,false));
		}
	}
}
