package testes

import one.digitalinnovation.digionebank.*
import java.math.BigDecimal

fun main(){
    val bb = Banco(nome = "Banco do Brasil", numero = 1)
    val bb1 = bb.copy("Caixa Econômica", 237)
    val nl = System.getProperty("line.separator")
    val eu = Analista(nome = "Luiz Alberto Alano", cpf = "555.666.777.00", salario = 32222.9)
    val tu = Gerente(nome = "Seu Zé do Dogão", cpf = "111.222.333.444-55", salario = 2500.0, senha = "*****")
    val ele = Cliente(nome = "Clientão Especial", cpf = "123.456.789.99", ClienteTipo.pf, senha = "555444")

    //println(eu.nome + ", com cpf " + eu.cpf + ", está ganhando " + eu.salario + "Bônus de " + eu.calculaAuxilio())
    println(eu)
    println("-------------------$nl---------")
    println(tu)
    println(tu.login("*****"))
    println(tu.login("***w**"))
    println("-------------------" + nl + "---------")
    println(ele)
    println("----------------------------")
    println(bb)
    println(bb1)
    ClienteTipo.values().forEach { elemento -> println("Elemento lido-> ${elemento.nomeTipo}, ${elemento.ordinal} ")}
    val pf = ClienteTipo.pj

    println("Uma cópia de clientetipo ${pf.nomeTipo}")
}