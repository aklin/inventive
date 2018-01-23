package com.github.aklin.inventive.controllers.api.v0;

import com.github.aklin.inventive.domain.InventoryEntry;
import com.github.aklin.inventive.services.InventoryEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api/v0/items")
public class ItemAPIController {

	private InventoryEntryService entryService;

	@Autowired
	public void setEntryService(InventoryEntryService entryService) {
		this.entryService = entryService;
	}

	@RequestMapping(value = {"/", ""})
	public List<InventoryEntry> index() {
		return entryService.listAll();
	}
}
