package com.dhanjyothi.service.impl;

import org.springframework.stereotype.Service;
import com.dhanjyothi.model.User;
import com.dhanjyothi.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	public int validateUser(User user) {
		return 1;
	}

}
