fun main() {
    //    Single expression function adalah deklarasi function hanya dengan 1 baris kode
    sayHello("Andi")

    luas(5,3)
}

fun sayHello(name:String) = println("Hi $name")

fun luas(p: Int, l: Int) = println(p*l)