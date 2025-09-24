package com.eraqi.agenticbudgetmanager.user_details

import ai.koog.agents.core.tools.annotations.LLMDescription
import ai.koog.agents.core.tools.reflect.ToolSet
import com.eraqi.agenticbudgetmanager.user_details.data.UserBudgetDetailsRepo
import javax.inject.Inject

@LLMDescription("Class contains tools to retrieve monthly income," +
        " update monthly income," +
        "retrieve recurring expenses," +
        "update recurring expenses," +
        "retrieve utilities," +
        "update utilities," +
        "retrieve housing (rent/mortgage), " +
        "update housing (rent/mortgage)," +
        "")
class UserBudgetDetailsTools @Inject constructor(userBudgetDetailsRepo: UserBudgetDetailsRepo):
    ToolSet {



}