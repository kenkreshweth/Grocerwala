package com.app.services;

import org.springframework.stereotype.Service;

import com.app.entity.Items;

@Service
public interface ItemService {

	Items getItem(int parseInt);

	Items addItem(Items item);

	Items updateItems(Items item);

	void deleteItem(int parseInt);

	


	

	

	
}
