package com.jerkin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


	@RestController
	public class JerkinController {
		@GetMapping(value="/get")
		public String get() {
			return "Hello World";
		}

	}
