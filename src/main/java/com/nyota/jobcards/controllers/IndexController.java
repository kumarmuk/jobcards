package com.nyota.jobcards.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nyota.jobcards.data.entity.Country;
import com.nyota.jobcards.data.entity.JobCard;
import com.nyota.jobcards.data.entity.JobCategory;
import com.nyota.jobcards.data.repository.JobCardRepo;
import com.nyota.jobcards.data.repository.JobCategoryRepo;
import com.nyota.jobcards.data.repository.CountryRepo;
import com.nyota.jobcards.model.User;
import com.nyota.jobcards.model.UserCreadentials;

@Controller
public class IndexController {


 @Autowired
 private JobCategoryRepo jcr;   

 @Autowired
 private CountryRepo cr;




 @Autowired
 private JobCardRepo jobCardRepo;
    
    @GetMapping ("/")
    public String index (Model model) {
        System.out.println ("The index controller is being called");
        model.addAttribute("userCredentials", new UserCreadentials());
        return ("index");
    }

    @PostMapping ("/loginUser")
    public String loginUser (@ModelAttribute User userCredentials, BindingResult errors, Model model) {
                Iterable<Country> countries = cr.findByCountryName("KENYA");
                for (Country country : countries) {
                  System.out.println (country.getCountryAbbreviation());  
                }  
        return ("home");
    }    


}
