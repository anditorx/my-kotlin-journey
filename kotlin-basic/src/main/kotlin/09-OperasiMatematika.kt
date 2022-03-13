fun main() {
    // + penjumlahan
    // - pengurangan
    // * perkalian
    // / pembagian
    // % modulus atau sisa bagi

    var result: Int = 10/3
    println(result)
    var result2: Int = 10+10/3
    println(result2)
    var result3: Double = 10.0/3.0
    println(result3)
    var result4 = 10.0/3.0
    println(result4)


    // Augmented Assignments
    // a=a+10 => a+=10 (ini versi augmented assignments)
    // a=a-10 => a-=10 (ini versi augmented assignments)
    // a=a*10 => a*=10 (ini versi augmented assignments)
    // a=a/10 => a/=10 (ini versi augmented assignments)
    // a=a%10 => a%=10 (ini versi augmented assignments)
    var panjangPersegiPanjang = 120
    var lebarPersegiPanjang = 60
    val luasPersegiPanjang = panjangPersegiPanjang * lebarPersegiPanjang
    println(luasPersegiPanjang)

    var stok: Int = 0
    var stokBuku = 50
    stok += stokBuku
    var stokPensil = 10
    stok+= stokPensil
    println(stok)

    // Unary Operator
    // ++ => a=a+1
    // -- => a=a-1
    // - => negative
    // + => positive
    // ! => boolean kebalikan
    stok++ //stok = stok + 1
    println(stok)

}