package Kotlin.strategyPattern

import Kotlin.strategyPattern.DispatchStrategies.DispatchStrategy
import java.util.*

class UserDetails(uuid: UUID, fullName: String, preferredFormOfContact: DispatchStrategy) {
    var uuid = uuid
    var fullName = fullName
    var preferredFormOfContact = preferredFormOfContact
}