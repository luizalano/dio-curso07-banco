package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Conta (
    val numero: String,
    val agencia: String,
    var saldo: BigDecimal
)
{
    fun deposito(valor: BigDecimal){
        this.saldo += valor
    }
    fun saque(valor: BigDecimal){
        if (this.saldo < valor) throw IllegalArgumentException("Saldo insuficiente!")
        this.saldo -= valor
    }
}