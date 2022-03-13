fun main() {
//    Infix Notation adalah operasi yang biasa dilakukan di operasi matematika,
//    dimana dia melakukan operasi terhadap dua data

//    Hampir semua operasi matematika adalah infix notation
//    Untuk menggunakan function infix notation, tidak wajib menggunakan tanda . (titik)


//    Syarat:
//    - Harus sebagai function member (akan dibahas di OOP) atau function extension
//    - Harus memiliki 1 parameter
//    - Parameter tidak boleh varargs dan tidak boleh memiliki nilai default
    val textUpper: String = "Andi" to "UP"
    val textLow: String = "Andi" to "LOW"
    println(textUpper)
    println(textLow)
}

infix fun String.to(type: String): String {
    if (type == "UP"){
        return this.uppercase()
    }else{
        return this.lowercase()
    }
}