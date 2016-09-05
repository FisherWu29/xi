package com.xi.service;

import com.xi.mapper.PersonMapper;
import com.xi.model.Person;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by mayned on 2016/9/5.
 */
public class SpringMybitisSinglePersonMapper {
    private static ApplicationContext applicationContext;
    public static void main(String[] args) throws IOException {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring-mybatis.xml");
        PersonMapper personMapper = (PersonMapper)applicationContext.getBean("personMapper");
        Person person = personMapper.getPersonList();
        System.out.println(person);
    }


}
