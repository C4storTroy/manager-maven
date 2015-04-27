package nz.co.c4stortroy.dao;

import java.util.HashMap;
import java.util.Map;

import nz.co.c4stortroy.manager.User;

public class UserDAO {

	private final static Map<String, User> USERS = new HashMap<>();
	static {
	    USERS.put("luciomoraes@gmail.com", new User("luciomoraes@gmail.com","lmoraes"));
	    USERS.put("suzanamelojor@gmail.com", new User("suzanamelojor@gmail.com","smoraes"));
	}

	public User searchByEmail(String email, String password) {
		if (!USERS.containsKey(email))
			return null;

		User user = USERS.get(email);
		if (user.getPassword().equals(password))
			return user;
		
		return null;
	}

}
