package com.app.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dao.CategoryDao;
import com.app.entity.Category;

@Service
public class CategoryServiceImplementation implements CategoryService {

	@Autowired
	private CategoryDao cdao;
	
	
	public CategoryServiceImplementation() {
		super();
	}

	@Override
	@Transactional
	public List<Category> getCategory() {
		return this.cdao.findAll();
	}

	@Override
	@Transactional
	public Category setCategory(Category cat) {
		
		this.cdao.save(cat);
		return cat;
	}

	@Override
	@Transactional
	public Category updatecategory(Category cat) {
		this.cdao.save(cat);
		return cat;
	}

	@Override
	public boolean delCategory(int id) {
		boolean flag = false;
		
		Category c= cdao.findById(id).get();
		if(c != null) {
			cdao.delete(c);
			flag = true;
		}
		
		return flag;
	}

	
}
