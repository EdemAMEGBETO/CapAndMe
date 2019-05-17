package com.capgemini.capAndMe.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import java.util.Timer;

@Entity
@Table(name = "EVENT")
@Data
public class Event implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "eventId")
    private Long id;
    @Column(name = "name", length = 60)
    private String name;
    @Column(name = "date")
    private Date date;
    @Column(name = "time")
    private Timer time;
    @Column(name = "location", length = 50)
    private String location;
    @Column(name = "detailInfo", length = 300)
    private String detail_info;
    @Column(name = "quantity")
    private Integer quantity;
    @Column(name = "statut", length = 1)
    private Integer statut;
    @Column(name = "latitude")
    private Float lat;
    @Column(name = "longitude")
    private Float lng;
    @Column(name = "createdAt")
    private Date created_at;
    @Column(name = "updatedAt")
    private Date updated_at;
    @Column(name = "deletedAt")
    private Date daleted_at;

    @OneToMany(mappedBy = "Event")
    private Set<UserEvent> userEvents;

    //Constructeur sans paramètre
    public Event() {
    }

    //Constructeur avec paramètre
    public Event(String name, Date date, Timer time, String location, String detail_info, Integer quantity, Integer statut, Float lat, Float lng, Date created_at, Date updated_at, Date daleted_at, Set<UserEvent> userEvents) {
        this.name = name;
        this.date = date;
        this.time = time;
        this.location = location;
        this.detail_info = detail_info;
        this.quantity = quantity;
        this.statut = statut;
        this.lat = lat;
        this.lng = lng;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.daleted_at = daleted_at;
        this.userEvents = userEvents;
    }
}
