package com.app.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.entity.Category;


@Repository
public interface CategoryDao extends JpaRepository<Category, Integer> {

}
