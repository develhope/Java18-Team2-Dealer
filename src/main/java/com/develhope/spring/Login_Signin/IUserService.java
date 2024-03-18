package com.develhope.spring.Login_Signin;

import com.develhope.spring.User.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {

	List<User> getUser();
	User registerUser (RegistrationRequest request);

	Optional<User> findByEmail(String email);

	void saveUsersVerificationToken(User theUser, String verificationToken);
}
