fun main() {
    // For dilakukan untuk melakukan perulangan array / range

    // for array
    val students = arrayOf("Andi", "Budi", "Riski", "Joko")
    var total = 0
    for (name in students){
        println(name)
        total++
    }
    println("Total perulangan = $total")

    // for range
    for (value in 1..10){
        println(value)
    }

    println("")
    for (value in 20 downTo 1 step 2){
        println(value)
    }

    println("")
    for (i in 0..10){
        println(i)
    }

    println("")
    var ukuranArray = students.size-1
    for (i in 0..ukuranArray){
        println("Index ke-$i => ${students.get(i)}")
    }

    println("")
    println("Mencetak bilangan genap")
    for (i in 0..10 step 2){
        println(i)
    }

    println("")
    println("Mencari bilangan ganjil genap")
    for (i in 1..10){
        if (i % 2 == 0){
            println("$i - GENAP")
        }else if (i % 3 === 0){
            println("$i - KELIPATAN 3")
        }else{
            println("$i - GANJIL")
        }
    }

}