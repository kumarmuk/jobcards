package com.nyota.jobcards.data.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table (name = "job_card")
public class JobCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    
    private String title;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "job_categories", referencedColumnName = "id")
    private JobCategory jobCategory;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public JobCategory getJobCategory() {
        return jobCategory;
    }

    
    public void setJobCategory(JobCategory jobCategory) {
        this.jobCategory = jobCategory;
    }
    
    //private Customer customer;

}
