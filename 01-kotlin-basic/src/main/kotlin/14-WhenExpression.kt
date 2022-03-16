fun main() {
    // When expression digunakan untuk melakukan pengecekan ke kondisi dalam satu variable
    val finalExam = "D"
    when (finalExam){
        "A" -> println("Amazing")
        "B" -> println("Good")
        "C" -> println("Not Bad")
        "D" -> println("Nice Try!")
        "E" -> println("Please, Try again!")
        else -> println("Ups!")
    }

    // When expression Multiple Option
    when(finalExam){
        "A","B","C" -> println("Pass")
        else -> {
            println("Not Pass!")
        }
    }

    // When expression In
    val passValues = arrayOf("A", "B", "C")
    when(finalExam){
        in passValues -> println("Pass")
        !in passValues -> println("Try Again!")
    }

    // When Expression Is
    val name = "Andi"
    when (name){
        is String -> println("This is String")
        !is String -> println("This is not string")
    }

    // when sebagai pengganti if else
    // untuk mengganti if else dengan when, kita tidak perlu menggunakan variable dalam when
    val examValue = 90
    when{
        examValue > 80 -> println("Good Joob")
        examValue > 60 -> println("Not Bad")
        else -> println("Try again next year")
    }

}