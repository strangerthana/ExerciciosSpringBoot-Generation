package br.org.generation.exercicio01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class exercicio02 {
	
	@GetMapping
	public String Exercicio02() {
		
		return "Espero entender o Spring e conseguir acompanhar a turma.";
		
		
	}
	

}
