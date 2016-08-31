package Kotlin.strategyPattern

import java.text.SimpleDateFormat
import java.util.*

class BatchMessageSender {

    var messageList: ArrayList<Message> = ArrayList()

    fun addMessage(message: Message) {
        messageList.add(message)
    }

    fun addMessage(messages: ArrayList<Message>) {
        messageList.addAll(messages)
    }

    fun sendBatch() {
        val calendar = Calendar.getInstance()

        for (m: Message in messageList) {
            val outputFmt = SimpleDateFormat("dd/MM/yyyy HH:mm:ss")
            val timeString = outputFmt.format(calendar.time)
            m.dateTimeSent = timeString
            m.dispatchStrategy.send(m)
        }
    }
}