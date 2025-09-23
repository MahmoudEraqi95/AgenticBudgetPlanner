package com.eraqi.agenticbudgetmanager

import kotlinx.serialization.Serializable
import java.math.BigDecimal

data class UserBudgetDetails(

    val monthlyIncome: BigDecimal,
    val groceries: BigDecimal,
    val recurringExpenses: BigDecimal,
    val housing: BigDecimal,
    val utilities: BigDecimal
)
