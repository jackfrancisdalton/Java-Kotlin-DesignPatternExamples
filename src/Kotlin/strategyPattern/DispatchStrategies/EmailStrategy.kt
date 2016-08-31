package Kotlin.strategyPattern.DispatchStrategies

import Kotlin.strategyPattern.Message

class EmailStrategy : DispatchStrategy {

    override fun send(message: Message) {
        println("Message sent to " + message.receivingUser.fullName + "Via email")
        println("Content: " + message.content)
        println("Send Timestamp: " + message.dateTimeSent + "\n")
    }
}
