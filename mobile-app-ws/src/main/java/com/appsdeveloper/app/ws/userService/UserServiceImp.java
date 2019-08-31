package com.appsdeveloper.app.ws.userService;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.appsdeveloper.app.ws.myExecption.UserServiceException;
import com.appsdeveloper.app.ws.ui.model.request.UpdateUserDetailsModelRequest;
import com.appsdeveloper.app.ws.ui.model.request.UserDetailsModelRequest;
import com.appsdeveloper.app.ws.ui.model.response.UserRest;
@Service
public class UserServiceImp implements UserService {
	Map<String, UserRest> user;
	@Override
	public UserRest createUser(UserDetailsModelRequest userDetailsModelRequest) {
		UserRest std= new UserRest();
		std.setName(userDetailsModelRequest.getName());
		std.setAddress(userDetailsModelRequest.getEmail());
		std.setPhone(userDetailsModelRequest.getPhone());
		String userId=UUID.randomUUID().toString();
		std.setUserId(userId);
		
		if(user==null) {user= new HashMap<String,UserRest>();}
		user.put(userId, std);
		return std;
	}
	@Override
	public UserRest getUser(String userId) {
		// TODO Auto-generated method stub
		//if(true) throw new UserServiceException("My coustom Exception");
		if(user.containsKey(userId)) {
			return user.get(userId);
		}else {
			return null;
		}
		
	}
	@Override
	public UserRest updateUser(String userId, UpdateUserDetailsModelRequest updateUserDetailsModelRequest) {
		UserRest users= user.get(userId);
		users.setName(updateUserDetailsModelRequest.getName());
		users.setPhone(updateUserDetailsModelRequest.getPhone());
		user.put(userId, users);
		return users;
	}
	@Override
	public void delateUser(String userId) {
		// TODO Auto-generated method stub
		user.remove(userId);
		
	}
	@Override
	public String getUSer() {
		// TODO Auto-generated method stub
		return user.toString();
	}

}
