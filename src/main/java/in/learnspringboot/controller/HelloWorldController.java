package in.learnspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	
//	url to access this contoller is 
//	http://localhost:8080/home
	
	@GetMapping("/home")
	public String doHome( @RequestParam(value="name",required = false) String name,Model model) {
		if(name!=null ) {
			model.addAttribute("name", name);
		}else {
			model.addAttribute("name", "Spring boot User");
		}
		return "index";
	}
	

}
