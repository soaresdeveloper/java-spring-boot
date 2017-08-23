package br.com.treinaweb.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	/**
	 * Action que retorna uma view
	 * 
	 * @RequestMapping = Rota para acessar a action
	 */

	@RequestMapping("/")
	public String hello(Model model) {
		model.addAttribute("mensagem", "Olá Spring Boot com Thymeleaf");
		return "index";
	}
}
