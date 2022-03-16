// Constant
// Constant adalah immutable data, bedanya constant ini dapat diakses secara global (studi kasus: OOP)
// biasanya untuk nama variable constant ini menggunakan UPPER_CASE
const val APP = "Kotlin Basic"
const val VERSION = "0.0.1"


fun main() {
    var firstName = "Andi"
    // Immutable
    // variable val cannot be reassigned. mungkin bisa dibilang, mirip const kalau di javascript.
    // atau konstanta, tidak dapat dirubah
    val year = 2022
    firstName = "Rustianto"

    // Nullable
    // saat membuat variable di kotlin, wajib diisi. Jika tidak diisi, maka akan error.
    // kotlin mendukung variable yang boleh null atau tidak memiliki data
    val lastName = null
    var midName: String? = null



    println(firstName)
    println(year)
    println(lastName)
    println(midName)
    println(midName?.length)
    val appVersion ="$APP - Version:$VERSION"
    println(appVersion)
}