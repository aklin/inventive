package com.github.aklin.inventive.domain.concrete.inventory;

import com.github.aklin.inventive.domain.core.Locatable;
import com.github.aklin.inventive.domain.TypeInterface;

public class TypeEntry implements TypeInterface {
	private final TypeInterface parent;
	private final long id;

	public TypeEntry(long id, TypeInterface parent) {
		this.parent = parent;
		this.id = id;
	}

	@Override
	public Locatable getParent() {
		return null;
	}

	@Override
	public long getID() {
		return id;
	}

	@Override
	public String getDescription() {
		return null;
	}

	@Override
	public String getName() {
		return null;
	}
}
