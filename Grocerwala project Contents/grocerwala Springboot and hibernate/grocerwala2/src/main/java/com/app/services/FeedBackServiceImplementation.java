package com.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dao.FeedBackDao;
import com.app.entity.Feedback;

@Service
public class FeedBackServiceImplementation implements FeedBackService {

	@Autowired
	private FeedBackDao fbdao;
	
	@Override
	@Transactional
	public List<Feedback> getFeedback() {
		return this.fbdao.findAll();
	}

	@Override
	@Transactional
	public void addfeed(Feedback fb) {
		this.fbdao.save(fb);
		
	}

	@Override
	@Transactional
	public void updateFeedback(Feedback fb) {
		this.fbdao.save(fb);
	}

	@Override
	@Transactional
	public void deleteFeedBack(int id) {
		@SuppressWarnings("deprecation")
		Feedback fb=this.fbdao.getById(id);
		this.fbdao.delete(fb);
		
	}

}
