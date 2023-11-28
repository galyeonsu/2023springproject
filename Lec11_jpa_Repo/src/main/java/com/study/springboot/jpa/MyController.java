package com.study.springboot.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	@Autowired
	MemberService memberService;
	
	@RequestMapping("/")
	public String root() throws Exception {
		return "menu";
	}
//	@RequestMapping("/insert")
//	public String insert(Member member,Model model) {
//		memberService.insert();
//		return"insert";
//	}
	
	@RequestMapping("/list")
	public String selectAll(Model model) {
		List<Member> result = memberService.selectAll();
		model.addAttribute("members",result);
		return"list";
	}
}
