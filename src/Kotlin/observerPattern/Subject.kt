package Kotlin.observerPattern


interface Subject {
    fun register(observer: Observer)
    fun unregister(observer: Observer)
    fun notifyObservers()
    fun getUpdate(observer: Observer): String
}
