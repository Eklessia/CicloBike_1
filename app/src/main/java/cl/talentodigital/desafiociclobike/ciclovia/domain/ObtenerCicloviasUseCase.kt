package cl.talentodigital.desafiociclobike.ciclovia.domain

class ObtenerCicloviasUseCase(
    private val repository: CicloviasRepository
) {
    fun excecute() = repository.obtenerCiclovias()
}