package cl.talentodigital.desafiociclobike.ciclovia.data.local

import cl.talentodigital.desafiociclobike.ciclovia.data.local.fakeRepository.CicloviasSetup
import cl.talentodigital.desafiociclobike.ciclovia.domain.CicloviasRepository
import cl.talentodigital.desafiociclobike.ciclovia.domain.model.Ciclovia
import io.reactivex.Single

class CicloviasLocalRepository : CicloviasRepository {

    override fun obtenerCiclovias(): Single<List<Ciclovia>> {
        return Single.just(CicloviasSetup.init())
    }

    override fun filtrarLasCondes(): Single<List<Ciclovia>> {
        val listaFiltrada = ArrayList<Ciclovia>()
        CicloviasSetup.init().forEach {
            when (it.comuna) {
                "Las Condes" -> listaFiltrada.add(it)
            }
        }
        return Single.just(listaFiltrada)
    }
}