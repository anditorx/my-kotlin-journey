fun main() {
    // Break & Continue
    // Break & Continue digunakan dalam semua perulangan di Kotlin
    // Break digunakan untuk menghentikan seluruh perulangan
    // Continue digunakan untuk menghentikan perulangan yang berjalan, dan langsung melanjutkan ke perulangan selanjutnya
    println("Example Break")
    var i = 0
    while (true){
        println("Bilangan ke-$i")
        i++

        if (i>20){
            break
        }
    }

    println("")
    println("Example Continue")
    for (i in 1..20){

        if (i%2===0){
            continue
        }

        println("Bilangan ke-$i")
    }
}