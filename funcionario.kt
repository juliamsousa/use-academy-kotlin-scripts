abstract class Funcionario(
    val nome: String, 
    val matricula: String, 
    val salario_base: Double) {
    
    abstract fun calculaSalario(): Double
}

class Gerente(
    nome: String,
    matricula: String,
    salario_base: Double
): Funcionario(nome, matricula, salario_base) {
    
    override fun calculaSalario(): Double {
        return this.salario_base * 2
    }
}

class Assistente(
    nome: String,
    matricula: String,
    salario_base: Double
): Funcionario(nome, matricula, salario_base) {
    
    override fun calculaSalario(): Double {
        return this.salario_base
    }
}

class Vendedor(
    nome: String,
    matricula: String,
    salario_base: Double,
    var comissao: Double
): Funcionario(nome, matricula, salario_base) {
    
    override fun calculaSalario(): Double {
        return this.salario_base + this.comissao
    }
}


fun main() {
    var gerente = Gerente("Bife", "123453", 7500.0)
    var assistente = Assistente("Lucas", "2132132", 4500.0)
    var vendedor = Vendedor("Julia", "3213123", 2000.0, 500.0)
    
    var salGerente = gerente.calculaSalario()
    var salAssistente = assistente.calculaSalario()
    var salVendedor = vendedor.calculaSalario()
    
    println("Salarios dos funcionarios:")
    println("Gerente: $salGerente")
    println("Assistente: $salAssistente")
    println("Vendedor: $salVendedor")
}
