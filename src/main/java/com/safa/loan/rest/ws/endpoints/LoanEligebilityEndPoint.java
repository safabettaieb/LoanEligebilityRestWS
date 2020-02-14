package com.safa.loan.rest.ws.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import com.safa.loan.rest.ws.payload.requests.CustomerRequest;
import com.safa.loan.rest.ws.payload.responses.WsResponse;
import com.safa.loan.rest.ws.services.LoanEligibiltyService;

@RestController
@RequestMapping("/ws")
public class LoanEligebilityEndPoint {
	@Autowired
	private LoanEligibiltyService service;
	
	@PostMapping(path ="/getLoanStatus", produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE}
										,consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<WsResponse>   getLoanStatus(@RequestBody CustomerRequest customerRequest) {
		return new ResponseEntity<WsResponse>(service.checkLoanEligibilty(customerRequest), HttpStatus.OK);
	}
}
