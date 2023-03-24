package com.example.exambaha.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Table( name = "sprint")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Sprint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Setter(AccessLevel.NONE)
    @Getter

    private  int id ;

    private String descreption ;

    private Date startDate;

    @ManyToOne
    private Projet projets;


}
