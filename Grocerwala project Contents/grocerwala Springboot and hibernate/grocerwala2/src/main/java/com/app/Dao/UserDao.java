package com.app.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.entity.User;

//Do All the Hibernate Operations 
@Repository
public interface UserDao extends JpaRepository<User, Integer> {

}


