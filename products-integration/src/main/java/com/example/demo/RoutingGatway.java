package com.example.demo;

import java.util.List;

import org.springframework.messaging.Message;

import com.example.demo.model.User;

public interface RoutingGatway {
	public Object rout(Message<List<User>> message);
}