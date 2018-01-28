package com.github.aklin.inventive.services;

import com.github.aklin.inventive.domain.inv.ItemInterface;

public interface ItemActionHandlerInterface {

	public ItemInterface create(ItemInterface candidate);

	public ItemInterface update(ItemInterface item);
}
