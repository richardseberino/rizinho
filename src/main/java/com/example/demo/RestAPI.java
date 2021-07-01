package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestAPI {

	@GetMapping("/teste/hello/{nome}")
	public String hello(@PathVariable String nome)
	{
		return "Ola " + nome;
	}
	
}
