package com.kp.user.service;

import java.util.List;

import com.kp.user.vo.User;

public interface UserService {

	// 회원 목록
	List<User> selectUser();
	
	// 회원 등록
	Integer insertUser(User user);
	
	// 회원 수정
	Integer updateUser(Integer id, User user);
	
	// 회원 삭제
	Integer deleteUser(Integer id);
	
}
