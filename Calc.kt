//Calculadora que detecta o tipo de equação que você deseja!
//Aut: Douglas Ribeiro Sanguino

fun main() {
    println("Olá, seja muito Bem-Vindo a nossa calculadora!")
    println("Considere a seguir os números para o tipo de operação!")
    println("Por Favor digite o tipo de operação que você deseja:")
    println(
        "1 - Para Soma ( + )" + "\n2 - Para Subtração ( - )" + "\n3 - Para Multiplicação ( * )"
                + "\n4 - Para Divisão ( / )"
    )
    val operation = readLine()!!.toInt()
    val numberToText = when (operation) {
        1 -> "Soma"
        2 -> "Subtração"
        3 -> "Multiplicação"
        4 -> "Divisão"
        else -> System.exit(0)
    }
    println("Hum, " + numberToText + ", ok...")

    val TextOperation = when (operation){
        1 -> "Somar"
        2 -> "Subtrair"
        3 -> "Multiplicar"
        4 -> "Dividir"
        else -> ""
    }
    val operation2 = when (operation){
        1 -> "+"
        2 -> "-"
        3 -> "*"
        4 -> "/"
        else -> ""
    }
    println("Por Favor digite o primeiro número que você deseja " + TextOperation + ":")
    val n1 = readLine()!!.toInt()
    println("Por favor digite o segundo número que você deseja " + TextOperation + ":")
    val n2 = readLine()!!.toInt()
    var total = when (operation){
        1 -> n1.toFloat()+n2.toFloat()
        2 -> n1.toFloat()-n2.toFloat()
        3 -> n1.toFloat()*n2.toFloat()
        4 -> n1.toFloat()/n2.toFloat()
        else -> ""
    }
    println("A "+ numberToText + " entre " + n1 + operation2 + n2 + " é de: " + total)
}