package com.github.aklin.inventive.domain.concrete.users;

import com.github.aklin.inventive.domain.UserGroupInterface;
import com.github.aklin.inventive.domain.UserInterface;
import com.github.aklin.inventive.domain.core.Hierarchical;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.*;

public class Group implements UserGroupInterface {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private final long id;
	private final String name;
	private final String description;
	private final Group parent;
	private final Map<Long, UserInterface> users;

	public Group(long id, String name, String description, Group parent, Collection<UserInterface> users) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.parent = parent;

		this.users = users == null ? new HashMap<>(8) : populateUsers(users);
	}

	private Map<Long, UserInterface> populateUsers(Collection<UserInterface> in) {
		final Map<Long, UserInterface> map = new HashMap<>(in.size());

		for (final UserInterface user : in) {
			map.put(user.getID(), user);
		}

		return map;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public Hierarchical getParent() {
		return parent;
	}

	@Override
	public long getID() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public List<UserInterface> listAll() {
		return new ArrayList<>(users.values());
	}

	@Override
	public UserInterface get(long id) {
		return users.get(id);
	}

	@Override
	public UserInterface getCurrentlyLoggedIn() {
		throw new UnsupportedOperationException();
	}
}
