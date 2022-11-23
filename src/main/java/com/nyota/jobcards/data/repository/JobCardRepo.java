package com.nyota.jobcards.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.nyota.jobcards.data.entity.JobCard;

public interface JobCardRepo extends CrudRepository <JobCard, Integer> {
    
}
