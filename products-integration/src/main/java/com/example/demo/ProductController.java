package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private RoutingGatway routingGatway;

	@RequestMapping(method = RequestMethod.POST, value = "/login")
	public Object getBankProducts(@RequestBody User user) throws InterruptedException, ExecutionException {

		List<User> users = new ArrayList<>();
		users.add(new User("user111", "pass"));
		users.add(new User("user222", "pass"));
		users.add(new User("user333", "pass"));
		users.add(new User("user444", "pass"));

		Message<List<User>> message = MessageBuilder.withPayload(users)
				.setHeader("user111", "bank")
				.setHeader("user222", "card")
				.setHeader("user333", "bank")
				.setHeader("user444", "card")
				.build();

		Object response = this.routingGatway.rout(message);

		return response;

	}

	@RequestMapping(method = RequestMethod.GET, value = "/user")
	public User getUser() {
		return new User("user", "pass");
	}
}
