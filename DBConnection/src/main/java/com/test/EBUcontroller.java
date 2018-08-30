package com.test;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EBUcontroller {
	
	@Autowired
	private EBUservice ebuservice;
	
	@RequestMapping(value = "/")
	public String retrieveEbuInfo() {
		return ebuservice.retrieveAll().toString();
	}

}
