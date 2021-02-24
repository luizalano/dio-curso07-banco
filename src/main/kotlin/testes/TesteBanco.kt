package testes

import one.digitalinnovation.digionebank.Banco
import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    val bb = Banco(nome = "Banco do Brasil", numero = 1)
    val bb1 = bb.copy("Caixa Econômica", 237)
    println(bb)
    println(bb1)
    ClienteTipo.values().forEach { elemento -> println("Elemento lido-> ${elemento.nomeTipo}, ${elemento.ordinal} ")}
    val pf = ClienteTipo.pj

    println("Uma cópia de clientetipo ${pf.nomeTipo}")
}