package com.github.aklin.inventive.controllers;

import com.github.aklin.inventive.services.IUserEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
public class UserController {

	private IUserEntryService userService;

	@Autowired
	public void setUserService(IUserEntryService userService) {
		this.userService = userService;
	}


	@RequestMapping("/users")
	public String listEntries(Model model) {
		model.addAttribute("user", userService.getCurrentlyLoggedIn());
		model.addAttribute("users", userService.listAll());
		return "content/users";
	}
}
