
package kr.ac.skuniv.realestate.domain.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "web_population_tbl")
public class Population {
    @Id
    private int id;

    private String code;

    private int population;

}

/*
    @OneToMany(fetch = FetchType.LAZY)
    private List<Forsale> forsales;*//*

}
*/
