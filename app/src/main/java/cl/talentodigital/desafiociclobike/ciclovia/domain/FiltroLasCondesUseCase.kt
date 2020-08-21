package cl.talentodigital.desafiociclobike.ciclovia.domain

class FiltroLasCondesUseCase(
    private val repository: CicloviasRepository
) {
    fun excecute() = repository.filtrarLasCondes()
}