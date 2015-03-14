package org.krams.tutorial.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles and retrieves main requests
 */
@Controller
@RequestMapping("/main")
public class MainController {

	private static Logger logger = Logger.getLogger("controller");
	
    @RequestMapping(value = "/welcome", method = RequestMethod.GET)
    public String getCommonPage() {
    	logger.debug("Received request to show welcome page");
    	return "welcomepage";
	}
   
}
