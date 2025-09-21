package com.eraqi.agenticbudgetmanager

import java.math.BigDecimal

data class UserDetails(
    val monthlyIncome: BigDecimal,
    val groceries: BigDecimal,
    val recurringExpenses: BigDecimal,
    val housing: BigDecimal,
    val utilities: BigDecimal
)
