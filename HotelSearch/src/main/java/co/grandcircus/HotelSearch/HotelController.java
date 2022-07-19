package co.grandcircus.HotelSearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HotelController {
	
	@Autowired
	private HotelRepository repo;
	
	@RequestMapping("/")
	public String homePage() {
		return "homepage";
	}
	
	@PostMapping("/results")
	public ModelAndView searchResults(Hotel hotel) {
		
		ModelAndView modelAndView = new ModelAndView("results");
		
		if(hotel.getCity().equals("Woodhaven")) {
			modelAndView.addObject("searchResult", repo.findByCity("Woodhaven"));
		} else if(hotel.getCity().equals("Brownstown")) {
			modelAndView.addObject("searchResult", repo.findByCity("Brownstown"));
		} else if(hotel.getCity().equals("Rockwood")) {
			modelAndView.addObject("searchResult", repo.findByCity("Rockwood"));
		} else if (hotel.getCity().equals("Chicago")){
			modelAndView.addObject("searchResult", repo.findByCity("Chicago"));
		}
		
		return modelAndView;
	}

}
