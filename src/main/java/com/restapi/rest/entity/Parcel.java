package com.restapi.rest.entity;

import javax.persistence.*;

@Entity
@Table(name = "com.restapi.rest.entity.Parcel",schema = "funcreis")
public class Parcel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

