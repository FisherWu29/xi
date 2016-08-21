package com.xi.dao;

import com.xi.bean.Person_basic_info;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * Created by QAQ on 2016/8/19.
 */
public class PersonDao extends SqlSessionDaoSupport{
    public Person_basic_info findByName(String name){
        return (Person_basic_info) this.getSqlSession().selectOne("Person.findPersonByName",name);
    }
}
