package com.danylov.microservices.controller;

import com.danylov.microservices.model.ExchangeValue;
import com.danylov.microservices.service.IExchangeValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CurrencyExchangeController {

    @Autowired
    IExchangeValueService exchangeValueService;


    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue getCurrencyExchange(@PathVariable String from, @PathVariable String to) {

        ExchangeValue exchangeValue = exchangeValueService.findExchangeValue(from, to);
        return exchangeValue;
    }

}
