package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Vinicontroller {
	
	@GetMapping("/vini")
	public ModelAndView getname() {
		ModelAndView m1 = new ModelAndView();
		m1.addObject("vini","plese practice well raji....!!");
		m1.setViewName("reddy");
		
		return m1;
		
	}
	
	
	

}
