package one.digitalinnovation.digionebank

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
    ): Pessoa(nome, cpf), Logavel {

    override fun login(senha: String): Boolean {
        return this.senha == senha
    }

    override fun toString(): String {
        return "Cliente: " + this.nome + ", CPF: " + this.cpf + " Tipo: " + clienteTipo.nomeTipo
    }
}