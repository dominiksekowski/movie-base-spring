package com.domseko.moviebasespring.domain;

import javax.persistence.*;

@Entity
public class Biography {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String notes;

    @OneToOne
    private Actor actor;



/////////////////////////////////////////


    public Biography(Long id, String notes, Actor actor) {
        this.id = id;
        this.notes = notes;
        this.actor = actor;
    }



    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
