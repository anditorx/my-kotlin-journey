fun main() {
//    Extension Function
//    Extension function adalah kemampuan menambahkan function pada tipe data yang sudah ada
//    Extension function adalah salah satu fitur yang sangat powerfull,
//    namun harap bijak menggunakannya, karena jika terlalu banyak digunakan, akan membuat program sulit dimengerti,
//    karena terlihat seperti magic

//    Untuk membuat extension function, kita cukup menambahkan tipe data pada nama function nya,
//    lalu diikuti dengan tanda . (titik)

//    Untuk mengakses data nya di extension function, kita bisa menggunakan kata kunci this

    var name1: String = "Andi"
    var name2: String = "Jude"

    name1.hello()
    name2.hello()
    "Hana".hello()
}

fun String.hello(): Unit{
    println("Hello $this")
}