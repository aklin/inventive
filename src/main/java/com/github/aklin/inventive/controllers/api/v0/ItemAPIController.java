package com.github.aklin.inventive.controllers.api.v0;

import com.github.aklin.inventive.domain.inv.ItemInterface;
import com.github.aklin.inventive.services.InventoryEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v0/items")
public class ItemAPIController {

	private InventoryEntryService entryService;

	@Autowired
	public void setEntryService(InventoryEntryService entryService) {
		this.entryService = entryService;
	}

	@RequestMapping(value = {"/", ""})
	public List<ItemInterface> index() {
		return entryService.listAll();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ItemInterface get(@PathVariable long id) {
		return entryService.get(id);
	}

	@RequestMapping(value = "/", method = RequestMethod.PUT)
	public ItemInterface create(@RequestBody ItemInterface item) {

		return item;
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ItemInterface update(@RequestBody ItemInterface item) {

		return item;
	}
}
