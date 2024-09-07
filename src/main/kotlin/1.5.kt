import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    print("Введите число n >>> ")
    val n = readln().toIntOrNull()
    print("Введите основание степени x >>> ")
    val x = readln().toDoubleOrNull()
    if (n == null || x == null) {
        println("Неправильный ввод")
    }
    for (i in -sqrt(x!!).toInt()..sqrt(x).toInt()) {
        val result = x.pow(i)
        if (result == n!!.toDouble()) {
            println("Целочисленный показатель существует: ${result.toInt()}")
            return
        }
    }
    println("Целочисленный показатель не существует")
}