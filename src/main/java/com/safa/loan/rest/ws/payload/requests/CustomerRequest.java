package com.safa.loan.rest.ws.payload.requests;

import lombok.Data;

@Data
public class CustomerRequest {
	private String customerName;
    private int age;
    private long yearlyIncome;
    private int cibilScore;
    private String employmentMode;

}
