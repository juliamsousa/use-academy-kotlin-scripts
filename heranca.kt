// o operador open permite que a classe seja herdada
// é possivel fazer tambem com classes abstratas
open class Veiculo (var modelo: String, var cor: String){
    fun andar(){
        println("Andar")
    }
    
    // com a palavra reservada open é possivel sobrescrever a funcao
    open fun acelerar(){
        println("Acelerar")
    }
} 

// é necessario repetir os atributos da classe pai na classe filha
class Carro(override var modelo: String, 
            override var cor: String, 
            var ano: Int): Veiculo (modelo, cor){
    
    fun abreTetoSolar(){
        println("Abrir teto")
    }
    
    override fun acelerar(){
        println("Vrum vrum")
        // com isso é chamada a funcao acelerar da funcao pai
        super.acelerar()
    }
}

// encapsulamento, utilizar metodos e atributos privados
class Pessoa(){
    // atributo privado que sera instaciado posteriormente
    private lateinit var name: String
    
    fun setName(nameParameter: String){
        name = nameParameter
    }
    
    fun getName(): String {
        return name
    }
}

class Aviao(){
    // sobrecarga de métodos de uma classe
    // quando fazermos sobrecarga o tipo de retorno deve ser o mesmo
    fun voar(velocidade: Int){
        println(velocidade)
    }
    
    fun voar(velocidade: Int, altura: Int){
        println(velocidade)
        println(altura)
    }
    
    fun voar(){
        println("Voar")
    }
}

// funcoes lambda
// sao utilizadas para quando queremos passar uma funcao como parametro de outra funcao


fun main() {
   val kotlin = "🙂"
   println(kotlin)
}