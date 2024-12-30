package com.scm.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "users")
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    @Id
    private String userId;

    @Column(name = "user_name", nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;
    private String password;
    private String phoneNumber;

    @Column(columnDefinition = "TEXT",length = 1000)
    private String about;
    @Column(length = 1000)
    private String profilePic;
    private boolean enabled =false;
    private boolean emailVerified = false;
    private boolean phoneVerified = false;

    // SELF ,GOOGLE , FACEBOOK
    private Providers provider =Providers.SELF;
    private String providerUserId;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL,fetch = FetchType.LAZY,orphanRemoval = true)
    private List<Contact> contacts = new ArrayList<>();


}
