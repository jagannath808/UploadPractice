package com.appsdeveloper.app.webServices.ui.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsdeveloper.app.webServices.ui.UserRepository.UserRepository;
import com.appsdeveloper.app.webServices.ui.io.Entity.UserEntity;
import com.appsdeveloper.app.webServices.ui.shared.dto.UserDto;

@Service
public class UserServiceImp  implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	
	public UserDto createUser(UserDto userDto) {
		// TODO Auto-generated method stub
		
		UserEntity userEntity= new UserEntity();
		BeanUtils.copyProperties(userDto, userEntity);
		
		userEntity.setEncryptedPassword("testPassword");
		userEntity.setUserId("TsetUserID");
		
		UserEntity storeUserEntity= userRepository.save(userEntity);
		
		UserDto userDtos = new UserDto();
		BeanUtils.copyProperties(storeUserEntity, userDtos);
		
		
		return userDtos;
	}
	
	
}
