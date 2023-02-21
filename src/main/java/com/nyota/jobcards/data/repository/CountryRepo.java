package com.nyota.jobcards.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.nyota.jobcards.data.entity.Country;

public interface CountryRepo extends CrudRepository <Country, Integer> {
    
    public Iterable<Country> findByCountryName (String countryName); 

    public Iterable<Country> findByCountryAbbreviation (String countryAbbreviation); 

}

