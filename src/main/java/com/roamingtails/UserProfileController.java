package com.roamingtails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.roamingtails.model.UserProfile;
import com.roamingtails.model.request.UserProfileRequest;
import com.roamingtails.model.response.UserProfileResponse;
import com.roamingtails.service.IUserService;

@RestController
@RequestMapping("/user")
public class UserProfileController {
	@Autowired
	IUserService userService;

	@RequestMapping(method=RequestMethod.POST,path="/create")
	public UserProfileResponse createUserProfile(@RequestBody UserProfileRequest request){
		// how to use spring validations
		// how to use spring logging log4j
		System.out.println(request);
		return userService.createUser(request);
	}
}
