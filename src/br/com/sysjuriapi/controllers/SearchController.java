package br.com.sysjuriapi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/search")
public class SearchController {
	@RequestMapping("/")
	public String login() {
		return "search.tiles";
	}
}
