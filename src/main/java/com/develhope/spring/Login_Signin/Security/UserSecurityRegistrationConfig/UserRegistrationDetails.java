package com.develhope.spring.Login_Signin.Security.UserSecurityRegistrationConfig;

import com.develhope.spring.User.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UserRegistrationDetails implements UserDetails {

	private String userName;
	private String password;
	private boolean isEnabled;
	private List<GrantedAuthority> authorities;

	public UserRegistrationDetails(User user) {
		this.userName = user.getEmail();
		this.password = user.getPassword();
		this.isEnabled = user.isEnabled();
		this.authorities = Arrays.stream(user.getRole()
						.toString()
						.split(","))
				.map(SimpleGrantedAuthority::new)
				.collect(Collectors.toList());
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public String getPassword() {
		return null;
	}

	@Override
	public String getUsername() {
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}

	@Override
	public boolean isEnabled() {
		return false;
	}
}
