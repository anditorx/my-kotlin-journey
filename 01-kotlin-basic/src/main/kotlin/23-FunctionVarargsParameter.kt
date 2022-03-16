fun main() {
//    Parameter yang berada di posisi terakhir, memiliki kemampuan dijadikan sebuah varargs
//    Varargs artinya datanya bisa menerima lebih dari satu input, atau anggap saja semacam Array.
//    note: dengan catatan penulisan vargs harus berada di sebelah kanan parameter
    val res = total(10,10,10,10)
    val res2 = total2("Andi", 10,5,4,1,12,0,21,23,11)
    println(res)
    println(res2)
}

// perhatikan penulisan vararg, kalau hanya 1 parameter berarti langsun di tuliskan saja seperti di bawah ini

fun total(vararg values: Int): Int{
    var result = 0

    for (value in values) {
        result += value
    }

    return result
}

// Apabila lebih dari 1 parameter, maka penulisan vararg harus berada di paling kanan
fun total2(name: String, vararg values: Int): Int{
    var result = 0

    for (value in values) {
        result += value
    }

    return result
}