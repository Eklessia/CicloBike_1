package cl.talentodigital.desafiociclobike.ciclovia.domain

import cl.talentodigital.desafiociclobike.ciclovia.domain.model.Ciclovia
import io.reactivex.Single

interface CicloviasRepository {
    fun obtenerCiclovias(): Single<List<Ciclovia>>
    fun filtrarLasCondes(): Single<List<Ciclovia>>
}