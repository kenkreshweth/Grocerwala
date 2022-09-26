package com.app.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dao.OrderDetailsDao;
import com.app.entity.OrderDetails;

@Service
public class OrderDetailsServiceImplementation implements OrderDetailsService {

	@Autowired
	private OrderDetailsDao odd;
	
	@Override
	@Transactional
	public void deleteOrderDetails(int id) {
		@SuppressWarnings("deprecation")
		OrderDetails o=this.odd.getById(id);
		this.odd.delete(o);
	}

	@Override
	@Transactional
	public OrderDetails updateOdetails(OrderDetails od) {
		return this.odd.save(od);
	}

	@SuppressWarnings("deprecation")
	@Override
	@Transactional
	public OrderDetails getOdetails(int id) {
		return this.odd.getById(id);
		
	}

	@Override
	@Transactional
	public OrderDetails addOdetails(OrderDetails od) {
		this.odd.save(od);
		return od;
	}

}
