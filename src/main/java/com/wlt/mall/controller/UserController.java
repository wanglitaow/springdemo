package com.wlt.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wlt.mall.domain.User;
import com.wlt.mall.serivce.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired//依赖注入service
	UserService userService;

	@RequestMapping("/getUser/{name}")//定义requestMapping rest风格
	@ResponseBody//返回json格式数据
	protected User getUser(@PathVariable(value="name") String name){
		return userService.getUser(name);
	}

	@RequestMapping("/getUserByName/{name}")//定义requestMapping rest风格
	protected String getUserByName(@PathVariable(value="name") String name,Model model){
		User user= userService.getUser(name);
		model.addAttribute(user);
		return "user";
	}
}
