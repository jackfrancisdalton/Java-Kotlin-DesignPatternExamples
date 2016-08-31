package Kotlin.strategyPattern.DispatchStrategies

import Kotlin.strategyPattern.Message

class SMSStrategy : DispatchStrategy {

    override fun send(message: Message) {
        println("Message sent to " + message.receivingUser.fullName + "Via SMS")
        println("Content: " + message.content)
        println("Send Timestamp: " + message.dateTimeSent + "\n")
    }
}