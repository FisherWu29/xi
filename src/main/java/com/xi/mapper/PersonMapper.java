package com.xi.mapper;

import com.xi.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mayned on 2016/9/3.
 */
public interface PersonMapper {
    Person getPersonList();

    List<Person> getPersonList1();
}
