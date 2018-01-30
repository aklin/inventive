package com.github.aklin.inventive.services;

import com.github.aklin.inventive.domain.inv.ItemInterface;

import java.util.List;

public interface InventoryEntryService {

	List<ItemInterface> listAll();

	ItemInterface get(long id);

	/**
	 * Added in lieu of persistence. Remove once persistence layer is up.
	 *
	 * @param item
	 * @return
	 */
	@Deprecated
	InventoryEntryService add(final ItemInterface item);
}
