package testes

import kotlin.math.pow

fun main(){
    // X0 permite nulo, para verifica se é para sair do loop
    var x0: Float? = 0.0F
    // X recebe o valor de X0 para continuar as operações
    var x:Float
    var y: Float = 0.0F
    var continua:Boolean = true
    var operacao:Char

    while (continua) {
        print("Digite o primeiro valor: ")
        x0 = leFloat()
        // Se retornar null cai fora do loop
        if (x0 == null) continua = false
        if (continua) {
            // Cast para Float sem null
            x = x0 as Float

            print("Digite o segundo valor: ")
            // leFloat pode retornar null, então faz um Cast para conitnuar as operações
            y = leFloat() as Float
            operacao = leOperacao()

            when (operacao) {
                '+' -> println(x.toString()+" "+operacao+" "+y.toString()+" = "+ x.plus(y).toString())
                '-' -> println(x.toString()+" "+operacao+" "+y.toString()+" = "+ x.minus(y).toString())
                '*' -> println(x.toString()+" "+operacao+" "+y.toString()+" = "+ x.times(y).toString())
                '/' -> {
                    if (y == 0F) println("Divisão por zero!")
                    else println(x.toString()+" "+operacao+" "+y.toString()+" = "+ x.div(y).toString())
                }
                '^' -> println(x.toString()+" "+operacao+" "+y.toString()+" = "+ x.pow(y).toString())
                '!' -> println(x.toString()+" "+operacao+" "+y.toString()+" = "+ x.fatorial().toString())
            }
        }
    }
}

// Não aceita operação que não as programadas
// Se chegou até aqui tem que prosseguir
fun leOperacao():Char {
    var ok:Boolean = false
    var stIn:String?
    var chIn:Char = 'a'

    while (!ok) {
        println("Escolha a operação: + - * / ^ ! ")
        try {
            chIn = readLine()?.single() ?: 'a'
            if (chIn in "+-*/^!") ok = true
        } catch (ex: Exception) {
            ok = false
        }
    }
    // Não precisaria deste return aqui, mas o compilador reclama se não houver um return fora do laço
    return chIn
}

fun leFloat():Float?{
    var ok:Boolean=false
    var retorno:Float? = null
    var stIn:String = ""

    while (!ok) {
        stIn = readLine().toString()
        if (stIn.isEmpty()) return null

        // Se o valor digitado não puder ser convertido para Float, recebe a exceção e
        // pede novo valor
        try {
            return stIn.toFloat()
        } catch (ex: Exception) {
            println("Número não é válido")
        }
    }
    return 0.0F
}

fun Float.fatorial():Float{
    var fat:Float = 1F
    val limite = this.toInt()

    for (i in 1..limite) {
        fat *= i
    }
    return fat
}