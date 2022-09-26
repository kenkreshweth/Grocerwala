package com.app.services;

import java.util.List;

import com.app.entity.Category;

public interface CategoryService {

	List<Category> getCategory();

	Category setCategory(Category cat);

	Category updatecategory(Category cat);

	boolean delCategory(int id);

	

}
