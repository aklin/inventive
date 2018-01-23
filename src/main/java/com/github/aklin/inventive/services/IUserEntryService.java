package com.github.aklin.inventive.services;

import com.github.aklin.inventive.domain.inv.UserInterface;

import java.util.List;

public interface IUserEntryService {

	public List<UserInterface> listAll();

	public UserInterface get(long id);

	public UserInterface getCurrentlyLoggedIn();
}
