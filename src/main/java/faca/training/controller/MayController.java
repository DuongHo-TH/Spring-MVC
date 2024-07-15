package faca.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;

import faca.training.bean.May;
import faca.training.service.MayServices;


public class MayController {
	@Autowired
	private MayServices service;

	@PostMapping("/savemay")
	public String saveMay(Model model, @RequestAttribute("may") May may) {
		service.persitst(may);
		return "/trang-chu";
	}
}
