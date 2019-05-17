package com.capgemini.capAndMe.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user")
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId")
    private Long id;
    @Column(name = "firstName", length = 60, nullable = false)
    private String firstName;
    @Column(name = "lastName", length = 60, nullable = false)
    private String lastName;
    @Column(name = "company", length = 60)
    private String company;
    @Column(name = "location", length = 60)
    private String location;
    @Column(name = "latitude")
    private Float latitude;
    @Column(name = "longitude")
    private Float longitude;
    @Column(name = "email",length = 50, unique = true)
    private String email;
    @Column(name = "password", length = 50)
    private String password;
    @Column(name = "validate", length = 30)
    private String validate;
    @Column(name = "avatarLink", length = 100)
    private String avatar_link;
    @Column(name = "createdAt")
    private Date created_at;
    @Column(name = "updatedAt")
    private Date updated_at;

    /*@OneToMany(mappedBy = "User", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<UserHobbie> userHobbies;*/

    @OneToMany(mappedBy = "User", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<UserEvent> userEvents;

    @OneToMany(mappedBy = "User", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Comment> comments;

    @ManyToMany
    @JoinTable(
            name = "UserHobbie",
            joinColumns = @JoinColumn(name = "userId", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "hobbieId", referencedColumnName = "id")
    )
    private List<Hobbie> hobbies;


    //Constructeur sans parametre
    public User() {
    }

    //Constructeur avec parametre


    public User(String firstName, String lastName, String company, String location, Float latitude, Float longitude, String email, String password, String validate, String avatar_link, Date created_at, Date updated_at, Set<UserEvent> userEvents, Set<Comment> comments, List<Event> events) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.location = location;
        this.latitude = latitude;
        this.longitude = longitude;
        this.email = email;
        this.password = password;
        this.validate = validate;
        this.avatar_link = avatar_link;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.userEvents = userEvents;
        this.comments = comments;
        this.hobbies = hobbies;
    }
}
