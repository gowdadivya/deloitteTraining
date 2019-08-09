package com;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerMVC {

	@RequestMapping("/sayHey")
	public ModelAndView mapper() {
		ModelAndView view = new ModelAndView();
		view.addObject("message", "Hey There!");
		view.setViewName("SayHey");
		return view;
	}
}
