package Kotlin.strategyPattern

import Kotlin.strategyPattern.DispatchStrategies.EmailStrategy
import Kotlin.strategyPattern.DispatchStrategies.PrivateMessageStrategy
import Kotlin.strategyPattern.DispatchStrategies.SMSStrategy
import java.util.*

fun main(args : Array<String>) {

    //Create Users
    var me: UserDetails = UserDetails(UUID.randomUUID(), "Jack Dalton", EmailStrategy())
    var friendOne: UserDetails = UserDetails(UUID.randomUUID(), "Ed Woollard", SMSStrategy())
    var friendTwo: UserDetails = UserDetails(UUID.randomUUID(), "Luke Sapiets", PrivateMessageStrategy())
    var friendThree: UserDetails = UserDetails(UUID.randomUUID(), "Minky Tres-Vayne", EmailStrategy())

    //Create batch sender
    val batchMessageSender = BatchMessageSender()

    //Create messages
    val messages = ArrayList<Message>()
    messages.add(Message("Hello man this is the first message", "", me, friendOne))
    messages.add(Message("Hello man this is the second message", "", me, friendTwo))
    messages.add(Message("Hello man this is the third message", "", me, friendThree))
    batchMessageSender.addMessage(messages)

    //Send messages
    batchMessageSender.sendBatch()
}