package com.xi.service;

import com.xi.bean.Person;
import com.xi.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by QAQ on 2016/8/22.
 */
@Service
public class PersonService {
    @Autowired
    private PersonDao person;
    public Person getPersonByName(String name) {
        return (person.getPersonByName(name));
    }
}
