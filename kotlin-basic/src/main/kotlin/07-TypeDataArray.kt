fun main() {

    // Array adalah tipe data, yang isinya merupakan kumpulan data dengan tipe yang sama
    // Pada kotlin, tipe data array di representasikan dengan keyword Array
    val members: Array<String> = arrayOf("Andi","Piere","Budi", "Dante", "Jaka")
    val values: Array<Byte> = arrayOf(100,90,95)
    val balances: Array<Int> = arrayOf(20,10,34,29,29)
    println(members)
    println(values)
    println(balances)

    // mengakses data di dalam array
    val member1: String = members[0]
    val member2: String = members.get(1)
    println(member1)
    println(member2)

    // merubah isi data di dalam array
    members.set(1,"Rusti")
    println(members[1])

    //Array Nullable
    // Array di kotlin tidak boleg null
    // Apabila mau membuat array yang datanya null, kita bisa gunakan ?(tanda tanya)
    val student: Array<String?> = arrayOfNulls(5)
    student.set(0, "Jimmy")
    student.set(1, null)
    println(student)
}