package com.nyota.jobcards.data.repository;

import org.springframework.data.repository.CrudRepository;
import com.nyota.jobcards.data.JobCategories;
public interface JobCategoryRepo extends CrudRepository <JobCategories, Integer> {
    
}
