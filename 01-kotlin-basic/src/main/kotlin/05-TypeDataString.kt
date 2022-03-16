fun main() {
    var firstName: String = "Andi"

    var lastName: String = "Rustianto"
    var notes: String ="""
        Ini adalah contoh note,
        Kalau mau seperti ini,
        gunakan tanda petik 3."""

    var notes2: String ="""
        |Ini adalah contoh note,
        |Kalau mau seperti ini,
        |gunakan tanda petik 3.""".trimMargin()

    var fullName: String = "$firstName $lastName"
    var nameLength: String = "$fullName length = ${fullName.length}"


    println(firstName)
    println(lastName)
    println(notes)
    println(notes2)
    println(fullName)
    println(nameLength)
}