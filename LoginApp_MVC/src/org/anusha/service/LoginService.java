package org.anusha.service;

import java.util.HashMap;

import org.anusha.dto.User;

public class LoginService {
	HashMap<String, String> users = new HashMap<String, String>();
	public LoginService(){
		users.put("Anusha", "Avanesh");
		users.put("Prathyusha", "Maneesha");
		users.put("kavitha", "Ankitha");

		
	}
	public boolean authenticate(String userId, String password) {
		if (password == null || password.trim()==""){
			return false;
		}
		return true;
		
	}
	public User getUserDetails(String userId){
		User user = new User();
		user.setUserName(users.get(userId));
		user.setUserId(userId);
		return user;
		
	}

}
 