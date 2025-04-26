package com.example.kotlindersleri.odevler

class Odev2 {
                        //1.Soru
    fun celsiusToFahrenheit(celsius: Double): Double {
        return celsius * 1.8 + 32
    }
                        //2.Soru
fun cevreHesapla(en: Double, boy: Double) {
    val cevre = 2 * (en + boy)
    println("Dikdortgenin cevresi: $cevre")
}

                        //3.Soru
    fun faktoriyelHesabi(sayi:Int): Int{
        if(sayi==0){
            return 1
    }
    return sayi * faktoriyelHesabi(sayi-1)
    }
                        //4.Soru
fun aHarfiniSay(kelime: String) {
    var sayac = 0
    for (harf in kelime) {
        if (harf == 'a' || harf == 'A') {
            sayac++
        }
    }
    println("Kelimedeki 'a' harflerinin sayisi: $sayac")
}
                        //5.Soru
fun icAciToplami(kenarSayisi: Int): Int {
    if (kenarSayisi < 3) {
        println("Geçerli bir çokgen değil!")
        return 0
    }
    return (kenarSayisi - 2) * 180
}

                         //6.Soru
fun maasHesapla(gunSayisi: Int) {
    val normalSaatUcreti = 10.0
    val mesaiSaatUcreti = 20.0
    val normalCalismaSaati = 8.0
    val maxMesaiSaatUcreti = 160.0
    val toplamCalismaSaati = gunSayisi * normalCalismaSaati
    val mesaiSaati = if (toplamCalismaSaati > 160) {
        toplamCalismaSaati - 160
    } else {
        0.0
    }
    val normalCalismaSaatiToplam = toplamCalismaSaati - mesaiSaati
    val maas = (normalCalismaSaatiToplam * normalSaatUcreti) + (mesaiSaati * mesaiSaatUcreti)

    println("Toplam maas: $maas TL")
}

                            //7.Soru
    fun kotaUcretiHesapla(kotaMiktari: Double): Double {
        val temelUcret = 100.0
        val ekUcretPerGB = 4.0
        val kotaLimit = 50.0

        return if (kotaMiktari <= kotaLimit) {
            temelUcret
        } else {
            val ekKota = kotaMiktari - kotaLimit
            val ekUcret = ekKota * ekUcretPerGB
            temelUcret + ekUcret
        }
    }
}