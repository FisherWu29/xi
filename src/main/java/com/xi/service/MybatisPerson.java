package com.xi.service;

import com.xi.model.Person;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by mayned on 2016/9/5.
 */
public class MybatisPerson {
    public static void main(String[] args) throws IOException{
        String resource = "mybatis-config.xml";
        InputStream inputStream = org.apache.ibatis.io.Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Person person = sqlSession.selectOne("Person.getPersonList");
        System.out.println(person);
        sqlSession.close();
    }

}
