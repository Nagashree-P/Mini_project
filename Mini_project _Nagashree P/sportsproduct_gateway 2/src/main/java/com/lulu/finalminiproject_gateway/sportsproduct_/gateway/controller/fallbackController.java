package com.lulu.finalminiproject_gateway.sportsproduct_.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class fallbackController {
	@GetMapping("/productServiceCallback")
	public String callback() {

		return "Try again after some time";

	}

}
