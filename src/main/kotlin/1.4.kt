fun main() {
    val input = readln().split(' ')
    if (input.count() != 3) {
        return
    }
    val first = input[0].toDoubleOrNull()
    val second = input[1].toDoubleOrNull()
    if (first == null || second == null) {
        return
    }
    val operation = input[2]
    when (operation) {
        "+" -> println(first + second)
        "-" -> println(first - second)
        "/" -> println(first / second)
        "*" -> println(first * second)
        else -> return
    }
}