package com.soctest.agendarExames.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.soctest.agendarExames.model.Exame;
import com.soctest.agendarExames.service.ExameService;

@Controller
public class ExameController {

	@Autowired
	private ExameService exameService;
	
	//mostra lista de Exames
	@GetMapping("/")
	public String ViewHomePage(Model model) {
		model.addAttribute("listaExames",exameService.getAllExames());
		return "index";
	}
	
	//request para botão de agendar exame
	@GetMapping("/agendaExame")
	public String agendaExame(Model model) {
		Exame exame = new Exame();
		model.addAttribute("exame", exame);
		return "agendamentoExame";
	}
	
	//Post para salvar a adição de Exame
	@PostMapping("/salvarExame")
	public String salvarExame(@ModelAttribute("exame") Exame exame) {
		//Salva na base
		exameService.salvarExame(exame);
	return "redirect:/";
	}
	
	//mapeamento da tag para atualizar o id desejado
	@GetMapping("/atualizarExame/{id}")
	public String atualizarExame(@PathVariable (value = "id")long id, Model model) {
		//pega o Exame do ExameService
		Exame exame = exameService.getExameById(id);
		//seta exame como model para pre adicionark no formulario
		model.addAttribute("exame", exame);
		return "atualizaExame";
	}
	
	
	@GetMapping("/deletarExame/{id}")
	public String deleteExame(@PathVariable (value = "id") long id) {
		//chama o metodo de deletar exame
	this.exameService.deleteExameById(id);
	return "redirect:/";
		
	}
	
	
}
