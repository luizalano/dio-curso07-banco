package testes

fun main(args: Array<String>) {
    //insira as variaveis corretamente
    var r = 0
    for (i in 0..readLine()!!.toInt()) {

        println("$i ${i * i} ${i * i * i}")

        r += 0
    }
}

/*fun main(args: Array<String>) {

    for (i in  1.rangeTo(readLine()!!.toInt()).step(2)) println(i)

}
import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val a = input.nextInt()
    val b = input.nextInt()
    println("SOMA = "+ (a + b))  //insira as variáveis corretamente

}
*/