package com.xi.controller;

import com.xi.model.Person;
//import com.xi.service.PersonService;
import com.xi.service.PersonService2;
//import com.xi.service.impl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@Controller
@RequestMapping(value = "/")
public class PersonController {
    @Autowired
    PersonService2 personService2;
    @RequestMapping(value = "/index")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("name", "吴福喜");
        return mv;
    }

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    @ResponseBody
    public HashMap<String, Person> person() {
        HashMap<String, Person> personStringList = new HashMap<String, Person>();
        Person person = new Person();
        personStringList.put("吴福喜", person);
        return personStringList;
    }

    @RequestMapping(value = "/person2", method = RequestMethod.GET)
    @ResponseBody
    public List<Person> getPersonList() {
        List<Person> personList = personService2.getPersonList();
        return personList;
    }
}

