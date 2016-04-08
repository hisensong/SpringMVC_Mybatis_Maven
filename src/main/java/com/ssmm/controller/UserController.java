package com.ssmm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssmm.model.User;
import com.ssmm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public  String index() {
		return "index";
	}
	
	@RequestMapping(value = "/showUser",method = RequestMethod.GET)
	@ResponseBody
	public  String showUser() {
		return "12";
	}

	@RequestMapping(value = "/showOneUser", method = RequestMethod.GET)
	@ResponseBody
	public User showOneUser(int id) {
		return userService.getUserById(id);
	}
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	@ResponseBody
	public void addUser(User user) {
		 userService.saveUser(user);
	}
}
