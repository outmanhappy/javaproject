package com.hd.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hd.mapper.UserbeanMapper;
import com.hd.model.Userbean;
import com.hd.service.IuserService;
@Service
public class UserServiceImpl implements IuserService {
	@Resource
	private UserbeanMapper userMapper;
	@Override
	public Userbean findById(int id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

}
