package com.develhope.spring.Login_Signin;

import com.develhope.spring.Login_Signin.Event.RegistrationCompleteEvent;
import com.develhope.spring.User.User;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/register")
public class RegistrationController {

	private final UsersService usersService;
	private ApplicationEventPublisher publisher;

	@PostMapping
	public String registerUser(RegistrationRequest registrationRequest, final HttpServletRequest request){
		User user = usersService.registerUser(registrationRequest);
		publisher.publishEvent(new RegistrationCompleteEvent(user, applicationUrl(request)));
		return "Success! Check your E-Mail to complete the registration";
	}

	public String applicationUrl(HttpServletRequest request) {
		return "http://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
	}
}
