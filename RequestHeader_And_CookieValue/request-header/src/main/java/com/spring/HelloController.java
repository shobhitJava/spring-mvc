package com.spring;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {

	@RequestMapping(value="hello")
	public String hello(
			@RequestHeader(value="Accept") String accept,
			@RequestHeader(value="Accept-Language") String acceptLanguage,
			@RequestHeader(value="User-Agent", defaultValue="foo") String userAgent,
			@RequestHeader(value="Accept-Encoding") String AcceptEncoding,
			@RequestHeader(value="Cookie") String cookie,
			@RequestHeader(value="Host") String host,
			//@RequestHeader (value="Cache-Control") String cacheCon,
			HttpServletResponse response){
		
		//Client Request Headers
		// Reference: http://www.tutorialspoint.com/http/http_header_fields.htm
		System.out.println("accept: " + accept);
		System.out.println("acceptLanguage: " + acceptLanguage);
		System.out.println("userAgent: " + userAgent);
		System.out.println("Accept-Encoding : " + AcceptEncoding);
		System.out.println("Cookie : " + cookie);
		System.out.println("Host  : " + host);
		return null;
	}
}
