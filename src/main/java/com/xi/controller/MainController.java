package com.xi.controller;

import com.xi.bean.Person_basic_info;
import com.xi.dao.PersonDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;


@Controller
public class MainController {
    PersonDao personDao = new PersonDao() ;
    @RequestMapping(value = "addPerson",method = RequestMethod.GET)
    public @ResponseBody void addPerson(String name) throws IOException{
        Person_basic_info person = personDao.findByName("阿喜");
        System.out.println(person);
//        //mybatis的配置文件
//        String resource = "mybatisConfig.xml";
//
//        //使用MyBatis提供的Resources类加载mybatis的配置文件（它也加载关联的映射文件）
//        Reader reader = Resources.getResourceAsReader(resource);
//        //构建sqlSession的工厂
//        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
//        //创建能执行映射文件中sql的sqlSession
//        SqlSession session = sessionFactory.openSession();
//        /**
//         * 映射sql的标识字符串，
//         * me.gacl.mapping.userMapper是userMapper.xml文件中mapper标签的namespace属性的值，
//         * getUser是select标签的id属性值，通过select标签的id属性值就可以找到要执行的SQL
//         */
//        //执行查询返回一个唯一user对象的sql
//        Person_basic_info person = session.selectOne("Person.findPersonByName", "阿喜");
//        System.out.println(person);
    }
}
