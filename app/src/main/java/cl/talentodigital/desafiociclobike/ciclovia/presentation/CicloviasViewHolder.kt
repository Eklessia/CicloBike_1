package cl.talentodigital.desafiociclobike.ciclovia.presentation

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import cl.talentodigital.desafiociclobike.ciclovia.domain.model.Ciclovia
import cl.talentodigital.desafiociclobike.databinding.CicloviasItemBinding

class CicloviasViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val binding = CicloviasItemBinding.bind(itemView)

    fun bind(ciclovia: Ciclovia) {
        binding.apply {
            tvComuna.text = ciclovia.comuna
            tvNombreCiclovia.text = ciclovia.nombre
        }
    }
}
