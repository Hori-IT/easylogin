package com.example.easylogin.mode.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.easylogin.model.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	//	Lesson７　スライド：12（追加）
	List<User> findByUserNameAndPassword(String userName,String password);
}
