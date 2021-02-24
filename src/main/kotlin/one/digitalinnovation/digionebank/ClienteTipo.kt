package one.digitalinnovation.digionebank

enum class ClienteTipo(val nomeTipo: String) {
    pf("Pessoa física"),
    pj("Pessoa jurídica");

    //  Permite a declaração de métodos estáticos
    companion object {

    }
}