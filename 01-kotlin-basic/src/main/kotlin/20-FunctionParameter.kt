fun main() {
    // FUNCTION PARAMETER
    // Saat membuat function, kadang-kadang kita membutuhkan data dari luar, atau kita sebut parameter.
    // Jika kita menambahkan parameter di function,
    // maka ketika memanggil function tersebut, kita wajib memasukkan data ke parameternya

    sayHello("Andi", "Rustianto")

    // function default parameter
    println("")
    hellow("Kai")
    hellow("Kai", "Harvertz")

    // Function Named Argument
    println("")
    fullName(firstName = "Ali", lastName = "Abu Tholib", middleName = "Bin")
}

fun sayHello (firstName: String, lastName: String){
    println("Hello $firstName $lastName")
}

// function default parameter
fun hellow (firstName: String, lastName: String = ""){
    println("Hello $firstName $lastName")
}

// Function Named Argument
//Named Argument adalah fitur dimana kita bisa menyebutkan nama parameter saat memanggil function,
// dengan demikian kita tidak wajib tahu posisi tiap parameter
fun fullName(firstName: String, middleName: String, lastName: String){
    println("Hello $firstName $middleName $lastName")
}