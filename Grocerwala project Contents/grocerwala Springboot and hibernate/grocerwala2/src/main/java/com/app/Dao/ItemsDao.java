package com.app.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Items;
@Repository
public interface ItemsDao extends JpaRepository<Items, Integer> {

}
