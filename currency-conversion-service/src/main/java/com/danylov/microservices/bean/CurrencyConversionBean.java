package com.danylov.microservices.bean;

import java.math.BigDecimal;

public class CurrencyConversionBean {

    private String from;
    private String to;
    private BigDecimal conversion_index;
    private BigDecimal quantity;
    private BigDecimal result;
    private int port;

    public CurrencyConversionBean() {
    }

    public CurrencyConversionBean(String from, String to, BigDecimal conversion_index, BigDecimal quantity, BigDecimal result, int port) {
        this.from = from;
        this.to = to;
        this.conversion_index = conversion_index;
        this.quantity = quantity;
        this.result = result;
        this.port = port;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionIndex() {
        return conversion_index;
    }

    public void setConversionIndex(BigDecimal conversion_index) {
        this.conversion_index = conversion_index;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getResult() {
        return result;
    }

    public void setResult(BigDecimal result) {
        this.result = result;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
