package com.kafka.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	public static final String TOPIC = "topic-test";

	@Autowired(required = true)
	private KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(String msg) {
		kafkaTemplate.send(TOPIC, msg);
	}
}
