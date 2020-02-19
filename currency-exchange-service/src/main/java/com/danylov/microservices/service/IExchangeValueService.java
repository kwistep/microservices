package com.danylov.microservices.service;

import com.danylov.microservices.model.ExchangeValue;

public interface IExchangeValueService {

    ExchangeValue findExchangeValue(String from, String to);

}
