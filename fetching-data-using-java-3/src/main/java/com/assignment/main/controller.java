package com.assignment.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

	@PostMapping("data")
	public String postmethod() {
		return "Santosh-testing-springboot";
	}
	@GetMapping("getdata")
	public String getmethod(@RequestBody String nation) {
		System.out.println(nation);
		
		return "testing get method : "+nation;
	}
}
