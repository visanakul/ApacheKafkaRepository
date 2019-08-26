package com.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	@KafkaListener(topics = "topic-test",groupId = "group_id")
	public void consume(String msg) {
		System.out.println("Message received : " + msg);
	}
}
