package com.example.stock.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeroController {

	@RequestMapping(value = "/firstAPI")
	public ResponseEntity<Object> firstAPI(){
		return new ResponseEntity<Object>("HELLO WORLD", HttpStatus.OK);
	}
}
