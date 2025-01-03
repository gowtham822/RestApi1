package com.tcs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tcs.model.Quote;
import com.tcs.service.QuoteService;

@Controller
public class QuoteController {

	@Autowired
    private QuoteService quoteService;
	
	@GetMapping("/quotes")
    public String getQuotes(Model model) {
        List<Quote> quotes = quoteService.fetchQuote();
        
        model.addAttribute("quotes", quotes);
        
        return "quotes";
    }
}
