package com.junda;

import com.junda.pojo.entity.UserEntity;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import javax.annotation.Resource;

@SpringBootTest
class JunDaApplicationTests {
	@Resource
	private MongoTemplate mongoTemplate;
//	@Test
//	void addUser() {
//		UserEntity user = new UserEntity();
//		user.setDelFlag("ddd");
//		mongoTemplate.save(user);
//		System.out.println("user = " + user);
//	}

}
