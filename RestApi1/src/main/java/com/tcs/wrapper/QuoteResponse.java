package com.tcs.wrapper;

import java.util.List;

import com.tcs.model.Quote;

import lombok.Data;

@Data
public class QuoteResponse {
	
    private List<Quote> quotes;

    
}

