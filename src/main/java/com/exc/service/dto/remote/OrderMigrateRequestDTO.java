package com.exc.service.dto.remote;

import com.exc.domain.CurrencyName;

import java.io.Serializable;

public class OrderMigrateRequestDTO implements Serializable {
    public OrderMigrateRequestDTO() {
    }

    public OrderMigrateRequestDTO(Long mainOrderId, CurrencyName buy, CurrencyName sell) {
        this.mainOrderId = mainOrderId;
        this.buy = buy;
        this.sell = sell;
    }

    private Long mainOrderId;
    private CurrencyName buy;
    private CurrencyName sell;

    public Long getMainOrderId() {
        return mainOrderId;
    }

    public void setMainOrderId(Long mainOrderId) {
        this.mainOrderId = mainOrderId;
    }

    public CurrencyName getBuy() {
        return buy;
    }

    public void setBuy(CurrencyName buy) {
        this.buy = buy;
    }

    public CurrencyName getSell() {
        return sell;
    }

    public void setSell(CurrencyName sell) {
        this.sell = sell;
    }
}
