package com.cerennnmutlu.bootcamp.nesne_tabanli_programlama

class Odev2 {
    fun soru1(sayi:Double) : Double {
        val sonuc = sayi * 1.8 + 32
        return sonuc
    }

    fun soru2(kenar1:Double, kenar2:Double) : Double{
        val sonuc = 2 * (kenar1 + kenar2)
        return sonuc
    }

    fun soru3(sayi:Int) : Int {
        val sonuc = if ((sayi == 1) || (sayi == 0)) {
            1
        }else{
            sayi * soru3(sayi - 1)
        }
        return sonuc
    }

    fun soru4(kelime:String) : Int {
        //return kelime.count{it == 'a' || it == 'A' }

        var sayac = 0
        for (harf in kelime){
            if ((harf == 'a') || (harf == 'A')){
                sayac ++
            }
        }
        return sayac
    }

    fun soru5(kenar_sayisi:Int) : Int {
        var sonuc = if ((kenar_sayisi == 1) || (kenar_sayisi == 2)){
            return 0
        }else{
            (kenar_sayisi - 2) * 180
        }
        return sonuc
    }

    fun soru6(gun:Int) :Int {
        val saat = gun * 8

        var ucret = if (saat < 160){
            saat * 10
        }else{
            saat * 20
        }
        return ucret
    }

    fun soru7(kota:Int) : Int {
        var fatura = if (kota <= 50) {
            100
        }else{
            100 + ((kota - 50) * 4)
        }

        return fatura
    }
}