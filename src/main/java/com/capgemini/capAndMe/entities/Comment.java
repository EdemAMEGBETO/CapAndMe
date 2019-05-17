package com.capgemini.capAndMe.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "COMMENT")
@Data
public class Comment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CommentId")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "eventId")
    private Event event;

    @Column(name = "comment", length = 300)
    private String comment;
    @Column(name = "createdAt")
    private Date created_at;
    @Column(name = "updatedAt")
    private Date updated_at;

    //Constructeur sans paramètre
    public Comment() {
    }

    //Constructeur avec paramètre
    public Comment(User user, Event event, String comment, Date created_at, Date updated_at) {
        this.user = user;
        this.event = event;
        this.comment = comment;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }
}
