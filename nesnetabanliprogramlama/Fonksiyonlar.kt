package com.example.kotlindersleri.nesnetabanliprogramlama

class Fonksiyonlar {
    //void-sadece işlem yapan
    fun selamla1(){//swift :func
        val sonuc = "Merhaba Ahmet"
        println(sonuc)
    }

    //return - hem işlem yapan hem veri transferi yapan
    fun selamla2() : String {//swift :func//hangi dilde return edecegini yaz
        val sonuc = "Merhaba Ahmet"
        return sonuc
    }
    //parametre
    fun selamla3(isim:String){//var- val yazılmaz return veya void olabilir farketmez
        val sonuc = "Merhaba $isim"
        println(sonuc)
    }

    //overloading
    //bir sınıf içerisinde aynı isimde fonksiyonları tekrar kullanmak.
    fun topla(sayi1:Int,sayi2:Int){
        println("Toplama :${sayi1+sayi2}")

    }
    fun topla(sayi1:Double,sayi2:Double){
        println("Toplama :${sayi1+sayi2}")

    }
    fun topla(sayi1:Int,sayi2:Int,isim:String){
        println("Toplama :${sayi1+sayi2}-Islem Yapan: $isim")

    }

}