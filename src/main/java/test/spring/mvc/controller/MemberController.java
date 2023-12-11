package test.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/user/*")
public class MemberController {
	
	@RequestMapping("main")
	public ModelAndView main(String id) {
		System.out.println("MemberController--main----->>"+id);
		ModelAndView mv = new ModelAndView();
		//model 의 addAttribute 랑 같은 기능
		mv.addObject("count",100);
		mv.addObject("name","java");
		mv.setViewName("member/main");
		return mv;
	}
	@RequestMapping("loginForm")
	public String loginForm() {
		return "loginForm page";
	}
	@RequestMapping("loginPro")
	public String loginPro() {
		return "loginPro page";
	}
	@RequestMapping("info")
	public String ok_lnfo() {
		return "info page";
	}
	@RequestMapping("updateForm")
	public String ok_updateForm() {
		return "updateForm page";
	}
	@RequestMapping("updatePro")
	public String ok_updatePro() {
		return "updatePro page";
	}
	@RequestMapping("deleteForm")
	public String ok_deleteForm() {
		return "deleteForm page";
	}
	@RequestMapping("deletePro")
	public String ok_deletePro() {
		return "deletePro page";
	}
}
