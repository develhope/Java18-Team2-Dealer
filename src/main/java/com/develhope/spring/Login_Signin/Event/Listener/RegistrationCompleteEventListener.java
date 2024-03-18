package com.develhope.spring.Login_Signin.Event.Listener;

import com.develhope.spring.Login_Signin.Event.RegistrationCompleteEvent;
import com.develhope.spring.Login_Signin.UsersService;
import com.develhope.spring.User.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
@RequiredArgsConstructor
public class RegistrationCompleteEventListener implements ApplicationListener<RegistrationCompleteEvent> {
private final UsersService usersService;

	@Override
	public void onApplicationEvent(RegistrationCompleteEvent event) {

		User theUser = event.getUser();
		String verificationToken = UUID.randomUUID().toString();
		usersService.saveUsersVerificationToken(theUser, verificationToken);

		String url = event.getApplicationUrl() + "/register/verify-email?token=" + verificationToken;
		log.info("Click the link to verify your registration :  {}", url);
	}
}
