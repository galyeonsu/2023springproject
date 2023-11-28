package com.study.springboot;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.study.springboot.dao.ISimpleBbsDao;
import com.study.springboot.service.ISimpleBbsService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class MyController {
//	@Autowired
//	ISimpleBbsDao dao;
	ISimpleBbsService bbs;

	@RequestMapping("/")
	public String root() {
		return "redirect:list";
	}
	
	@RequestMapping("/list")
	public String listPage(Model model) {
		model.addAttribute("list",bbs.list());
		model.addAttribute("count",bbs.count());
		return "list";
	}
	@RequestMapping("/view")
	public String view(HttpServletRequest request, Model model) {
		String sId = request.getParameter("id");
		model.addAttribute("dto",bbs.view(sId));
		return "view";
	}
	
	@RequestMapping("/writeForm")
	public String writeForm() {
		return "writeForm";
	}
	
	@RequestMapping("/write")
	public String write(HttpServletRequest request, Model model) {
//		dao.writeDao(
//				request.getParameter("writer"),
//				request.getParameter("title"),
//				request.getParameter("content")
//				);
		String sName = request.getParameter("writer");
		String sTitle = request.getParameter("title");
		String sContent = request.getParameter("content");
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("item1", sName);
		map.put("item2", sTitle);
		map.put("item3", sContent);
		
		int nResult = bbs.write(map);
		
		System.out.println("write :" + nResult);
		
		
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		bbs.delete(request.getParameter("id"));
		return "redirect:list";
	}
}
