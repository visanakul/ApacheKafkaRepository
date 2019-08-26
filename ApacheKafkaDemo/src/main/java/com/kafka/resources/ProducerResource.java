package com.kafka.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.producer.Producer;

@RestController
@RequestMapping("/kafka")
public class ProducerResource {

	@Autowired(required = true)
	private Producer producer;

	@PostMapping("/publish")
	public void sendMessageToKafkaTopic(@RequestParam(value = "msg") String msg) {
		producer.sendMessage(msg);
	}
}
