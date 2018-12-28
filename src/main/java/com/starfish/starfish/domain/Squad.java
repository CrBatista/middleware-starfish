package com.starfish.starfish.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;

@Data
@Entity(name = "SF_SQUAD")
public class Squad {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_SF_SQUAD_ID")
    private Long id;

    @NotNull
    @Column(name = "NAME")
    private String name;

    @ManyToMany(mappedBy = "squads", fetch = FetchType.LAZY)
    private List<User> users;

    @OneToMany(mappedBy = "squad", fetch = FetchType.LAZY)
    private Set<Card> cards;
}
