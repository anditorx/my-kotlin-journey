/**
 * Closure adalah kemampuan sebuah function, lambda atau anonymous function berinteraksi dengan data-data disekitarnya dalam scope yang sama
 * Harap gunakan fitur closure ini dengan bijak saat kita membuat aplikasi

 * */

fun main() {
    var counter: Int = 0
    val lambdaIncrement: () -> Unit = {
        println("Increment - $counter")
        counter++
    }
    val anonymousIncrement = fun() {
        println("Increment - $counter")
        counter++
    }

    fun funcIncrement(){
        println("Increment - $counter")
        counter++
    }
    lambdaIncrement()
    anonymousIncrement()
    funcIncrement()
}