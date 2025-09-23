package com.eraqi.agenticbudgetmanager

import java.math.BigDecimal
import java.util.Date

data class Transaction(
    val amount: BigDecimal,
    val merchant: String,
    val date: Date
)
