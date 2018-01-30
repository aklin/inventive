package com.github.aklin.inventive.controllers;

import com.github.aklin.inventive.services.ContainerServiceInterface;
import com.github.aklin.inventive.services.IUserEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContainerController {

	private final ContainerServiceInterface entryService;
	private final IUserEntryService userService;

	@Autowired
	public ContainerController(ContainerServiceInterface entryService, IUserEntryService userService) {
		this.userService = userService;
		this.entryService = entryService;
	}


	@RequestMapping("/containers")
	public String listEntries(Model model) {
		model.addAttribute("user", userService.getCurrentlyLoggedIn());
		model.addAttribute("containers", entryService.listAll());
		return "content/inv/containers";
	}

}
