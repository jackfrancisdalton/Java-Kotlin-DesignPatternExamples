package Kotlin.observerPattern

import java.awt.List
import java.util.*

class MySubject : Subject {

    var observers = ArrayList<Observer>()
    var message: String = ""
    var changed: Boolean = false
    val MUTEX:Object = Object()

    override fun register(observer: Observer) {
        if(observer == null)
            throw NullPointerException("Null Observer")

        synchronized(MUTEX) {
            if(!observers.contains(observer))
                observers.add(observer)
        }
    }

    override fun unregister(observer: Observer) {
        synchronized (MUTEX) {
            observers.remove(observer)
        }
    }

    override fun notifyObservers() {
        var observersLocal:ArrayList<Observer> = ArrayList()

        synchronized(MUTEX) {

            //if changed return nothing
            if(!changed)
                return

            //if reached no change therefore assign observers and track change
            observersLocal = ArrayList(this.observers)
            changed = false
        }

        for (o: Observer in observersLocal)
            o.update()
    }

    override fun getUpdate(observer: Observer): String {
        return this.message
    }

    fun postMessage(msg: String) {
        println("Message Posted to Topic:" + msg)
        this.message = msg
        this.changed = true
//        notifyObservers()
    }
}
