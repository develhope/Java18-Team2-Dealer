package com.develhope.spring;

import jakarta.persistence.*;

@Entity
@Table
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(nullable = false, name = "Nome")
	private String name;
	@Column(nullable = false, name = "Cognome")
	private String surname;
	@Column(nullable = false, name = "Tel.")
	private Integer phoneNumber;
	@Column(nullable = false, name = "E-Mail")
	private String email;
	@Column(nullable = false, name = "Password")
	private String password;


	public Admin(Long id, String name, String surname, Integer phoneNumber, String email, String password) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
	}

	public Admin() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
