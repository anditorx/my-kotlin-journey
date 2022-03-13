fun main() {
    val minimalAbsen = 12
    val minimalUTS = 80
    val minimalUAS = 75

    val currentAbsen = 12
    val nilaiUTS = 75
    val nilaiUAS = 80

    val statusLulusAbsen = currentAbsen>=minimalAbsen
    val statusLulusUTS = nilaiUTS>=minimalUTS
    val statusLulusUAS = nilaiUAS>=minimalUAS

    if (statusLulusAbsen && statusLulusUTS && statusLulusUAS){
        println("LULUS!")
    }else{
        println("TIDAK LULUS!")
    }
}