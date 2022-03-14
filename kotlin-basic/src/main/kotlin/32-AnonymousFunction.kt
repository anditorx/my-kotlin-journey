/**
    * Lambda akan menganggap baris terakhir di blok lambda sebagai hasil kembalian
    * Kadang kita butuh membuat lambda yang se flexible function, dimana kita bisa mengembalikan hasil dimanapun
    * Untuk hal ini, kita bisa menggunakan Anonymous Function
    * Anonymous Function sebenarnya mirip dengan lambda, hanya cara membuatnya saja yang sedikit beda, masih menggunakan kata kunci func
 * */
fun main() {
    // Anonymous Function
    val anonymousUpper = fun(value: String): String {
        if (value.isBlank()){
            return "Ups"
        }
        return  value.uppercase()
    }
    println(hello("Andito",anonymousUpper))
    println(hello("",anonymousUpper))

    println("")

    // Anonymous Function as Parameter
    var param = "Ishiki"
    val result2 = hello(param, fun(value: String) : String {
        if (value.isBlank()){
            return "Ups"
        }
        return value.uppercase()
    })
    println(result2)
}

