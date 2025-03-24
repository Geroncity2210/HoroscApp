package com.juanmorpat.horoscapp.data.providers

import com.juanmorpat.horoscapp.domain.model.HoroscopeInfo
import com.juanmorpat.horoscapp.domain.model.HoroscopeInfo.Aquarius
import com.juanmorpat.horoscapp.domain.model.HoroscopeInfo.Aries
import com.juanmorpat.horoscapp.domain.model.HoroscopeInfo.Cancer
import com.juanmorpat.horoscapp.domain.model.HoroscopeInfo.Capricorn
import com.juanmorpat.horoscapp.domain.model.HoroscopeInfo.Gemini
import com.juanmorpat.horoscapp.domain.model.HoroscopeInfo.Leo
import com.juanmorpat.horoscapp.domain.model.HoroscopeInfo.Libra
import com.juanmorpat.horoscapp.domain.model.HoroscopeInfo.Pisces
import com.juanmorpat.horoscapp.domain.model.HoroscopeInfo.Sagittarius
import com.juanmorpat.horoscapp.domain.model.HoroscopeInfo.Scorpio
import com.juanmorpat.horoscapp.domain.model.HoroscopeInfo.Taurus
import com.juanmorpat.horoscapp.domain.model.HoroscopeInfo.Virgo
import javax.inject.Inject

class HoroscopeProvider @Inject constructor() {

    /**
     * Conseguir las instancias de la clase HoroscopeInfo correspondientes a los signos sodiacales
     * @return Lista de tipo HoroscopeInfo
     */


    fun getHoroscopes(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Taurus,
            Gemini,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Sagittarius,
            Capricorn,
            Aquarius,
            Pisces
        )
    }
}