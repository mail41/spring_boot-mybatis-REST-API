package com.kp.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kp.user.dao.UserDao;
import com.kp.user.vo.User;

@Service
@Transactional
public class UserServiceImpl {
	
	@Autowired
	public UserDao dao;
	
	// 회원 목록
	public List<User> selectUser() {
		return dao.selectUser();
	}
	
	// 회원 등록
	public Integer insertUser(User user) {
		return dao.insertUser(user);
	}
	
	// 회원 수정
	public Integer updateUser(Integer id, User user) {
			
			Integer updateChk = dao.updateUser(id, user);
				
			if(updateChk == 1) {
				return updateChk;
			}else {
				return -1;
			}
		
	}
	
	// 회원 삭제
	public Integer deleteUser(Integer id) {
		return dao.deleteUser(id);
	}
}
