fun main() {
   println("Digite a operação desejada")
   var operacao = readln()
   var valor1 = 20
   var valor2 = 40
   
   when (operacao) {
       "+" -> {
       	var resultado = valor1 + valor2
        println("${valor1} + ${valor2} = ${resultado}")
       }
       
       "-" -> {
        var resultado = valor1 - valor2
       	println("${valor1} - ${valor2} = ${resultado}")
       }
       
       "*" -> {
        var resultado = valor1 * valor2
        println("${valor1} * ${valor2} = ${resultado}")
       }
       
       "/" -> {
        var resultado = valor1 / valor2
        println("${valor1} / ${valor2} = ${resultado}")
       }
   }
    
}
