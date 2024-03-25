package com.develhope.spring.User;

import com.develhope.spring.Vehicles.EntityofVehicles.Vehicles;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

//Vehicle,
@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Enumerated(EnumType.STRING)
	@Column(nullable = false, name = "type_user")
	private UserEnum type;
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
