package springwebmvc.config.beans;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	public HomeController() {
		System.out.println("Home");
	}
	@GetMapping("/")
	public String getHome() {
		System.out.println("Hello");
		return "index";
	}
}
