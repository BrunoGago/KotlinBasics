fun main(args: Array<String>) {

    /*var: usamos "var" para definir as variáveis somente uma vez
     *por padrão, o Kotlin indentifica o tipo da variável por inferencia
     *var: pode ter seu valor alterado
     */
    var x = 10

    /*
     *Caso você queira definir o tipo da variável, deve seguir o abaixo (var - nome - : - Tipo - valor)
     */
    var age: Int = 19

    var name: String = "Bruno"

    //val: é uma constante, a variável não pode ter seu valor alterado
    val pi = 3.14

    //Alteração de variável
    var nome = "Celso"

    println(nome)

    nome = "Maria"

    println(nome)

    //contagem de caracteres
    println(nome.length)

    //Concatenação é igual ao Java
    var cidade: String = "São Paulo"
    println("Nome da cidade: " + cidade)

    //CHAR: usamos somente aspas simples para CHAR
    var genero: Char = 'M'

    //No caso de inferencia, usamos somente aspas simples e o Kotlin entede que e CHAR e nao String
    var sim = 'S'

    //o tipo PAIR armazena dois valores, como se fosse um MAP
    var (codigo, descricao) = Pair(10, "TV")
    println(codigo)
    println(descricao)

    //Tipagem do PAIR e atribuição com valores
    var produto: Pair<Int, String> = Pair(codigo, descricao)
    println(produto)
    println(produto.first)
    println(produto.second)

    //NullSafety: Kotlin fará um "proteção" para variáveis nulas
    //?: permite que o valor seja nulo, caso contrário, mostrará erro
    var idade: Int? = null

    println(idade)

    idade = 19
    println(idade)




}