package com.example.kotlindersleri.nesnetabanliprogramlama

fun main() {
    val f = Fonksiyonlar()
    //void = unit
    f.selamla1()

    //return
    val gelenSonuc = f.selamla2()// atama yapacaz
    println("Gelen sonuc: $gelenSonuc")
    //parametre
    f.selamla3("Zeynep")//sadece degeri gir
    f.topla(10,20,"Beyza")

}