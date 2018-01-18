package com.github.aklin.inventive.services;

import com.github.aklin.inventive.domain.InventoryEntry;
import com.github.aklin.inventive.domain.concrete.ItemEntry;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ItemEntryService implements InventoryEntryService {
	private Map<Long, InventoryEntry> entries;


	public ItemEntryService() {
		load();
	}

	@Override
	public List<InventoryEntry> listAll() {
		return new ArrayList<>(entries.values());
	}

	@Override
	public InventoryEntry get(long id) {
		return entries.get(id);
	}

	private void load() {
		entries = new HashMap<>();


		for (long i = 1; i < 15; i++) {
			entries.put(i, new ItemEntry(i, "Item " + i, "This is item number " + i));
		}


	}
}
