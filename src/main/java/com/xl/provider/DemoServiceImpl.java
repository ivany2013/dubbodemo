package com.xl.provider;

import com.xl.entity.User;
import com.xl.service.DemoService;

public class DemoServiceImpl implements DemoService{

	public String sayHello(String name) {
 		return "Hello " + name;
	}

	public User findUserById(Long id) {
		 User user = new User();
	        user.setId(id);
	        user.setName("Ricky");
	        user.setAge(26);
	        return user;
	        
	}
	
}
