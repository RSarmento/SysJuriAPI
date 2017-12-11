package br.com.sysjuriapi.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.sysjuriapi.domains.Log;
import br.com.sysjuriapi.repositories.LogRepository;

@Controller
@RequestMapping("/create")
public class CreateController {
	
	@Autowired
	private LogRepository repository;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String create(Model model) {
		model.addAttribute("log", new Log());
		return "create.tiles";
	}
	
	//	Bellow, BindingResult must follow his Bean (@Valid) in order to work properly 
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String create(@ModelAttribute("log") @Valid Log newLog, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "create.tiles";
		}
		repository.save(newLog);
		return "redirct:/create/list";
	}
}
