package com.eraqi.agenticbudgetmanager.user_details

import androidx.lifecycle.ViewModel
import com.eraqi.agenticbudgetmanager.user_details.data.UserBudgetDetailsRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserBudgetViewModel @Inject constructor(
    userBudgetDetailsRepo: UserBudgetDetailsRepo,
    userBudgetDetailsTools: UserBudgetDetailsTools
): ViewModel() {


}