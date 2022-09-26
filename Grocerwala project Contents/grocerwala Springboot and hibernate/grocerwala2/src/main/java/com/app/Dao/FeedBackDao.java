package com.app.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Feedback;
@Repository
public interface FeedBackDao extends JpaRepository<Feedback, Integer> {

}
