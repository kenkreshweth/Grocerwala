package com.app.services;

import java.util.List;

import com.app.entity.Feedback;

public interface FeedBackService {

	public List<Feedback> getFeedback();

	public void addfeed(Feedback fb);

	public void updateFeedback(Feedback fb);

	public void deleteFeedBack(int parseInt);

}
