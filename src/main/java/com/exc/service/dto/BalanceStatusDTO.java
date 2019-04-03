package com.exc.service.dto;

import java.io.Serializable;
import java.math.BigInteger;

public class BalanceStatusDTO implements Serializable {
    private BigInteger balance;
    private BigInteger wFee;
    private BigInteger dFee;
    private BigInteger netFee;

    public BigInteger getNetFee() {
        return netFee;
    }

    public void setNetFee(BigInteger netFee) {
        this.netFee = netFee;
    }

    public BigInteger getBalance() {
        return balance;
    }

    public void setBalance(BigInteger balance) {
        this.balance = balance;
    }

    public BigInteger getwFee() {
        return wFee;
    }

    public void setwFee(BigInteger wFee) {
        this.wFee = wFee;
    }

    public BigInteger getdFee() {
        return dFee;
    }

    public void setdFee(BigInteger dFee) {
        this.dFee = dFee;
    }
}
