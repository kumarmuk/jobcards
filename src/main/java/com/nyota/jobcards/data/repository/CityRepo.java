package com.nyota.jobcards.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.nyota.jobcards.data.entity.City;

public interface CityRepo extends CrudRepository <City, Integer> {
    
}
