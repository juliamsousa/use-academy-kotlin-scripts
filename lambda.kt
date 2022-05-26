fun calcula(a: Int, b: Int, lambda: (Int, Int) -> Int): Int {
    return lambda(a, b)
}

fun main() {
    // tambem nao e necessario o tipo da funcao
   val upperCase: (String) -> String = {
       // a declaracao desse tipo nao e obrigatoria
       str: String -> str.uppercase()
   }
   
   val soma : (Int, Int) -> (Int) = {x, y -> x+y}
   val mult : (Int, Int) -> (Int) = {x, y -> x*y}
   
   println(calcula(5, 10, soma))
   println(calcula(5, 10, mult))
}