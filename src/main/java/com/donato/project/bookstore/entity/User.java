package com.donato.project.bookstore.entity;

import com.donato.project.bookstore.enumerator.UserRoleEnumerator;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "user")
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    @Column(name = "username")
    private String username;

    @Setter
    @Column(name = "email")
    private String email;

    @Setter
    @Column(name = "passwrd")
    private String password;

    @Setter
    @Column(name = "role")
    private UserRoleEnumerator userRole;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Cart cart;

}
