package com.sillasys.user.service.Impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sillasys.user.dao.UserDAO;
import com.sillasys.user.service.UserService;
import com.sillasys.user.vo.UserVO;


@Service("userService")
public class UserServiceImpl implements UserService{

	@Resource(name = "userDAO")
	private UserDAO userDAO;
	
	
	@Override
	public void doJoin(UserVO param) throws Exception {
		userDAO.doJoin(param);
	}

	
	
}
