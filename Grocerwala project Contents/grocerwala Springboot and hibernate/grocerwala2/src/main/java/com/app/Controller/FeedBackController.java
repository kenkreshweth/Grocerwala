package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.Feedback;
import com.app.services.FeedBackService;

@RestController
public class FeedBackController {

	@Autowired
	private FeedBackService fbservice;
	
	@GetMapping(value="/getfeedback",produces="application/json")
	public List<Feedback> getFeeback(){
		return this.fbservice.getFeedback();
	}
	
	@PostMapping(value="/addFeedback",produces="application/json")
		public Feedback addFeedback(Feedback fb) {
		this.fbservice.addfeed(fb);
		return fb;
	}
	
	@PutMapping(value="/updateFeed",produces="application/json")
	public Feedback updateFeedback(Feedback fb)
	{
		this.fbservice.updateFeedback(fb);
		return fb;
	}
	
	@DeleteMapping(value="/delFeedback",produces="application/json")
	public void deleteFeedBack(String id)
	{
		this.fbservice.deleteFeedBack(Integer.parseInt(id));
	}
}
