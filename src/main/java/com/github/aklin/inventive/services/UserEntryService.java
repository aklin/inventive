package com.github.aklin.inventive.services;

import com.github.aklin.inventive.domain.concrete.users.User;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserEntryService implements IUserEntryService {
	private Map<Long, User> users;

	public UserEntryService() {
		load();
	}

	@Override
	public List<User> listAll() {
		return new ArrayList<>(users.values());
	}

	@Override
	public User get(long id) {
		return users.get(id);
	}

	@Override
	public User getCurrentlyLoggedIn() {
		return users.get(new Random(users.size()));
	}

	private void load() {
		users = new HashMap<>();

		for (long i = 0; i < 20; i++) {
			users.put(i, new User(i, "Name " + 1, "Surname " + 1));
		}
	}
}
