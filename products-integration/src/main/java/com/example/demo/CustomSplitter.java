package com.example.demo;

import java.util.List;

import org.springframework.messaging.Message;

import com.example.demo.model.User;

public class CustomSplitter {

	public List<User> split(Message<List<User>> message) {

		return message.getPayload();
	}

}
