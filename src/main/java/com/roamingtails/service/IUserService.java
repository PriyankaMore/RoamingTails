package com.roamingtails.service;

import com.roamingtails.model.request.UserProfileRequest;
import com.roamingtails.model.response.UserProfileResponse;

public interface IUserService {
	public UserProfileResponse createUser(UserProfileRequest request);
}
