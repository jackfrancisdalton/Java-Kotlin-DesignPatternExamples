package Kotlin.strategyPattern

import Kotlin.strategyPattern.DispatchStrategies.DispatchStrategy

class Message(
        content: String,
        dateTimeRead: String,
        sendingUserDetails: UserDetails,
        receivingUserDetails: UserDetails,
        dispatchStrategy: DispatchStrategy
) {
    var content = content
    var dateTimeSent = dateTimeRead
    var sendingUser: UserDetails = sendingUserDetails
    var receivingUser: UserDetails = receivingUserDetails
    val dispatchStrategy: DispatchStrategy = dispatchStrategy

    //If no dispatch method is defined it will use the receivers preferred method
    constructor(content: String,
                dateTimeRead: String,
                sendingUserDetails: UserDetails,
                receivingUserDetails: UserDetails) : this(content, dateTimeRead, sendingUserDetails, receivingUserDetails, receivingUserDetails.preferredFormOfContact) {

    }
}
