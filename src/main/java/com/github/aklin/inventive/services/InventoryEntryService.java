package com.github.aklin.inventive.services;

import com.github.aklin.inventive.domain.inv.ItemInterface;

import java.util.List;

public interface InventoryEntryService {

	public List<ItemInterface> listAll();

	public ItemInterface get(long id);
}
