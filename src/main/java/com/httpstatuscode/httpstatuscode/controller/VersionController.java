package com.httpstatuscode.httpstatuscode.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.httpstatuscode.httpstatuscode.models.Response;
import com.httpstatuscode.httpstatuscode.models.Version;
import com.httpstatuscode.httpstatuscode.utils.RandomCode;

@RestController
public class VersionController {
	
	@RequestMapping(value = "/version", method = RequestMethod.GET)
	public ResponseEntity<Version> version() {
		Version version = new Version();
		return new ResponseEntity<Version>(version, HttpStatus.OK);
	}

}
