package com.roamingtails.service.impl;

import org.springframework.stereotype.Service;

import com.roamingtails.model.request.UserProfileRequest;
import com.roamingtails.model.response.UserProfileResponse;
import com.roamingtails.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Override
	public UserProfileResponse createUser(UserProfileRequest request) {
		return new UserProfileResponse();
	}

}
