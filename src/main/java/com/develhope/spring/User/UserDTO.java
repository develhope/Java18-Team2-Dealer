package com.develhope.spring.User;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table
@Data
@Getter
@Setter
public class UserDTO {
    private User user;

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

    public UserDTO(Long id, UserEnum type, String name, String surname, Integer phoneNumber, String email) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public UserDTO() {
    }
}
