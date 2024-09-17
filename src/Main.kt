fun main() {
    print("Введите первое число: ")
    val chislo1 = readLine()!!.toDouble()

    print("Введите второе число: ")
    val chislo2 = readLine()!!.toDouble()

    if (chislo2 == 0.0) {
        println("Деление на ноль невозможно")
    } else {
        val result = chislo1 / chislo2
        println("$chislo1 / $chislo2 = $result")
    }
}
