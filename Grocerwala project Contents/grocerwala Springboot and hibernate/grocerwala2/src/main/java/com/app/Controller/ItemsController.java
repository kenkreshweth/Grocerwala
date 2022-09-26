package com.app.Controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Items;
import com.app.services.ItemService;

@RestController
//@Transactional
public class ItemsController {

	@Autowired
	private ItemService iservice;
	
	//get details of a specific item
		@GetMapping(value="/itemid/{id}",produces = "application/json")
		public Items getItem(@PathVariable("id") String id)
		{
			return this.iservice.getItem(Integer.parseInt(id));
		}

		//adding an Item
		@PostMapping(value="/addItem",produces = "application/json")
		public Items addItem(@RequestBody Items item) {
			return iservice.addItem(item);
		}
		
		//Update Items
		@PutMapping(value="/updateItem",produces = "application/json")
		public Items updateItems(@RequestBody Items item) {
			return iservice.updateItems(item);
		}
		
		//delete item by id
		@DeleteMapping(value="/deleteItem/{id}",produces = "application/json")
		public ResponseEntity<HttpStatus> deleteItem(@PathVariable("id") String id ) {
			try {
				this.iservice.deleteItem(Integer.parseInt(id));
				return new ResponseEntity<>(HttpStatus.OK);
			}catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
		
		
		
}
