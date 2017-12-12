package br.com.sysjuriapi.controllers;

import java.util.List;

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
@RequestMapping(value="/log")
public class LogController {
	
	@Autowired //Also known as CDI
	private LogRepository repository;
	
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String listAll(Model model) {
		List<Log> logList=repository.findAll();
		model.addAttribute("logList",logList);
		return "log.list.tiles";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String create(Model model) {
		model.addAttribute("log",new Log());
		return "log.create.tiles";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String create(@ModelAttribute("log") @Valid Log newLog, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "log.create.tiles";
		}
		repository.save(newLog);
		return "redirect:/log/list";
	}
	
//	TODO: Find a way to pass a Log object to repository's interface
//	@RequestMapping(value="/search", method=RequestMethod.GET)
//	public String search(Model model) {
//		model.addAttribute("log", new Log());
//		return "log.search.tiles";
//	}
//	
//	@RequestMapping(value="/search", method=RequestMethod.POST)
//	public String search(@ModelAttribute("log") @Valid Log searchedLog, BindingResult result, Model model) {
//		if(result.hasErrors()) {
//			return "log.search.tiles";
//		}
//		List<Log> logList=repository.findByTerms(searchedLog);
//		model.addAttribute("logList", logList);
//		return "log.search.tiles";
//	}



}
