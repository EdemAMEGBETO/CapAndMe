package com.capgemini.capAndMe.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "HOBBIE")
@Data
public class Hobbie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hobbieId")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name="iconLink", length = 100)
    private String icon_link;

    /*@OneToMany(mappedBy = "Hobbie")
    private Set<UserHobbie> userHobbies;*/

    //Constructeur sans paramètre
    public Hobbie() {
    }

    //Constructeur avec paramètre
    public Hobbie(String name, String icon_link) {
        this.name = name;
        this.icon_link = icon_link;
    }
}
