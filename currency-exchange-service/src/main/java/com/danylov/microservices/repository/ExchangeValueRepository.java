package com.danylov.microservices.repository;

import com.danylov.microservices.model.ExchangeValue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExchangeValueRepository extends CrudRepository<ExchangeValue, Long> {

    ExchangeValue findByFromAndTo(String from, String to);

}
