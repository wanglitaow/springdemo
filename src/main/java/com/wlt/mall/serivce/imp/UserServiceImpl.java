package com.wlt.mall.serivce.imp;

import org.springframework.stereotype.Service;

import com.wlt.mall.domain.User;
import com.wlt.mall.serivce.UserService;
@Service//注入成service
public class UserServiceImpl implements UserService {

	@Override
	public User getUser(String name) {
		return new User(name);
	}
}
