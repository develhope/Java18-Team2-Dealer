package com.develhope.spring.Login_Signin;

import com.develhope.spring.Login_Signin.Exeption.UserAlreadyExistsException;
import com.develhope.spring.Login_Signin.Security.UserSecurityRegistrationConfig.Token.VerificationToken;
import com.develhope.spring.Login_Signin.Security.UserSecurityRegistrationConfig.Token.VerificationTokenRepository;
import com.develhope.spring.User.User;
import com.develhope.spring.User.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsersService implements IUserService {

	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;
	private final VerificationTokenRepository verificationTokenRepository;

	@Override
	public List<User> getUser() {
		return userRepository.findAll();
	}

	@Override
	public User registerUser(RegistrationRequest request) {
		Optional<User> user = this.findByEmail(request.email());

		if (user.isPresent()){
			throw new UserAlreadyExistsException("User with email " + request.email() + "already exists");
		}
		var newUser = new User();
		newUser.setName(request.name());
		newUser.setSurname(request.surname());
		newUser.setEmail(request.email());
		newUser.setPassword(passwordEncoder.encode(request.password()));
		newUser.setRole(request.role());
		return userRepository.save(newUser);
	}

	@Override
	public Optional<User> findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public void saveUsersVerificationToken(User theUser, String token) {

		var verificationToken = new VerificationToken(token, theUser);
		verificationTokenRepository.save(verificationToken);

	}
}
