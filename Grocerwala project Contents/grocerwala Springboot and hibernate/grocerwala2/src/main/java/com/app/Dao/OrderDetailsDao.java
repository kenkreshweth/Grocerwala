package com.app.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.OrderDetails;
@Repository
public interface OrderDetailsDao extends JpaRepository<OrderDetails, Integer> {

}
