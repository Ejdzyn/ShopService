package com.Ejdzyn.Shop.entity;

import com.Ejdzyn.Shop.enums.UserType;
import lombok.*;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(
            unique = true,
            nullable = false
    )
    private String email;

    private UserType type = UserType.USER;


}
