fun main() {
    println("Введите строку")
    val input = readln()
    var chars = input.toList().distinct().sorted()
    var result = ""
    for (char in chars) {
        result += "$char - ${input.count { c -> c == char }}\n"
    }
    println("Результат:\n$result")
}