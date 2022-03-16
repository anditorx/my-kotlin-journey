fun main() {
//    Recursive function adalah salah satu kemampuan bagus di Kotlin, namun sayangnya ada keterbatasan dalam penggunaan recursive
//    Jika recursive function yang kita buat, saat dijalankan memanggil function dirinya sendiri terlalu dalam,
//    maka bisa dimungkinkan akan terjadi error stack overflow.

//    Namun di Kotlin, masalah ini ada solusinya, yaitu dengan menggunakan tail recursive function
//    Tail recursive function adalah teknik mengubah recursive function yang kita buat, menjadi looping biasa ketika dijalankan
//    Tidak semua recursive function bisa secara otomatis dibuat menjadi tail recursive function, ada syarat-syarat nya

//    Syarat Tail Recursive Function:
//    Tambahkan tailrec di functionnya
//    Saat memanggil function dirinya sendiri, hanya boleh memanggil function dirinya sendiri, tanpa embel-embel operasi dengan data lain

    tailrec fun display(value: Int){
        println(value)
        if (value>0){
            display(value-1)
        }
    }

    display(20)

    println("")

    tailrec fun factorialTail(value: Int, total: Int = 1): Int {
        return  when (value) {
            1 -> total
            else -> factorialTail(value-1, total * value)
        }
    }

    println(factorialTail(10))

}


