package com.eraqi.agenticbudgetmanager

import java.util.Date

data class Message(val isSentByUser: Boolean,
                   val content: String,
                   val date: Date)
