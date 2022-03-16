fun main() {
    // Function scope adalah ruang lingkup dimana sebuah function bisa diakses
//    Saat kita membuat function di dalam file kotlin, maka secara otomatis function tersebut bisa diakses
//    dari file kotlin manapun

//    Jika kita ingin membatasi misalnya sebuah function hanya bisa diakses dalam function tertentu,
//    maka kita bisa membuat function di dalam function

    fun sayHello(name: String): Unit {
        println("Hello $name")
    }

    sayHello("Andi Rustianto")

}