package com.github.mathan26.petclinic.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class OwnerController {
    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwners(){
        return "owners/index";
    }
}
