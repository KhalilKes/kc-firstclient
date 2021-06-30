package com.pragmatic.security.controller;

import com.pragmatic.security.POJO.SenderResponse;

import javax.annotation.security.RolesAllowed;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PragmaController {

	@GetMapping(value = "/")
	public SenderResponse homeEndpoint() {
		return new SenderResponse("Hello from Mordor !");
	}

	@RolesAllowed("ROLE_ADMIN")
	@GetMapping(value = "wizard")
	public SenderResponse adminEndpoint() {
		return new SenderResponse("Hello from Gandalf the grey !!");
	}

	@RolesAllowed("ROLE_MANAGER")
	@GetMapping(value = "hobbit")
	public SenderResponse managerEndpoint() {
		return new SenderResponse("Hello from Froddo the hobbit !!");
	}
}
