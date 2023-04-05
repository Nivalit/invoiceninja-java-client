package com.nivalit.invoiceninja.sdk.mappers

import java.math.BigDecimal

class CurrencyId {
    companion object{
        fun fromCurrencyCode(code: String): BigDecimal? = when(code.uppercase()){
            "PLN" -> BigDecimal(49)
            "USD" -> BigDecimal(1)
            "EUR" -> BigDecimal( 3)
            else -> null
        }
    }
}