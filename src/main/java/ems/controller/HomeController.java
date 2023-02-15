package ems.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/home")
	public String home()
	{
		System.out.println("inside home controller");
		return "welcome home";
	}
}
