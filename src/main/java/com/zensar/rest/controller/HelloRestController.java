package com.zensar.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//Writting test case for every peice business code including spring controller is mandate

@RestController
public class HelloRestController {
	@GetMapping("/Hello")
	public String getmessage() {
		System.out.println("Testing Hello");
	return "Welcome to .......................";
	}
	
	@PostMapping("/greet")
	public ResponseEntity<String> createMessage(@RequestBody String message) {
		return new ResponseEntity<String>("MessageCreated "+message, HttpStatus.CREATED);
	}
	}
