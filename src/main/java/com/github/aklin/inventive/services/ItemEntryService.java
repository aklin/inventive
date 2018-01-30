package com.github.aklin.inventive.services;

import com.github.aklin.inventive.domain.concrete.inventory.v0.item.ItemEntry;
import com.github.aklin.inventive.domain.inv.ItemInterface;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ItemEntryService implements InventoryEntryService {
	private Map<Long, ItemInterface> entries;


	public ItemEntryService() {
		load();
	}

	@Override
	public List<ItemInterface> listAll() {
		return new ArrayList<>(entries.values());
	}

	@Override
	public ItemInterface get(long id) {
		return entries.get(id);
	}

	@Override
	public InventoryEntryService add(final ItemInterface item) {
		entries.put(item.getID(), item);
		return this;
	}

	private void load() {
		entries = new HashMap<>();


		for (long i = 1; i < 15; i++) {
			entries.put(i, new ItemEntry(i, "Item " + i, "This is item number " + i));
		}


	}
}
