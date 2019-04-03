package com.exc.service.dto.remote;

import com.exc.domain.CryptoCurrencyFailedType;
import com.exc.domain.CryptoCurrencyTransactionStatus;
import com.exc.domain.CryptoCurrencyTransactionType;

public class TxStatusDTO {
    private CryptoCurrencyFailedType cryptoCurrencyFailedType;
    private CryptoCurrencyTransactionStatus cryptoCurrencyTransactionStatus;
    private CryptoCurrencyTransactionType cryptoCurrencyTransactionType;
    private String failText;
    private String statusText;

}
