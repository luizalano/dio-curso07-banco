package testes

fun main(){
    val d: Double = 123135456.654
    println(d.toString() + " é igual a " + d)
    val num1 = 10
    var num2 = 5
    num2 += num1
    println(num2)
    num2 = num2.plus(100)
    println(num2)
    val bingo = listOf(2,6,4,7,8)
    var number = (1..60).random()

    println(bingo)
    for (i in 1..20 ) {
        println(i.toString() + " - " + number.toString() + " -> " + (number in bingo) +
                " Com Range de 1 a 10 -> " + i.toString() + " - " + number.toString() + " -> " + (number in 1..10))
        number = (1..60).random()
    }

    println("----------------------")
    var str:String = "Palavra1 Palavra2"
    println(str.transforma())

    // Atribuição condicional

    var num3 = 0
    num3 = if(num1 > num2) num1 else num2
    println(num3)

    num3 = if (num1 > num2){
        1
    } else if (num2 > num1*10) {
        2
    } else {
        3
    }
    println(num3)

}

// Esse tipo de função só pode ser chamado por um objeto do mesmo tipo, neste caso um String
// O valor do objeto é acessado por this
fun String.transforma()= this.toUpperCase().decapitalize()



