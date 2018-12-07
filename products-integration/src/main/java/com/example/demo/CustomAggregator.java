package com.example.demo;

import java.util.Map;

import org.springframework.integration.aggregator.AbstractAggregatingMessageGroupProcessor;
import org.springframework.integration.store.MessageGroup;
import org.springframework.messaging.Message;

import com.example.demo.model.User;

public class CustomAggregator extends AbstractAggregatingMessageGroupProcessor {

	@Override
	protected Object aggregatePayloads(MessageGroup group, Map<String, Object> defaultHeaders) {
		System.out.println("call from CustomAggregator");

		for (Message<?> message : group.getMessages()) {
			System.out.println(message.getPayload().toString());
		}
		return new User("user111", "pass");
	}

}
