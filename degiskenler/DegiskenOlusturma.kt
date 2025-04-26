package com.example.kotlindersleri.degiskenler

fun main() {
    var id = 1
    var ad = "Mont"
    var resim = "mont.png"
    var puan = 4.7
    var fiyat = 4500
    var stokDurum = true

    println("id : $id")
    println("ad: $ad")
    println("resim: $resim" )
    println("puan: $puan")
    println("fiyat: $fiyat")
    println("stokDurum: $stokDurum")

    //Sabitler -Constant
    var sayi= 30 //üstüne başka değer aktarılabilir, esnek yapıdır ve daha fazla güç harcanır.
    sayi = 100
    println(sayi)
    val numara = 50//Üstünde bir değişiklik yapılamaz, sabittir ve daha az güç harcanır.
    println(numara)

    //TÜr dönüşümü

    //1- sayısaldan sayısala
    val d=89.56
    val i =34
    val sonuc1 = d.toInt()
    val sonuc2 =i.toDouble()
    println(sonuc1)
    println(sonuc2)

    //2- Sayısaldan metine dönüşüm
    var x =85
    val sonuc3 = x.toString()//"85"
    println(sonuc3)

    //3- Metinden sayısala dönüşüm

    val yazi = "48T"//çift tırnak string ifade anlamına gelir
    val sonuc4=yazi.toIntOrNull()//toIntOrNull =hatalı olursa null döndürür

    if(sonuc4 != null){
        println(sonuc4)
    }else{
        println("Sonuc nulldur")
    }
}