package com.hd.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hd.model.Userbean;
import com.hd.service.IuserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IuserService userService;
	
	@RequestMapping("/query")
	public String query(){
		Userbean user=userService.findById(1);
		
		return "index";
	}
}
