package com.example.ujianspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ujianspringboot.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

//	User findByName(String user_name);
}
