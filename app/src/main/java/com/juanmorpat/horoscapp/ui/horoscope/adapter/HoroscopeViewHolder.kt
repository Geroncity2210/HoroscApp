package com.juanmorpat.horoscapp.ui.horoscope.adapter

import android.view.View
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.juanmorpat.horoscapp.databinding.ItemHoroscopeBinding
import com.juanmorpat.horoscapp.domain.model.HoroscopeInfo

class HoroscopeViewHolder(view: View) : ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)

    fun render(horoscopeInfo: HoroscopeInfo, onItemSelected: (HoroscopeInfo) -> Unit) {
        val context = binding.tvTitle.context
        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvTitle.text = context.getString(horoscopeInfo.name)

        binding.parent.setOnClickListener {
            startRotationAnimation(
                binding.ivHoroscope,
                newLambda = { onItemSelected(horoscopeInfo) })
            //onItemSelected(horoscopeInfo)
        }
    }

    private fun startRotationAnimation(view: View, newLambda: () -> Unit) {
        view.animate().apply {
            duration = 500
            interpolator = LinearInterpolator()
            withEndAction { newLambda() }
            rotationBy(360f)
            start()
        }


    }
}