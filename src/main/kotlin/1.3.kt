fun main() {
    println("Введите строку")
    val input = readln().toIntOrNull() ?: return
    println("Результат: ${input.toString(2)}")
}