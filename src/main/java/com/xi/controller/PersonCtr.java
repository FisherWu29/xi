package com.xi.controller;

import com.xi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class PersonCtr {
//    @Autowired
//    private PersonService personService;

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public void getPersonByName(String name) {
        System.out.print("5");
    }
}
