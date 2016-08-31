package Kotlin.strategyPattern.DispatchStrategies

import Kotlin.strategyPattern.Message

interface DispatchStrategy {
    fun send(message: Message)
}
