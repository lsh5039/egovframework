package com.sillasys.user.dao;


import org.springframework.stereotype.Repository;

import com.sillasys.user.vo.UserVO;

import egovframework.com.cmm.service.impl.EgovComAbstractDAO;
import egovframework.rte.psl.dataaccess.EgovAbstractMapper;

@Repository("userDAO")
public class UserDAO extends EgovAbstractMapper{
	
	
	public void doJoin(UserVO param) throws Exception{
		 insert("userDAO.doJoin", param);
	}
	
	
	
	
}
