package com.develhope.spring;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAdmin;
	@Column(nullable = false, name = "nome")
	private String name;
	@Column(nullable = false, name = "cognome")
	private String surname;
	@Column(nullable = false, name = "cellulare")
	private Integer phoneNumber;
	@Column(nullable = false, name = "email")
	private String email;
	@Column(nullable = false, name = "password")
	private String password;
}
