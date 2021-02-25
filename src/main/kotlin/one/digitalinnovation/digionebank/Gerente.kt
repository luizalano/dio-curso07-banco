package one.digitalinnovation.digionebank

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: String) : Funcionario(nome, cpf, salario), Logavel {

    override fun calculaAuxilio(): Double {
        return salario * 0.2
    }

    override fun login(senha: String): Boolean {
        return (senha == this.senha)
    }

    override fun toString(): String {
        return "Gerente " + this.nome + ", CPF: " + this.cpf + " Ganhando: " + this.salario
    }

}