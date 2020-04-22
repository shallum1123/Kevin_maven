package com.yc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MavenController {
	@RequestMapping("test")
	public String testMaven() {
		return "123SUCCESS----QQQQQQQQQ ---ceshicssdeishiceshi";
	}
}
