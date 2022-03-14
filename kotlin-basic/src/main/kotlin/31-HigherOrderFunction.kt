/**
 * Higher-Order Function adalah function yang menggunakan function sebagai parameter atau mengembalikan function.
 * Penggunaan Higher-Order Function kadang berguna ketika kita ingin membuat function yang general
 * dan ingin mendapatkan input yang flexible beruba lambda, yang bisa dideklarasikan oleh si user ketika memanggil function tersebut
 *
 * */
fun main() {
    // Higher-Order Function
    val upperTransformer = {value: String -> value.uppercase()}
    val lowerTransformer = {value: String -> value.lowercase()}
    println(hello("Andi", upperTransformer))
    println(hello("Dante", lowerTransformer))

    println("")

    // Trailing Lambda
    val result1 = hello("Rossi" ) { value: String ->
        value.uppercase()
    }
    val result2 = hello("Jimmy" ) { value: String ->
        value.lowercase()
    }
    println(result1)
    println(result2)
}

fun hello(value: String, transformer: (String) -> String) : String{
    return "Hello ${transformer(value)}"
}