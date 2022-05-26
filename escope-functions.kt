    // tratativas de excecoes
    // try - catch
    // firebase

    // null safety: !! informa ao sistema que essa variavel nao é nula
    // para que uma variavel possa ser nula devemos colocar o sinalizador ? nela
    // funcao let, executa caso a variavel naop seja nula
	// escope functions, let
	// essas funcoes evitam repetições de código e organizam o codigo
	// temos o let, run e with, permitem executar codigo a partir de um objeto
	// o also permite fazer uma cascata de operacoes

    private fun booksSugestions(suggestions: ArrayList<Sugesstions>?) {
    	suggestions?.let{
			// caso a variavel nao seja nula executa esse bloco           
        } ?: run {
          	// executa caso contrario 
        }
    }
    
    class Teste {
        var person: Person? = Person(name: "Bife", profession: "Dev")
        var person2: Person? = null
        
        fun test(){
			// o operador let permite executar funcoes em cima do objeto person            
			// desse modo, o contexto será o contexto do objeto
			// o contexto nesse caso é it        
            person?.let {
                it.name = "Lucas"
                it.professional = "Dev Android"
            }
            
            // o contexto nesse caso é this
            person?.run {
                this.name = "Lucas"
                this.profession = "Dev Android"
            }
            
            // escope function with
            // com ela temos um lambda result
            with(Person(name: "Lucas", profession: "Programador")) {
                person2 = this
            }
            
			// permite acessar os atributos sem ficar usando this o tempo todo
			// o lambda result é a ultima linha/declaracao do codigo
			// semelhante a funcoes em haskell, em que a ultima linha é o que é retornado pela funcao     
            with(person) {
                println(name)
                println(profession)
            }
            
			// tambem permite acessar os atributos de forma direta          
            // permite um codigo mais limpo, pois acessamos os atributos de forma direta
            person?.apply {
                name = "Julia"
                profession = "Dev Android"
            }
        }
    }
    
	
	
    

    fun main() {

    }