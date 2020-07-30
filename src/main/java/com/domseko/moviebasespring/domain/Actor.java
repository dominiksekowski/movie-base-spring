package com.domseko.moviebasespring.domain;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "actor")
public class Actor  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "age")
    private Integer age;

    @Column(name = "birth_date")
    private Integer birthDate;

    @Column(name = "birth_place")
    private String birthPlace;

    @Column(name = "growth")
    private Integer growth;


    @OneToOne
    private Biography biography;



/////////////////////////////////////////





}
