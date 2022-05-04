package com.vivek;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.vivek.service.AddService;

@Controller
public class AddController {
	@RequestMapping("/add")
	public ModelAndView demo(@RequestParam("num1") int i,@RequestParam("num2") int j) {
//		int i = Integer.parseInt(request.getParameter("num1"));
//		int j = Integer.parseInt(request.getParameter("num2"));
		AddService as = new AddService();
		int k = as.add(i, j);
		ModelAndView mv = new ModelAndView();
		mv.addObject("result", k);
		mv.setViewName("display");
		return mv;
	}
}
