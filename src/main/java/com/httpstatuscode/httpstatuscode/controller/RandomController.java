package com.httpstatuscode.httpstatuscode.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.httpstatuscode.httpstatuscode.models.Response;
import com.httpstatuscode.httpstatuscode.utils.RandomCode;

@RestController
public class RandomController {
	
	
	@RequestMapping(value = "/random", method = RequestMethod.GET)
	public ResponseEntity<Response> random() {
		int random_code = RandomCode.get();
		Response responseCode = new Response(random_code);
		return new ResponseEntity<Response>(responseCode, HttpStatus.valueOf(responseCode.getCode()));
	}

}
