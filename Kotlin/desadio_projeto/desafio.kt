enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

class Formacao(val nome: String, val nivel: Nivel, var conteudos: MutableList<ConteudoEducacional> = mutableListOf()) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} matriculado na formação $nome")
    }

    fun adicionarConteudo(conteudo: ConteudoEducacional) {
        conteudos.add(conteudo)
        println("Conteúdo ${conteudo.nome} adicionado à formação $nome")
    }

    fun listarConteudos() {
        println("Conteúdos da formação $nome:")
        conteudos.forEachIndexed { index, conteudo ->
            println("${index + 1}. ${conteudo.nome}")
        }
    }
}

fun main() {
    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")

    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin")
    val conteudo2 = ConteudoEducacional("Classes e Objetos em Kotlin")
    val conteudo3 = ConteudoEducacional("Funções em Kotlin")

    val formacao = Formacao("Formação Kotlin", Nivel.INTERMEDIARIO)

    formacao.adicionarConteudo(conteudo1)
    formacao.adicionarConteudo(conteudo2)
    formacao.adicionarConteudo(conteudo3)

    formacao.listarConteudos()

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)
}
