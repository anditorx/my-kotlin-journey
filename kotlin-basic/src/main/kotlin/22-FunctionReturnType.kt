fun main() {
    // Untuk memberitahu bahwa function mengembalikan data,
    // kita harus menuliskan tipe data kembalian dari function tersebut.
    // Jika function tersebut kita deklarasikan dengan tipe data pengembalian,
    // maka wajib di dalam function nya kita harus mengembalikan data
    // Untuk mengembalikan data dari function, kita bisa menggunakan kata kunci return, diikuti dengan datanya
    var result = sum(10,3)
    println(result)
}

fun sum(a:Int, b:Int): Int {
    val total = a+b
    return total
}