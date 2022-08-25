package com.nyota.jobcards.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nyota.jobcards.data.JobCategories;
import com.nyota.jobcards.data.repository.JobCategoryRepo;
import com.nyota.jobcards.model.User;
import com.nyota.jobcards.model.UserCreadentials;

@Controller
public class IndexController {


 @Autowired
 private JobCategoryRepo jcr;   
    
    @GetMapping ("/")
    public String index (Model model) {
        System.out.println ("The index controller is being called");
        model.addAttribute("userCredentials", new UserCreadentials());
        return ("index");
    }

    @PostMapping ("/loginUser")
    public String loginUser (@ModelAttribute User userCredentials, BindingResult errors, Model model) {
        JobCategories jc = new JobCategories();
        jc.setName("Installation");
        jc.setDescription("Where the installation needs to be performed");
        jcr.save(jc);
        return ("home");
    }    


}
