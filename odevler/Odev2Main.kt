package com.example.kotlindersleri.odevler

fun main() {

                        //Soru 1
    val f = Odev2()
    val sonuc = f.celsiusToFahrenheit(26.0)
    println(sonuc)

                         //Soru 2
    f.cevreHesapla(15.0,12.0)


                        //Soru 3
    val gelenfaktoriyel = f.faktoriyelHesabi(8)
    println(gelenfaktoriyel)


                        //Soru 4
    f.aHarfiniSay("Kahramanmaras")


                        //Soru 5
    val kenarSayisi = 5
    val sonuc1 = f.icAciToplami(kenarSayisi)
    println("Ic acilar toplami: $sonuc1")


                        //Soru 6
    val gunSayisi = 25
    f.maasHesapla(gunSayisi)


                        //Soru 7
    val kotaMiktari = 60.0
    val toplamUcret = f.kotaUcretiHesapla(kotaMiktari)
    println("Toplam ucret: $toplamUcret TL")
}