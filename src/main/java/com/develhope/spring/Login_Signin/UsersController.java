package com.develhope.spring.Login_Signin;

import com.develhope.spring.User.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UsersController {

	private final UsersService usersService;

	@GetMapping
	public List<User> getUser(){
		return usersService.getUser();

	}
}
