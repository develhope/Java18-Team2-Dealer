package com.develhope.spring.Login_Signin;

import com.develhope.spring.User.UserEnum;
import jakarta.persistence.Column;

public record RegistrationRequest(String name, String surname, Integer phoneNumber,
                                  String email, String password, UserEnum role) {
}
