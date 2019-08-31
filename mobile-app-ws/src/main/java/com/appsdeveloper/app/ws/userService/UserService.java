package com.appsdeveloper.app.ws.userService;

import com.appsdeveloper.app.ws.ui.model.request.UpdateUserDetailsModelRequest;
import com.appsdeveloper.app.ws.ui.model.request.UserDetailsModelRequest;
import com.appsdeveloper.app.ws.ui.model.response.UserRest;

public interface UserService {
	UserRest getUser(String userId);
	String getUSer();
  UserRest createUser(UserDetailsModelRequest userDetailsModelRequest);
  UserRest updateUser(String userId,UpdateUserDetailsModelRequest updateUserDetailsModelRequest);
  void delateUser(String userId);
}
