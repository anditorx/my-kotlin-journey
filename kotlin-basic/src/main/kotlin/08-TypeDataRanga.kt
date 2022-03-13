fun main() {
    // Type Data Range digunakan untuk membuat array yang berisi data yang berurutan
    // Caranya menggunakan ..
    // contoh val range = 1 .. 10
    val range = 0..10
    println(range) // print range
    println(range.count()) // menghitung jumlah data di variable range
    println(range.contains(5)) // cek ada gak 5 di dalam range
    println(range.contains(11))// cek ada gak 11 di dalam range
    println(range.first) // melihat isi data array 1 atau index ke-0
    println(range.last)// melihat isi data array terakhir atau index terakhir
    println(range.step) // step nya, naik 1

    val range2 = 10 downTo 1
    println(range2.first) // melihat isi data array 1 atau index ke-0
    println(range2.last) // melihat isi data array terakhir atau index terakhir
    println(range2.step) // stepnya turin 1, berarti -1

    val range3 = 20 downTo 1 step 2
    println(range3.count())
}