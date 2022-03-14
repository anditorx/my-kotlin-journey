/**
 * Function di kotlin adalah first-class citizens, artinya dianggap seperti tipe data yang lainnya.
 * Bisa disimpan di variable, array, bahkan bisa dikirim ke parameter function itu sendiri
 * Lambda expression secara sederhana adalah function yang tidak memiliki nama
 * Biasanya saat kita membuat function, kita akan selalu membuat menggunakan kata kunci fun dan mendeklarasikan nama function nya
 * Dengan lambda expression, kita bisa membuat function tanpa harus mendeskripsikan function nya

 **/
fun main() {

    // Lambda Expression di variable
    val lambdaName1: (String) -> String = { value: String ->
        value.uppercase()
    }
    val name1 = lambdaName1("Andi")
    println(name1)

    println("")

    // It
    val lambdaName2: (String) -> String = {
        it.uppercase()
    }
    val name2 = lambdaName2("Susilo")
    println(name2)

    println("")

    // Method References
    val lambdaName3: (String) -> String = ::toUpper // memanggil function toUpper
    val name3 = lambdaName3("Kromokarto")
    println(name3)
}

fun toUpper(value: String): String = value.uppercase()