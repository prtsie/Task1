fun main() {
    println("Введите строку")
    val input = readln()
    if (input.isEmpty()) {
        println("Неверный ввод")
        return
    }
    var result = ""
    var lastChar = input[0]
    var count = 1
    for (i in 1 until input.length) {
        if (input[i] == lastChar) {
            count++
        }
        else {
            if (count == 1)
            {
                result += lastChar
            }
            else
            {
                result += lastChar + count.toString()
            }
            count = 1
            lastChar = input[i]
        }
    }
    if (count == 1)
    {
        result += lastChar
    }
    else
    {
        result += lastChar + count.toString()
    }
    println("Результат: $result")
}