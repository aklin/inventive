package com.github.aklin.inventive.services;

import com.github.aklin.inventive.domain.inv.ItemInterface;

public interface ItemActionHandlerInterface {

	ItemInterface create(final ItemInterface candidate);

	ItemInterface update(final ItemInterface item);

}
