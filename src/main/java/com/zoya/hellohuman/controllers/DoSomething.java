package com.zoya.hellohuman.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class DoSomething {
	@RequestMapping("/")
	
    public String index(@RequestParam(value="first_name" ,defaultValue="Human") String firstname,
    					@RequestParam(value="last_name" ,required=false) String lastname  ,Model model){
		
		model.addAttribute("name",firstname);
		model.addAttribute("last",lastname);
		return "hello.jsp";
       
    }
}
