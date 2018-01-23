package com.github.aklin.inventive.domain.concrete.users;

import com.github.aklin.inventive.domain.UserInterface;

public class User implements UserInterface {

	private final long id;
	private final String login;
	private final String name;
	private final String surname;

	public User(long id, String login, String name, String surname) {
		this.id = id;
		this.login = login;
		this.name = name;
		this.surname = surname;
	}

	@Override
	public long getID() {
		return 0;
	}

	@Override
	public String getName() {
		return login;
	}

	@Override
	public String getFirstName() {
		return name;
	}

	@Override
	public String getLastName() {
		return surname;
	}

	@Override
	public String getFullName() {
		return getFirstName() + " " + getLastName();
	}
}
