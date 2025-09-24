package com.eraqi.agenticbudgetmanager.user_details.data

import java.math.BigDecimal
import javax.inject.Inject

class UserBudgetDetailsRepoImpl @Inject constructor(): UserBudgetDetailsRepo {
    override fun getMonthlyIncome() {
        TODO("Not yet implemented")
    }

    override fun getRecurringExpenses() {
        TODO("Not yet implemented")
    }

    override fun getUtilities() {
        TODO("Not yet implemented")
    }

    override fun getHousing() {
        TODO("Not yet implemented")
    }

    override fun getGroceries() {
        TODO("Not yet implemented")
    }

    override fun setUserDetails(
        monthlyIncome: BigDecimal,
        recurringExpenses: BigDecimal,
        utilities: BigDecimal,
        housing: BigDecimal,
        groceries: BigDecimal
    ) {
        TODO("Not yet implemented")
    }

    override fun getTotalBudget() {
        TODO("Not yet implemented")
    }
}