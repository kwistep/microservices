package com.danylov.microservices.service;

import com.danylov.microservices.model.ExchangeValue;
import com.danylov.microservices.repository.ExchangeValueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExchangeValueService implements IExchangeValueService {

    @Autowired
    ExchangeValueRepository repository;


    @Override
    public ExchangeValue findExchangeValue(String from, String to) {
        return repository.findByFromAndTo(from, to);
    }
}
