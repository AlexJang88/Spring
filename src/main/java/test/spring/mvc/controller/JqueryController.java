package test.spring.mvc.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;

import test.spring.mvc.bean.TestDTO;

@Controller
@RequestMapping("/js/*")
public class JqueryController {
	@RequestMapping("test01")
	public String ajax01() {
		return "1215/ajax01";
	}
	@RequestMapping("test02")
	public String ajax02() {
		return "1215/ajax02";
	}
	@RequestMapping("test03")
	public String ajax03() {
		return "1215/ajax03";
	}
	@RequestMapping("test04")
	public String ajax04() {
		return "1215/ajax04";
	}
	@RequestMapping("json")
	public String json() {
		return "1215/ajax05";
	}
	@RequestMapping("test05")
	public @ResponseBody TestDTO ajax05() {
		TestDTO dto = new TestDTO();
		dto.setId("java");
		dto.setName("oracle");
		dto.setDay(new Date());
		return dto;
	}
	@RequestMapping("test06")
	public @ResponseBody String ajax06() throws Exception{
		ObjectMapper om = new ObjectMapper();
		String js ="{\"id\":\"java\",\"name\":\"oracle\"}";
		TestDTO dto = om.readValue(js, TestDTO.class);
		js=om.writeValueAsString(dto);
		
		return js;
	}
	@RequestMapping("test07")
	public @ResponseBody String ajax07() throws Exception{
		ObjectMapper om = new ObjectMapper();
		List<TestDTO> list = Arrays.asList(
				new TestDTO("java","oracle"),
				new TestDTO("test","abcd"),
				new TestDTO("web","spring")
				);
		String js=om.writeValueAsString(list);
		
		return js;
	}
	@RequestMapping("form")
	public String jqueryForm() {
		return "1215/jqueryForm";
	}
	@RequestMapping("time")
	public @ResponseBody String time() {
		Date day = new Date();
		SimpleDateFormat sdf =new SimpleDateFormat("HH:mm:ss");
		sdf.format(day);
		
		return sdf.format(day);
	}
	@GetMapping("idCheck")
	public @ResponseBody String idCheck(String id) {
		String result="success";	
		if(id.equals("test")) {
				result="fail";
			}
		return result;
	}
	@RequestMapping("info")
	public String info(Model model) {
		model.addAttribute("msg", "고무고무~~총난타~!!!");
		model.addAttribute("count", 100);
		return "1215/info" ;  
	}
}
