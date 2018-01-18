package com.github.aklin.inventive.services;

import com.github.aklin.inventive.domain.InventoryEntry;

import java.util.List;

public interface InventoryEntryService {

	public List<InventoryEntry> listAll();

	public InventoryEntry get(long id);
}
