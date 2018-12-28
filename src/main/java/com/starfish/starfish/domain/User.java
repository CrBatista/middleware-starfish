package com.starfish.starfish.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Data
@Entity(name = "SF_USER")
public class User {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_SF_USER_ID")
    private Long id;

    @NotNull
    @Column(name = "NAME", length = 80)
    private String name;

    @Email
    @NotNull
    @Column(name = "PASSWORD", length = 64)
    private String email;

    @Column(name = "SALT", length = 80)
    private String salt;

    @Column(name = "ACTIVE")
    private Boolean active;

    @ManyToMany
    @JoinTable(name = "SF_USER_SQUAD",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "SQUAD_ID"))
    private Set<Squad> squads;

    @ManyToMany
    @JoinTable(name = "SF_USER_ROLE",
            joinColumns = @JoinColumn(name = "USER_ID"),
            inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
    private Set<Role> roles;

    @OneToMany(mappedBy = "user")
    private Set<Card> cards;

}
