package com.exc.service.dto.remote;

import com.exc.domain.CurrencyName;

import java.io.Serializable;
import java.util.Set;

public class KeysRequestDTO implements Serializable {
    private Set<Long> userIds;
    private CurrencyName buy;
    private CurrencyName sell;

    public KeysRequestDTO() {

    }

    public KeysRequestDTO(Set<Long> userIds, CurrencyName buy, CurrencyName sell) {
        this.userIds = userIds;
        this.buy = buy;
        this.sell = sell;
    }

    public Set<Long> getUserIds() {
        return userIds;
    }

    public void setUserIds(Set<Long> userIds) {
        this.userIds = userIds;
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
