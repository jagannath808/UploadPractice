package com.appsdeveloper.app.webServices.ui.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appsdeveloper.app.webServices.ui.requestModel.UserDetailsRequestModel;
import com.appsdeveloper.app.webServices.ui.responseModel.UserRest;
import com.appsdeveloper.app.webServices.ui.service.UserService;
import com.appsdeveloper.app.webServices.ui.shared.dto.UserDto;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserService userServices;
	
	
	@GetMapping
	public String getUser() {
		return "Get all user";
	}

	@PostMapping
	public UserRest createUser(@RequestBody UserDetailsRequestModel userDetailsRequestModel) {
		
		UserRest userRest= new UserRest();
		UserDto userDto= new UserDto();
		
		BeanUtils.copyProperties(userDetailsRequestModel, userDto);
		UserDto createdUser=userServices.createUser(userDto);
		BeanUtils.copyProperties(createdUser, userRest);
		
		return userRest;
	}

	@PutMapping
	public String updateUser() {
		return "updated user details";
	}

	@DeleteMapping
	public String deleteUser() {
		return "deleted user";
	}
}
