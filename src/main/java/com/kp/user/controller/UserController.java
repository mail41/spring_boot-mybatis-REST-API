package com.kp.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.kp.user.service.UserServiceImpl;
import com.kp.user.vo.User;

@RestController
public class UserController {
	
	@Autowired
	UserServiceImpl service;
	
	 private static final Logger LOGGER = LogManager.getLogger(UserController.class);
	 
	 // log test
	 @RequestMapping("/test")
	 public void test() {
        LOGGER.info("@@ Info level log 테스트");
        LOGGER.error("@@ Error level 테스트");
	 }
	 
	// 회원 목록
	@RequestMapping("/user")
	public @ResponseBody List<User> selectUser() {
			return service.selectUser();
	}
	
	// 회원 등록
	@RequestMapping("/insertUser")
	public Integer insertUser(@RequestBody User user) {
		return service.insertUser(user);
	}
	
	// 회원 수정
	@RequestMapping("/updateUser/{id}")
	public Integer updateUser(@PathVariable Integer id, @RequestBody User user) {
		return service.updateUser(id, user);
	}
	
	// 회원 삭제
	@RequestMapping("/deleteUser/{id}") 
	public Integer deleteUser(@PathVariable Integer id) {
		return service.deleteUser(id);
	}
	
	

}
