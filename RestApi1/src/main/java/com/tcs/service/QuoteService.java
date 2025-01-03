package com.tcs.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tcs.model.Quote;
import com.tcs.wrapper.QuoteResponse;

@Service
public class QuoteService {
	
	private String apiUrl = "https://dummyjson.com/quotes";
	
	public List<Quote> fetchQuote(){
		
		RestTemplate rt = new RestTemplate();
		
        QuoteResponse response = rt.getForObject(apiUrl, QuoteResponse.class);
        
        return response != null ? response.getQuotes() : null;
	}

}
