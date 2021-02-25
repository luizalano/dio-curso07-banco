package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Analista(
    nome: String,
    cpf: String,
    salario: Double)
    :Funcionario(nome, cpf, salario) {
    public override fun calculaAuxilio(): Double {
        return salario * 0.1
    }

    override fun toString(): String {
        return "Analista " + this.nome + ", CPF: " + this.cpf + " Ganhando: " + this.salario
    }
}