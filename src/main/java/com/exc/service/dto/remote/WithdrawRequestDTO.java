package com.exc.service.dto.remote;

import com.exc.domain.CurrencyName;

import java.io.Serializable;
import java.math.BigInteger;

public class WithdrawRequestDTO implements Serializable {
    private CurrencyName currencyName;
    private String fromPrivate;
    private BigInteger value;
    private BigInteger fee;
    private Long externalId;

    public CurrencyName getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(CurrencyName currencyName) {
        this.currencyName = currencyName;
    }

    public String getFromPrivate() {
        return fromPrivate;
    }

    public void setFromPrivate(String fromPrivate) {
        this.fromPrivate = fromPrivate;
    }

    public BigInteger getValue() {
        return value;
    }

    public void setValue(BigInteger value) {
        this.value = value;
    }

    public BigInteger getFee() {
        return fee;
    }

    public void setFee(BigInteger fee) {
        this.fee = fee;
    }

    public Long getExternalId() {
        return externalId;
    }

    public void setExternalId(Long externalId) {
        this.externalId = externalId;
    }
}
