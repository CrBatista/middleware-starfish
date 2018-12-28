package com.starfish.starfish.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Data
@Entity(name = "SF_AUTHORITY")
public class Authority {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "NAME", length = 80)
    private String name;

    @ManyToMany(mappedBy = "authorities", fetch = FetchType.LAZY)
    private Set<Role> roles;

}
