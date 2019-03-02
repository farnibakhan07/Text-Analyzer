package com.assignment.textanalyzer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TextResource {
	
	@Autowired
	private TextDaoService service;
	
	@PostMapping("/analyze/")	
	
	public Text analyze(@RequestBody Text text) {
		Text result = service.save(text);
		return result;
	}
	
    


}
