package com.example.exambaha.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;


@Table( name = "user")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Setter(AccessLevel.NONE)
    @Getter

    private  int id ;
    private String email;
    private  String pwd ;

    private String fname ;
    private String lname;
    @Enumerated(EnumType.STRING)
    private Role role;

    @ManyToMany
    private List<Projet> projets;

    @OneToMany
    List<Projet> Projets;


}
