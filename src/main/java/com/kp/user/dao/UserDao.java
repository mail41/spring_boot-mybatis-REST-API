package com.kp.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.kp.user.vo.User;

@Repository
public interface UserDao {
	
	// 회원 목록
	List<User> selectUser();
	
	// 회원 등록
	Integer insertUser(User user);
	
	// 회원 수정
	Integer updateUser(Integer id, User user);
	
	// 회원 삭제
	Integer deleteUser(Integer id);
}
