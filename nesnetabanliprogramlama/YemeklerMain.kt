package com.example.kotlindersleri.nesnetabanliprogramlama

fun main() {
    //nesne oluşturma
    val y1 = Yemekler(100,"kofte",249) //sadece istenileni yaz o tamamlar
    //deger okuma
   y1.bilgiAl()

    y1.fiyat = 350
   y1.bilgiAl()

    val y2 = Yemekler(200,"Baklava",300)
   y2.bilgiAl()

    y2.ad ="Soguk Baklava"
    y2.bilgiAl()
}