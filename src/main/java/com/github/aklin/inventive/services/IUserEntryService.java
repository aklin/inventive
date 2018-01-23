package com.github.aklin.inventive.services;

import com.github.aklin.inventive.domain.UserInterface;
import com.github.aklin.inventive.domain.concrete.users.User;

import java.util.List;

public interface IUserEntryService {

	public List<UserInterface> listAll();

	public UserInterface get(long id);

	public UserInterface getCurrentlyLoggedIn();
}
