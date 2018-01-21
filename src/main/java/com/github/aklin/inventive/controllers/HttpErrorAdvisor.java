package com.github.aklin.inventive.controllers;

import com.github.aklin.inventive.services.IUserEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class HttpErrorAdvisor {
	private IUserEntryService userService;


	@Autowired
	public void setUserService(IUserEntryService userService) {
		this.userService = userService;
	}

	@ExceptionHandler(NoHandlerFoundException.class)
	public void handleError404(Model model) {
		model.addAttribute("user", userService.getCurrentlyLoggedIn());
//		return "error/404";
	}
}
