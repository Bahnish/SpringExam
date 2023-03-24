package com.example.exambaha.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Table( name = "projet")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Projet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Setter(AccessLevel.NONE)
    @Getter
    private int id ;
    private  String title ;

    private  String descreption;

    @ManyToMany(mappedBy = "projets")
    private List<User> userList;

    @OneToMany(mappedBy = "projets",cascade = CascadeType.PERSIST)
    private List<Sprint> sprintList;



}
