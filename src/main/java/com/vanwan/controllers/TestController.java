package com.vanwan.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping(value = "/custom", method = RequestMethod.POST)
    public String custom() {
        return "custom";
    }

}
