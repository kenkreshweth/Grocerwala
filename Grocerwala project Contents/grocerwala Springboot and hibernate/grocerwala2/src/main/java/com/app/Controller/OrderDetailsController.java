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

import com.app.entity.OrderDetails;
import com.app.services.OrderDetailsService;

@RestController
//@Transactional
public class OrderDetailsController {

	@Autowired
	private OrderDetailsService odservice;
	
	//get details of a specific OrderDetails
		@GetMapping(value="/orderdetails/{id}",produces = "application/json")
		public OrderDetails getOdetails(@PathVariable("id") String id)
		{
			return this.odservice.getOdetails(Integer.parseInt(id));
		}
		
		//adding a OrderDetails
		@PostMapping(value="/addOrderDetails",produces = "application/json")
		public OrderDetails addOdetails(@RequestBody OrderDetails od) {
			return odservice.addOdetails(od);
		}
		
		//Update OrderDetails
		@PutMapping(value="/updatOdetails",produces = "application/json")
		public OrderDetails updateOdetails(@RequestBody OrderDetails od) {
			return odservice.updateOdetails(od);
		}
		
		
		//delete orderdetails
		@DeleteMapping(value="/deleteorder/{id}",produces = "application/json")
		public ResponseEntity<HttpStatus> deleteOrder(@PathVariable("id") String id ) {
			try {
				this.odservice.deleteOrderDetails(Integer.parseInt(id));
				return new ResponseEntity<>(HttpStatus.OK);
			}catch(Exception e) {
				return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
}
