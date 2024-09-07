fun main() {
    println("Введите строку({число} {число} {оператор})")
    val input = readln().split(' ')
    if (input.count() != 3) {
        return
    }
    val first = input[0].toDoubleOrNull()
    val second = input[1].toDoubleOrNull()
    if (first == null || second == null) {
        println("Неверный ввод")
        return
    }
    val operation = input[2]
    print("Результат: ")
    when (operation) {
        "+" -> println(first + second)
        "-" -> println(first - second)
        "/" -> println(first / second)
        "*" -> println(first * second)
        else -> {
            println("Неверный ввод")
            return
        }
    }
}