package br.org.generation.exercicio01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")
public class Exercicio01Controller {
	@GetMapping
	public String Exercicio01() {
		
		return "Habilidades: Atenção aos detalhes e comunicação.\n"
				+ "\nMentalidades: Persistência e mentalidade de crescimento.";
		
		
	}

}
