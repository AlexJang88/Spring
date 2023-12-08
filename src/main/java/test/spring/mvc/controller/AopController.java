package test.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import test.spring.mvc.service.AopService;

@Controller
@RequestMapping("/aop/*")
public class AopController {
	
	@Autowired
	private AopService service;
	
	@RequestMapping("TEST")
	public @ResponseBody String test() {
		service.test();
		return "test";
	}
	
	
	
	
	
}
