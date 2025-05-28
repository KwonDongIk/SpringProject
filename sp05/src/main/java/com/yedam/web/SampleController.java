package com.yedam.web;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.domain.EmployeeDepartmentListVO;
import com.yedam.domain.EmployeeDepartmentVO;
import com.yedam.domain.SampleDTO;
@Controller
public class SampleController {
	
	@GetMapping("/ex01")
	public String ex01(SampleDTO sample, Model model) {
		System.out.println(sample);
		model.addAttribute("dept", "개발");
		return "main";
	}
	
	@GetMapping("/ex02")
	public String ex02(@RequestParam(name = "name") String name,
					   @RequestParam(name = "age",
					   				required = false,
							   		defaultValue="20") int age) {
		System.out.println(name);
		System.out.println(age);
		return "main";
	}
	
	@GetMapping("/ex02List")
	public String ex02List(@RequestParam("hobby") List<String> param) {
		
		System.out.println(param);
		
		return "main";
	}
	
	@GetMapping("/ex03/{classname}/{stdno}")
	public String ex03(@PathVariable("classname") String classname, 
					   @PathVariable("stdno") String stdno) {
		System.out.println("class : " + classname);
		System.out.println("stdno : " + stdno);
		return "main";
	}
	
	@PostMapping("/ex04")
	public String ex04(@RequestBody EmployeeDepartmentVO emp) {
		
		System.out.println(emp);
		return "main";
		
	}
	
	@PostMapping("/ex05")
	public String ex05(@RequestBody EmployeeDepartmentListVO emp) {
		System.out.println(emp);
		return "main";
	}
	
	@PostMapping("/ex06")
	@ResponseBody
	public SampleDTO ex06(@RequestBody SampleDTO sample) {
		return sample;
	}
	
	@GetMapping("ex07")
	@ResponseBody // return 절 결과 넘겨줌
	public String ex07() {
		return "main";
	}
	
	@GetMapping("ex08")
	public String ex08(Model model, RedirectAttributes rttr) {
		rttr.addFlashAttribute("msg", "휘발성파라미터");
		rttr.addAttribute("name", "홍길동");
		//rttr.addFlashAttribute("msg2", "휘발성파라미터");
		return "redirect:ex01"; // 공백 제외
	}

}
