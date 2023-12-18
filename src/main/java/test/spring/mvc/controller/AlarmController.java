package test.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import test.spring.mvc.service.AlarmService;

@Controller
@RequestMapping("/al/*")
public class AlarmController {
	
		@Autowired
		private AlarmService service;
	
		@RequestMapping("/main")
		public String main(Model model) {
			int count = service.alarmCount();
			model.addAttribute("count", count);
			return "alarm/main";
		}
		@RequestMapping("/alarm")
		public @ResponseBody String alarm() {
			return service.alarmCount()+"";
		}
}
