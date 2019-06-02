package com.spring.registry;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("test-controller")
@RestController
public class TestController {
	
	
	@RequestMapping("/test")
	public String testController() {
		return "Test Controller Works";
	}

}
