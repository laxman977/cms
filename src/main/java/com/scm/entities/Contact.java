package com.scm.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Contact {

    @Id
    private String id;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private  String picture;

    @Column(length = 1000)
    private String decription;
    private boolean favorite=false;
    private String websiteLink;
    private String linkedInLink;

  //  private List<> socialLinks =new ArrayList<>();
    @ManyToOne
    @JsonIgnore
    private User user;

    @OneToMany(mappedBy = "contact",cascade = CascadeType.ALL,fetch = FetchType.EAGER,orphanRemoval = true)
    private List<SocialLink> socialLinks = new ArrayList<>();
}
