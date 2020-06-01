package co.grandcircus.assess6.Assess6Practice;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HotelController {
	
	@Autowired
	private HotelRepo hotelRepository;
	
	@RequestMapping("/")
	public String getHomePage() {
		return "home";
	}
	
	@RequestMapping("/result")
	public String getResultPage(Model model) {
		
		return "result";
	}

}
