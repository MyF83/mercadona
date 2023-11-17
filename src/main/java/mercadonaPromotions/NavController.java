package mercadonaPromotions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	
	@GetMapping("/")
	public String showHome() {
		return "index";
	}

	
	@GetMapping("/index")
	public String showIndex() {
		return "index";
	}

	
	@GetMapping("/dashboard")
	public String showDashboard() {
		return "dashboard";

	}
	
	@GetMapping("/discount")
	public String showDiscount() {
		return "discount";

	}
	
	@GetMapping("/catalog")
	public String showCatalog() {
		return "catalog";
	}
	
	@GetMapping("/contact")
	public String showContact() {
		return "contact";
	}
	
	@GetMapping("/info")
	public String showInfo() {
		return "info";
	}
	
	@GetMapping("/login")
	public String showLogin() {
		return "login";
	}
	
	@GetMapping("/logout")
	public String showLogout() {
		return "logout";
	}
	
}



