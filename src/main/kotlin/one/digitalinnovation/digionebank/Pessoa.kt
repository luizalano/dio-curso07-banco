package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String
        get() = field.toLowerCase()
        set(value) {
            if (!value.isNotEmpty()) {
                throw IllegalArgumentException("Nome não pode estar em branco")
            }
            field = value.toUpperCase()
        }
    var cpf: String
        set(value) {
            if (!value.isNotEmpty()) {
                throw IllegalArgumentException("CPF não pode estar em branco")
            }
            field = value
        }

    inner class endereco {
        val nomeRua: String = "Rua Pio XII"
        val numero: Int = 1361
    }

    constructor(nome: String, cpf: String) {
        this.nome = nome
        this.cpf = cpf
    }
}

fun main() {
    val p1 = Pessoa("Luiz Alberto Alano", cpf = "666.658.659-88")

    p1.cpf = "111.222.333.55"

    println(p1.nome + " " + p1.cpf)
    println(p1.endereco().nomeRua + ", " + p1.endereco().numero)
}

