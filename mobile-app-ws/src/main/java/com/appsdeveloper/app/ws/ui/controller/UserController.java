package com.appsdeveloper.app.ws.ui.controller;



import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appsdeveloper.app.ws.myExecption.UserServiceException;
import com.appsdeveloper.app.ws.ui.model.request.UpdateUserDetailsModelRequest;
import com.appsdeveloper.app.ws.ui.model.request.UserDetailsModelRequest;
import com.appsdeveloper.app.ws.ui.model.response.UserRest;
import com.appsdeveloper.app.ws.userService.UserService;

@RestController
@RequestMapping("/users") // localhost::8080/users
public class UserController {

	//Map<String, UserRest> user;
	@Autowired
	UserService userServices;
	
	//get user using userId
	
	@GetMapping(path="/{userId}",produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})		//value="/get{userId}"
	public ResponseEntity<UserRest> getUser(@PathVariable String userId) {
		
		/*String name=null;
		int nameLength=name.length();*/
		
		UserRest us=userServices.getUser(userId);
		
		if(us!=null) {
			return new ResponseEntity<>(us,HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		
	}
	//get user all
	
	/*@GetMapping
	public String getUser(@RequestParam(value="page", defaultValue="1") int page,@RequestParam(value="limit",defaultValue="10") int limit) {

		return "getUser mothod was  call page="+page +"and limit ="+limit;
	}*/
	
	@GetMapping
	public String getUser() {
		
		return userServices.getUSer();
	}
	
	// create new user

	@PostMapping(consumes= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE},produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<UserRest> createUser( @RequestBody UserDetailsModelRequest userDetailsModelRequest) {

		UserRest userRest=userServices.createUser(userDetailsModelRequest);
		return new ResponseEntity<UserRest>(userRest,HttpStatus.OK);

	}

	// update new user
	@PutMapping(path="/{userId}", consumes= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE},produces= {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public UserRest updateUser(@PathVariable String userId,@RequestBody UpdateUserDetailsModelRequest updateUserDetailsModelRequest) {
	
		return userServices.updateUser(userId, updateUserDetailsModelRequest);
	}

	//delete user
	@DeleteMapping(path="/{id}")
	public ResponseEntity delateUser(@PathVariable String id) {
		userServices.delateUser(id);
		return ResponseEntity.noContent().build();
	}

}
