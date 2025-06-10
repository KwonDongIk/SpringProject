package com.example.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.EmpService;

@Controller
public class EmpController {
	
	@Autowired EmpService empService;
	
	@GetMapping("/emp")
	public String getMethodName(Model model){
		model.addAttribute("empList", empService.getEmpList(null));
		return "emp";
	}

}
