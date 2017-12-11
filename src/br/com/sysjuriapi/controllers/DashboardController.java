package br.com.sysjuriapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.sysjuriapi.domains.Log;
import br.com.sysjuriapi.repositories.LogRepository;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {
	
	@Autowired
	private LogRepository repository;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String dashboard(Model model) {
		List<Log> logList = repository.findAll();
		model.addAttribute("logList", logList);
		return "dashboard.tiles";
	}
//	@RequestMapping(value="/list", method=RequestMethod.GET)
//	public t<String list(Model model) {
//		LisWhore> whores = repository.findAll();
//		model.addAttribute("whores", whores);
//		return "whore.list.tiles";
//	}
}
