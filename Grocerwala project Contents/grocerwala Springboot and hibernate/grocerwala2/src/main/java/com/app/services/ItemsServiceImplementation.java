package com.app.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dao.ItemsDao;
import com.app.entity.Items;
@Service
public class ItemsServiceImplementation implements ItemService{

	@Autowired
	private ItemsDao itemsdao;
	
	
	public ItemsServiceImplementation() {
		super();
		
	}

	@Override
//	@Transactional
	public Items getItem(int id) {
		
		return itemsdao.findById(id).get();
	}

	@Override
//	@Transactional
	public Items addItem(Items item) {
		this.itemsdao.save(item);
		return item;
	}

	@Override
//	@Transactional
	public Items updateItems(Items item) {
		this.itemsdao.save(item);
		return item;
	}

	@Override
//	@Transactional
	public void deleteItem(int id) {
		@SuppressWarnings("deprecation")
		Items i=this.itemsdao.findById(id).get();
		this.itemsdao.delete(i);
		
	}

}
