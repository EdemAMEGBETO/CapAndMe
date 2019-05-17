package com.capgemini.capAndMe.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "USER_EVENT")
@Data
public class UserEvent implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userEventId")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "hobbie_id")
    private Event event;

    @Column(name = "statut", length = 1)
    private Integer statut;


    //Constructeur sans paramètre
    public UserEvent() {
    }

    //Constructeur avec paramètre
    public UserEvent(User user, Event event, Integer statut) {
        this.user = user;
        this.event = event;
        this.statut = statut;
    }
}
