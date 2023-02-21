package com.nyota.jobcards.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="country")
public class Country {
    
    @Id
    @GeneratedValue
    private String id;
    
    @Column(name = "country_name")
    private String countryName;
    
    @Column(name = "country_abbreviation")
    private String countryAbbreviation;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getCountryName() {
        return countryName;
    }
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public String getCountryAbbreviation() {
        return countryAbbreviation;
    }
    public void setCountryAbbreviation(String countryAbbreviation) {
        this.countryAbbreviation = countryAbbreviation;
    }

}
