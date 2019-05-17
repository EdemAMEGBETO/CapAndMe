package com.capgemini.capAndMe.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "USER_HOBBIE")
@Data
public class UserHobbie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userHobbieId")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "hobbie_id")
    private Hobbie hobbie;

    //Constructeur sans paramètre
    public UserHobbie() {
    }

    //Constructeur avec paramètre
    public UserHobbie(User user, Hobbie hobbie) {
        this.user = user;
        this.hobbie = hobbie;
    }
}
