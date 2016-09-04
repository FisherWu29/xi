package com.xi.mapper;

import com.xi.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by mayned on 2016/9/3.
 */
@Repository
public interface PersonMapper {
    List<Person> getPersonList();
}
