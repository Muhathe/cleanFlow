package org.example;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@ToString
public class ProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false, length = 50)
    private String ism;

    @Column(name = "email",nullable = false,unique = true)
    private String email;

    @Column(name = "tel",nullable = false,unique = true)
    private String phone;

    @Column(name = "age",columnDefinition = "int check(age>=18)")
    private int age;

    @Column(name = "bio",columnDefinition = "text")
    private String bio;

    @Column(name = "birth_day")
    private LocalDate birthday;
}
