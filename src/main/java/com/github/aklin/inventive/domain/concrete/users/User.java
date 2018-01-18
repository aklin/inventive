package com.github.aklin.inventive.domain.concrete.users;

import com.github.aklin.inventive.domain.Identifiable;

public class User implements Identifiable {


	private final long id;
	private final String name;
	private final String surname;

	public User(long id, String name, String surname) {
		this.id = id;
		this.name = name;
		this.surname = surname;
	}

	@Override
	public long getID() {
		return 0;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getFullName() {
		return getName() + " " + getSurname();
	}
}
