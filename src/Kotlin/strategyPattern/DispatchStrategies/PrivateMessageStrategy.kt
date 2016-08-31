package Kotlin.strategyPattern.DispatchStrategies

import Kotlin.strategyPattern.Message

class PrivateMessageStrategy : DispatchStrategy {

    override fun send(message: Message) {
        println("Message sent to " + message.receivingUser.fullName + "Via private message")
        println("Content: " + message.content)
        println("Send Timestamp: " + message.dateTimeSent + "\n")
    }
}
