package com.nyota.jobcards.data.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "city")
public class City {


    @Id
    @GeneratedValue
    private String id;

    @Column (name="city_name")
    private String city_name;

    @ManyToOne
	//@JoinColumn(name = "person_id",
	//		foreignKey = @ForeignKey(name = "PERSON_ID_FK")
	//)
	private Country country;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }


    }
