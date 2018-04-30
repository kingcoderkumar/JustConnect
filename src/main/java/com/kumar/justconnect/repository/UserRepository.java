package com.kumar.justconnect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kumar.justconnect.entity.User;

public interface UserRepository  extends JpaRepository<User, Long>{
    
	List<User> findByName(String lastName);

	User findOne(long id);

	void delete(long id);
}
