package com.zensar.rest.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@SpringBootTest
@AutoConfigureMockMvc
public class HelloRestControllerTest {
	
	@Autowired					//enable autowiring for mock mvc test class must be annotated with 
	private MockMvc mock;		//Mock mvc is the class given by spring mvc to perform testing of spring controller
	
	@Test
	public void getmessageTest() throws Exception {
		mock
			.perform(MockMvcRequestBuilders.get("/Hello"))
			.andExpect(MockMvcResultMatchers.status().isOk())
			.andExpect(MockMvcResultMatchers.content().string("Welcome to ......................."));
	}
	
	@Test
	public void createMessageTest() throws Exception {
		mock 
			.perform(MockMvcRequestBuilders.post("/greet").content("Welcome"))
			.andExpect(MockMvcResultMatchers.status().isCreated())
			.andExpect(MockMvcResultMatchers.content().string("MessageCreated Welcome"));
	}
}
