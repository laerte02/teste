fun main() {
    var monitor = Monitor(60, "Jld2020", "LG")
    monitor.mostrarInfo()
    monitor.status()
    monitor.ligarDesligar()
    monitor.aumentarVolume(62)
    monitor.diminuirVolume(20)
    monitor.status()


    var aula = Aula("Caio", "Kotlin", 2.0, true, 10, 9)
    aula.aulaStatus()
    aula.validarAula()
}

class Monitor(val frequencia: Int, val modelo: String, val marca: String) {
    var ligado = false
    var volume = 0

    fun ligarDesligar() {
        if (ligado == false) {
            ligado = true
        } else {
            ligado = false
        }
    }

    fun aumentarVolume(volume: Int) {
        this.volume += volume
    }

    fun diminuirVolume(volume: Int) {
        this.volume -= volume
    }

    fun mostrarInfo() {
        println("Marca $marca,Modelo $modelo, Frequencia $frequencia Hz")
    }

    fun status() {
        if (!ligado) {
            println("Monitor desligado")
        } else {
            println("Volume $volume")
        }
    }
}

class Aula(val professor: String, val materia: String, val tempoDeAula: Double, var proferssorPresente: Boolean, val totalAlunos: Int, var alunosPresentes: Int) {

    fun aulaStatus() {
        println("Aula de $materia com o professor $professor com duração de $tempoDeAula horas, total de alunos na turma $totalAlunos")
    }

    fun validarAula() {
        if ((proferssorPresente) and (presensaMinima())) {
            println("Aula normal")
        }else{
            println("Aula suspensa")
        }
    }

    fun presensaMinima(): Boolean {
        if (alunosPresentes > (totalAlunos * 0.5)) {
            return true
        }
        return false
    }
}
