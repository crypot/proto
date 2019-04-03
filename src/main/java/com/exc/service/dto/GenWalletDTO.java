package com.exc.service.dto;

import com.exc.domain.CurrencyName;

import java.io.Serializable;

/**
 * used in user, and tx in order to request new wallets
 */
public class GenWalletDTO implements Serializable {
    private CurrencyName currencyName;
    private String privateKey;
    private String publicKey;

    public GenWalletDTO() {
    }

    public CurrencyName getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(CurrencyName currencyName) {
        this.currencyName = currencyName;
    }

    public String getPrivateKey() {
        return this.privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return this.publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }
}
