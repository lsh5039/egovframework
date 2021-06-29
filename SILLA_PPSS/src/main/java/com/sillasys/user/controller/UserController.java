package com.sillasys.user.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sillasys.user.service.UserService;
import com.sillasys.user.vo.UserVO;

@Controller
public class UserController {
	
	@Resource(name = "userService")
	private UserService userService;
	
	@RequestMapping(value = "/board/board.do" , method = RequestMethod.GET)
	public String goMain() throws Exception{
		
		UserVO vo = new UserVO();
		vo.setUserId("1234444");
		vo.setUserNick("nick");
		vo.setUserPhone("01041617845");
		vo.setUserPw("1234");
		
		userService.doJoin(vo);
		
		return "com/sillasys/board/board";
	}
	
	
	@RequestMapping(value = "/board/index.do" , method = RequestMethod.GET)
	public String goIdx() {
		return "com/sillasys/board/index";
	}

}
