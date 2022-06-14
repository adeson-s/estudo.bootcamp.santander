fun main(args: Array<String>) {

    print("Digite um numero:")
    val a = readLine()!!.toFloat()

    print("Digite um numero:")
    val b = readLine()!!.toFloat()

    print("Digite qual operacao que deseja realizar: soma, diminuir, multipicar ou dividir.")
    val valor = readLine()!!.toLowerCase()

    val x = ("soma")
    val y = ("diminuir")
    val z = ("multipicar")
    val w = ("dividir")

//Por questão de ensino feito sem acentos.
    val resultado = if (valor == x){
        print("O resultado da operacao e: ${adicao(a,b)}")
    }
    else if (valor == y){
        print("O resultado da operacao e: ${sub(a,b)}")
    }
    else if (valor == z){
        print("O resultado da operacao e: ${mult(a,b)}")
    }
    else if (valor == w) {
        print("O resultado da operacao e: ${div(a, b)}")
    }
    else {"Tente novamente"}

}

// função para soma dois numeros
fun adicao(a: Float, b: Float) = a+b

// função para diminuir dois numeros
fun sub(a: Float, b: Float) = a-b

// função para multiplicar dois numeros
fun mult(a: Float, b: Float) = a*b

// função para dividir dois numeros
fun div(a: Float, b: Float) = a/b