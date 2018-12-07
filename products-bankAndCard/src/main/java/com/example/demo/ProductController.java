package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

	@RequestMapping(method = RequestMethod.POST, value = "/bank")
	public List<Bank> getBankProducts(@RequestBody User user) {
		if (user != null && user.getUserID().equals("user111") && user.getPassword().equals("pass")) {
			List<Bank> response = new ArrayList<>();
			response.add(new Bank("101", "Checking"));
			response.add(new Bank("102", "Savings"));
			return response;
		}
		return null;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/card")
	public List<Card> getCardProducts(@RequestBody User user) {
		if (user != null && user.getUserID().equals("user222") && user.getPassword().equals("pass")) {
			List<Card> response = new ArrayList<>();
			response.add(new Card("111", "CASH BACK"));
			response.add(new Card("112", "POINTS REWARDS"));
			response.add(new Card("113", "MILES REWARDS"));
			return response;
		}
		return null;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/user")
	public List<User> getUser() {
		List<User> response = new ArrayList<>();
		response.add(new User("user", "pass"));
		return response;
	}
}
