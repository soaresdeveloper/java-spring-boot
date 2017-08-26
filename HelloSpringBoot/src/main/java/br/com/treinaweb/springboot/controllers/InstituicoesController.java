package br.com.treinaweb.springboot.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.treinaweb.springboot.entidades.Instituicao;
import br.com.treinaweb.springboot.repositorios.RepositorioInstituicao;

@Controller
@RequestMapping("/instituicoes")
public class InstituicoesController {
	
	@Autowired
	private RepositorioInstituicao repositorioInstituicao;
	
	@GetMapping("/index")
	public ModelAndView index(){
		ModelAndView resultado = new ModelAndView("instituicoes/index");
		List<Instituicao> instituicoes = repositorioInstituicao.findAll();
		if (instituicoes == null) {
			instituicoes = new ArrayList<Instituicao>();
		}
		resultado.addObject("instituicoes", instituicoes);
		return resultado;
	}
}
