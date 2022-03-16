fun main() {
//    Kadang salam sebuah function, kita sering menggunakan If expression atau when expression,
//    lalu di dalam blok nya kita mengembalikan nilai untuk sebuah function

//    Kotlin mendukung return if atau when, dimana fitur ini bisa mempermudah kita ketika
//    ingin mengembalikan nilai dalam if atau when


    // RETURN IF
    fun sayHi(name: String = ""): String {
        return if(name == ""){
            "Hello No Name"
        }else{
            "Hello $name"
        }
    }
    println(sayHi())

    // RETURN WHEN
    fun sayHello(name: String = ""): String {
        return when(name){
            "" -> "Hello No Name"
            else -> "Hello $name"
        }
    }
    println(sayHello("Jono"))

}