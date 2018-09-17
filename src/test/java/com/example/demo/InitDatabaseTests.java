package com.example.demo;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;

import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DemoApplication.class)
@Sql("/init-schema.sql")
public class InitDatabaseTests {

	@Autowired
	 UserDao userDao;
	@Test
	public void contextLoads() {

		for(int i=0;i<10;i++){
			User user=new User();
			user.setName(String.format("name%d",i));
			user.setSalt(" ");
			user.setPassword("");
			user.setHeadUrl("");
			userDao.addUser(user);

		}

	}

}
