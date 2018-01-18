package com.github.aklin.inventive.services;

import com.github.aklin.inventive.domain.concrete.users.User;

import java.util.List;

public interface IUserEntryService {

	public List<User> listAll();

	public User get(long id);

	public User getCurrentlyLoggedIn();
}
