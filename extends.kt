// classe com um parametro nome no construtor
class Pessoa(val name : String) {
    fun ola() {
        println("Ola ${this.name}")
    }
}

// nao necessariamente é preciso adicionar um atributo no contrutor da classe
class Person {
    
}

// é possivel adicionar valores default para parametros
// nao é obrigatorio colocar val antes dos nomes dos parametros
// sem o val nao é possivel acessar os parametros diretos sem o this
// nesse caso seria necessario criar variaveis auxiliares que recebam esses parametros
// utilizar o init, que é um tipo de construtor
class Music (val title : String, 
             val artist : String = "Artista desconhecido", 
             val duration : Int) {
    
    fun play() {
        println("Now playing ${this.title}")
    }
    
    fun pause() {
        println("Paused reproduction of ${this.title}")
    }
}

// e uma classe apenas para armazenar informacoes
// nesse caso é obrigatorio o uso de val/var
data class Artista(
val nome: String,
val albums: Int)


// polimorfismo, para isso criamos uma interface
// 

interface Funcionario {
    fun calcSalario()
    fun calcFerias()
}

class DevAndroid: Funcionario {
    // nesse caso usamos o override para sobrecarregar o metodo
    // nesse caso a classe implementa a funcao abstrata da interface
    override fun calcSalario() {
        println(1000)
    }
    
    override fun calcFerias() {
        println(10)
    }
}

class DevFullStack: Funcionario {
    // nesse caso usamos o override para sobrecarregar o metodo
    // nesse caso a classe implementa a funcao abstrata da interface
    override fun calcSalario() {
        println(900)
    }
    
    override fun calcFerias() {
        println(9)
    }
}

fun calcSalarios (funcionario: Funcionario) {
    funcionario.calcSalario()
}

fun main() {
   // nao é preciso utilizar New para criar o objeto
   // é uma das vantagens do Kotlin
   val pessoa = Pessoa("Julia")
   
   // chama o metodo ola da classe Pessoa
   // pessoa.ola()
   // 
   
   val musica = Music("Olha a onda", "Tchakabum", 115)
   println(musica.title)
   
   // é possivel passar os parametros em ordem ou passar de acordo com o nome do atributo
   val musica2 = Music(title = "Olha a onda", duration = 115)
   println(musica2.title)
   
   var funcionarioA = DevAndroid()
   var funcionarioF = DevFullStack()
   
   calcSalarios(funcionarioA)
   calcSalarios(funcionarioF)
}