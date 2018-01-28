package com.github.aklin.inventive.controllers.api.v0;

import com.github.aklin.inventive.domain.inv.ItemBuilderInterface;
import com.github.aklin.inventive.domain.inv.ItemInterface;
import com.github.aklin.inventive.services.ItemEntryService;
import org.springframework.beans.factory.annotation.Autowired;

public class ItemActionHandler {

	private final ItemBuilderInterface builder;
	private final ItemEntryService service;

	@Autowired
	public ItemActionHandler(ItemBuilderInterface builder, ItemEntryService service) {
		this.builder = builder;
		this.service = service;
	}

	public ItemInterface create(final ItemInterface candidate) {
		final ItemInterface newItem = builder.from(candidate)
				.setID(0) //Ensure ID is 0
				.create();

		//TODO persist item

		return newItem;
	}


	public ItemInterface update(final ItemInterface item) {
		final ItemInterface old = service.get(item.getID());
		final ItemInterface modified;

		if (old == null) { //not found
			return null;
		}

		//TODO check permissions
		modified = builder.from(item).setID(old.getID()).create();

		return modified;
	}

}
