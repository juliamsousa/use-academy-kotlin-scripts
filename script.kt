/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun main() {
    var x : Int = 1

    /**
         while(x < 100) {
            x = x + (x + 1)
            println(x)
        }
     */
    
    /**
    do {
        x = x + (x + 1)
        println(x)
    } while (x < 100)
    */
    
    // range fechado de 0 a 5
    val cr = 0..5
    // range parcialmente fechado de 0 a 4
    // nesse caso serão feitos de forma crescente
    val hor = 0 until 5
    
    // range decremental de 0 a 5
    val dr = 5 downTo 0
    
    // a palavra step faz com que pulemos de valor em valor
    // n da pra colocar step negativo
    
    /*for (i in 5 downTo 0) {
        println(i)
    }*/
    
    // Array: armazena variaveis de mesmo tipo em uma unica estrutura
    // apresentam tamnanho fixo, sao indexados a partir de 0
    
    val array = arrayOf(1, 3, 5, 7, 9) // declaracao implicita, nao é passado o tipo do array
    val intArray = arrayOf<Int>(1, 3, 5, 7, 9) // declaracao explicita, é passado o tipo do array
    val size = intArray.size
    
    /*for(i in 0 until intArray.size) {
        print (" " + intArray[i])
    }*/
    
    // checar se um elemento existe em uma lista
    
    val cars = arrayOf("Volvo", "Fusca", "Porsche", "Ferrari")
    
   /* if("Volvo" in cars) {
        println("Is in cars")
    }  else {
        println("Is not in cars")
    }
    
    for (car in cars) {
        println(car)
    } */
    
    
    // funcoes em kotlin
    // passando parametros na funcao
   
 	/*fun printWelcome(array : Array<String>, avaliacao : Int) {
        for (participante in array) {
            println("Boas vindas $participante!")
            println("Sua avaliacao é: $avaliacao!")
        }
    }
    
    var participantes = arrayOf("Julia", "Evelyn", "Kelly", "Flávia")
    printWelcome(participantes, 10)*/
 
 	// funcao com valor de retorno ao final dos parametros
 	/*fun mult (n1 : Int, n2 : Int) : Int {
        return n1 * n2
    }
    
    println (mult(1, 2))*/
    
    fun calc (taxa : Double, saldo : Double) : Double {
        if (saldo == 0.0) return 0.0
        
        return saldo - saldo * taxa
    }
    
   // println (calc(0.23, 103499.32))
   
   
   // tipo Unit, quando nao temos interesse no retorno de uma funcao
   // semelhante ao tipo void
   // ele pode estar implicito ou explicito no codigo retirando o unit dos argumentos e do return
   
   fun deposit(value : Double, balance : Double) : Unit {
       var balance = balance + value
       println(balance)
       return Unit
   }
   
   // deposit(200.0, 5000.0)
   
   // Nulabilidade
   // ausencia de valor
   // linguagem com null safety, nao podemos atribuir null diretamente a uma variavel
   // para ativar o null devemos colocar o ? na frente do tipo da variavel
  
   var fisrtName : String? = null
    
   // fazer casting de tipo
 
   
    var obj = "Bootcamp"
    
    // é possivel fazer casting nao seguro
    val x : Int? = obj as Int
    // esse cast é mais seguro pois trata a nulidade de obj
    val x : Int? = obj as Int?
  
}

// o kotlin permite criar funcoes fora de classes, sendo top level
// podem ficar em arquivos *.kt tambem
// o java permite funcoes apenas em classes


  var aux = arrayOf("a", "b", "c", "d", "e", "f", "g", "h")
  
    
   for (i in 0 until size) {
       array[i] = aux[size-1-i]
   }
   
   for (string in array) {
       println(string)
   }