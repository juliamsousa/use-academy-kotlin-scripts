    class Cat{
        // modificadores de acesso
        // private: só sao acessados pela propria classe
        // protected: pode ser acessado pela mesma classe ou classes que herdam dela
        public var name: String
        private var race: String? = null
        protected var age: Int? = null

        constructor(name: String, race: String) {
            this.name = name
            this.race = race
        }

        constructor(name: String, age: Int) {
            this.name = name
            this.age = age
        }
    }

    // classe abstrata
    // serve para criar uma classe geral com metodos que serao usados pelas subclasses
    // os metodos poderão ser alterados de acordo com a necessidade da classe
    // podemos ter metodos abstratos e nao abstratos

    abstract class Calculator {
        abstract fun calculate (x: Int, y: Int): Int
    }

    // classe add que herda de calculator
    // é obrigatoria a implementacao de metodos de abstratos
    class Add: Calculator() {
        override fun calculate (x: Int, y: Int): Int {
            return x + y
        }    
    }
    
    class Sub: Calculator() {
        override fun calculate (x: Int, y: Int): Int {
            return x - y
        }
    }
    
    class Mult: Calculator () {
        override fun calculate (x: Int, y: Int): Int {
            return x * y
        }
    }
    
    class Div: Calculator () {
        override fun calculate (x: Int, y: Int): Int {
            return x / y
        }
    }
    
    abstract class Employee (val name: String, val experience: Int) {
        abstract var salary: Double
        
        abstract fun birthday(date: String)
        
        fun employeeDetails() {
            println("Nome: ${name}")
            println("Tempo de experiencia: ${experience}")
            println("Salario anual: ${salary}")
        }
    }
    
	// quando herdamos os atributos do filho devem passados pro pai
    class Engineer(name: String, experience: Int): Employee(name, experience) {
        override var salary = 50000.00
        override fun birthday(date: String){
            println("Data de nascimento: $date")
        }
    }
    
	// uma interface é um contrato, nos obriga a implementar os metodos
	// interfaces apresentam assinatura das funcoes
	// diferença classe abstrata x interface
	// 	é possivel colocar variaveis em interfaces mas é mais utilizada para assinatura de funcoes
    interface Watch {
        fun connect()
        fun disconnet()
        fun getSteps()
    }
    
    class XiaomiWatch(): Watch {
        override fun connect(){
            
        }
        
        override fun disconnet(){
            
        }
        
        override fun getSteps(){
            
        }
    }
    
    fun main() {
       val eng = Engineer("Bife", 3)
       eng.employeeDetails()
    }
    
    
    
    
    
    
    
    
    
  