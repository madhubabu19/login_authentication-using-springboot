package com.expense.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.expense.entities.User;
import com.expense.services.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private  UserService userService;
	@GetMapping("/regpage")
	public  String openregpage(Model model)
	{
		
		model.addAttribute("user", new User());
		return "register";
	}
	
	@PostMapping("/regform")
	public String submitregform(@ModelAttribute("user") User user, Model model)
	{
		boolean status = userService.registeruser(user);
		
		if (status)
		{
			model.addAttribute("succesmsg",  "User rregistered Successfully");
		}
		else
		{
			model.addAttribute("errormsg", " user not registered due to error message");
		}
			
		
		return "register";
	}
	
	@GetMapping("/loginfor")
	 public String loginform(Model model)
	 {
		model.addAttribute("user", new User());
		 return "login";
	 }
       
	
	@PostMapping("/LoginServlet")
	 public String submitloginform(@ModelAttribute("user") User user, Model model)
	 {
		
		User uservalid = userService.loginuser(user.getName(), user.getPassword());
		if (uservalid != null)
		{
			return  "profile";
		}
		else
		{
			model.addAttribute("errormsg", " Email id and password didnot match");
			 return  "login";
		}
		
		
	 }
	
	
}
