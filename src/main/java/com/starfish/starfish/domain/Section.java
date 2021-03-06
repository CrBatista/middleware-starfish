package com.starfish.starfish.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Data
@Entity(name = "SF_SECTION")
public class Section {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_SF_SECTION_ID")
    private Long id;

    @Column(name = "NAME", length = 80)
    private String name;

    @OneToMany(mappedBy = "squad", fetch = FetchType.LAZY)
    private Set<Card> cards;

}
