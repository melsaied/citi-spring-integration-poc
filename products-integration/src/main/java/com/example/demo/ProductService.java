package com.example.demo;

import org.springframework.http.HttpEntity;
import org.springframework.messaging.Message;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.User;

public class ProductService {

	public Object getProducts(Message<User> users) {

		Object object = new RestTemplate().postForObject(
				"http://localhost:8080/products/" + users.getHeaders().get(users.getPayload().getUserID()),
				new HttpEntity<>(users.getPayload()), Object.class);

		System.out.println("Products : " + object);

		return object;
	}

	public Object getBankProducts(User user) {
		Object object = new RestTemplate().postForObject("http://localhost:8080/products/bank",
				new HttpEntity<>(new User("user111", "pass")), Object.class);
		System.out.println("Bank : " + object);
		return object;
	}

	public Object getCardProducts(User user) {
		Object object = new RestTemplate().postForObject("http://localhost:8080/products/card",
				new HttpEntity<>(new User("user222", "pass")), Object.class);
		System.out.println("Card : " + object);
		return object;
	}
}
