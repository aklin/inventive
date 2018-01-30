package com.github.aklin.inventive.controllers;

import com.github.aklin.inventive.services.IUserEntryService;
import com.github.aklin.inventive.services.InventoryEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ItemEntryController {

	private InventoryEntryService entryService;
	private IUserEntryService userService;


	@Autowired
	public void setEntryService(InventoryEntryService entryService) {
		this.entryService = entryService;
	}

	@Autowired
	public void setUserService(IUserEntryService userService) {
		this.userService = userService;
	}

	@RequestMapping("/items")
	public String listEntries(Model model) {
		model.addAttribute("user", userService.getCurrentlyLoggedIn());
		model.addAttribute("items", entryService.listAll());
		return "content/inv/items";
	}

	@RequestMapping("/items/{id}")
	public String listEntry(@PathVariable long id, Model model) {
		model.addAttribute("user", userService.getCurrentlyLoggedIn());
		model.addAttribute("items", entryService.listAll());
		model.addAttribute("item", entryService.get(id));
		return "content/inv/item";
	}
}
