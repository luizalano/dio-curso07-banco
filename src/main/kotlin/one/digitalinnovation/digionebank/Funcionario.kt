package one.digitalinnovation.digionebank

import java.math.BigDecimal

abstract class Funcionario(
    override var nome: String,
    override var cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) {
    protected abstract fun calculaAuxilio(): Double
}