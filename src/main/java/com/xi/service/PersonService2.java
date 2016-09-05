package com.xi.service;

import com.xi.mapper.PersonMapper;
import com.xi.model.Person;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by mayned on 2016/9/4.
 */
@Resource
public class PersonService2 {
    @Autowired
    PersonMapper personMapper;

    public List<Person> getPersonList1() {
        List<Person> personList = personMapper.getPersonList1();
        return personList;
    }
}
