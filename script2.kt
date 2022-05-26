fun main() {
   // criar funcao para reverter strings
   var array = arrayOf("adsa", "bdsasda", "cdsadsa", "dqdqw", "euioouiuoi", "fasd", "gqwewqe", "hdassad")
 
   // criar funcao que conta vogais e consoantes
 
     fun calcVogaisConsoantes (array : Array<String>) {
       var vogais = 0
       var consoantes = 0
       var size = 0

       for (string in array) {
           size += string.length
           
          for (i in 0 until string.length) {
               if (string[i] == 'a' || string[i] == 'e' || string[i] == 'i' || string[i] == 'o' || string[i] == 'u')
                vogais++
           } 
       }

       consoantes = size - vogais
       println("Vogais $vogais")
       println("Vogais $consoantes")
     }
     
     calcVogaisConsoantes(array)
}