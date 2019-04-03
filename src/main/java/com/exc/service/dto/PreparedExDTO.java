package com.exc.service.dto;

import com.exc.domain.CurrencyName;
import com.exc.service.dto.remote.KeysResponseDTO;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * Used between order service->tx service in order to pass tx details
 */
public class PreparedExDTO implements Serializable {
    private CurrencyName curIdBuy;
    private String toPublicBuy;
    private String fromPrivateBuy;
    private BigInteger valueBuy;
    private long externalIdBuy;
    private CurrencyName curIdSell;
    private String toPublicSell;
    private String fromPrivateSell;
    private BigInteger valueSell;
    private long externalIdSell;

    public PreparedExDTO() {

    }

    public PreparedExDTO(CurrencyName bCurId, KeysResponseDTO buyKeys, CurrencyName sCurId, KeysResponseDTO sellKeys,
                         BigInteger buyValue,
                         BigInteger sellValue,
                         Long buyId,
                         Long sellId) {
        this.curIdBuy = sCurId;
        this.curIdSell = bCurId;

        this.toPublicBuy = sellKeys.getPublicKey();
        this.fromPrivateSell = sellKeys.getPrivateKey();

        this.toPublicSell = buyKeys.getPublicKey();
        this.fromPrivateBuy = buyKeys.getPrivateKey();

        this.valueBuy = buyValue;
        this.externalIdBuy = buyId;
        this.valueSell = sellValue;
        this.externalIdSell = sellId;
    }


    public CurrencyName getCurIdBuy() {
        return curIdBuy;
    }

    public void setCurIdBuy(CurrencyName curIdBuy) {
        this.curIdBuy = curIdBuy;
    }

    public String getToPublicBuy() {
        return toPublicBuy;
    }

    public void setToPublicBuy(String toPublicBuy) {
        this.toPublicBuy = toPublicBuy;
    }

    public String getFromPrivateBuy() {
        return fromPrivateBuy;
    }

    public void setFromPrivateBuy(String fromPrivateBuy) {
        this.fromPrivateBuy = fromPrivateBuy;
    }

    public BigInteger getValueBuy() {
        return valueBuy;
    }

    public void setValueBuy(BigInteger valueBuy) {
        this.valueBuy = valueBuy;
    }

    public long getExternalIdBuy() {
        return externalIdBuy;
    }

    public void setExternalIdBuy(long externalIdBuy) {
        this.externalIdBuy = externalIdBuy;
    }

    public CurrencyName getCurIdSell() {
        return curIdSell;
    }

    public void setCurIdSell(CurrencyName curIdSell) {
        this.curIdSell = curIdSell;
    }

    public String getToPublicSell() {
        return toPublicSell;
    }

    public void setToPublicSell(String toPublicSell) {
        this.toPublicSell = toPublicSell;
    }

    public String getFromPrivateSell() {
        return fromPrivateSell;
    }

    public void setFromPrivateSell(String fromPrivateSell) {
        this.fromPrivateSell = fromPrivateSell;
    }

    public BigInteger getValueSell() {
        return valueSell;
    }

    public void setValueSell(BigInteger valueSell) {
        this.valueSell = valueSell;
    }

    public long getExternalIdSell() {
        return externalIdSell;
    }

    public void setExternalIdSell(long externalIdSell) {
        this.externalIdSell = externalIdSell;
    }
}
