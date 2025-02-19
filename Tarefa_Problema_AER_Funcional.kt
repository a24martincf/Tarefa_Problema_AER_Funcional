package tarefas_Puntuables.`2Aval`


//      EL ASCENSOR
//  ENUNCIADO:  https://aceptaelreto.com/problem/statement.php?id=156

fun main() {

    val secuencia = generateSequence {
        val entrada = readln()
        if (entrada[0] != '-') {
            entrada.split(" ").map { it.toInt() }
        } else null
    }
    secuencia.forEach { lista->
        var resultado = 0
        var indice = 0
        lista.forEach {
            if (indice < lista.size-2)  {
                    resultado += Math.abs(lista[indice + 1] - it)
                    indice++
            }
        }
        println(resultado)
    }
}

