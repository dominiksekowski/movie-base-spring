package com.domseko.moviebasespring.domain;

import lombok.*;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "biography")
public class Biography {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "notes")
    @Lob
    private String notes;

    @OneToOne
    private Actor actor;



/////////////////////////////////////////

}
