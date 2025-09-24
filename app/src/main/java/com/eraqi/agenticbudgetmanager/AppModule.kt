package com.eraqi.agenticbudgetmanager

import com.eraqi.agenticbudgetmanager.user_details.data.UserBudgetDetailsRepo
import com.eraqi.agenticbudgetmanager.user_details.data.UserBudgetDetailsRepoImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun provideUserBudgetDetailsRepo(): UserBudgetDetailsRepo
    {
        return UserBudgetDetailsRepoImpl()
    }
}