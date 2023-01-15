package com.data.bear.base.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
public class BaseController {

	@GetMapping("/")
	public String index() {
		log.info("index page!!");
		return "index";
	}
}
