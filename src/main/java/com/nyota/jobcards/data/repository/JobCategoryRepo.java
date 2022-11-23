package com.nyota.jobcards.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.nyota.jobcards.data.entity.JobCategory;
public interface JobCategoryRepo extends CrudRepository <JobCategory, Integer> {
    
}
