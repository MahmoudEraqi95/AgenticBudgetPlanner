package com.eraqi.agenticbudgetmanager

import java.math.BigDecimal

interface UserBudgetDetailsRepo {
    fun getMonthlyIncome()
    fun getRecurringExpenses()
    fun getUtilities()
    fun getHousing()
    fun getGroceries()
    fun setUserDetails(
        monthlyIncome: BigDecimal,
        recurringExpenses: BigDecimal,
        utilities: BigDecimal,
        housing: BigDecimal,
        groceries: BigDecimal
    )
    fun getTotalBudget()
}