package com.example.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Receive;

@RestController
@RequestMapping(value="")
public class ProcessController {
	
	@RequestMapping(value = "", method =RequestMethod.POST)
	public Receive check(@RequestBody Receive receive) {
		if ("野中　敦史".equals(receive.getName())) {
			receive.setName("合ってる。");
		} else {
			receive.setName("違うのが入ってます。");
		}
		return receive;
	}
}
