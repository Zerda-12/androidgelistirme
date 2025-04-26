package com.example.kotlindersleri.nesnetabanliprogramlama

data class Yemekler(var id:Int, var ad: String,var fiyat:Int) {//nesne oluşturuyoruz class içi boş geçilmez
    //constructor-init fonk
    //bu sınıftan nesne oluştuğunda çalışsın
    init{//bu sınıftan nesne olusturdugumuzda çalışan fonk.
        println("******Nesne olustu*****")
    }
    fun bilgiAl(){
        println("-----------")
        println("Id: ${id}")
        println("Ad: ${ad}")
        println("Fiyat: ${fiyat}")

    }
    //this : Bulunduğu sınıf temsil eder.Swift dilinde self demektir.
    //super :kalıtım ile bir üst sınıfı temsil eder
    //data class veri tabanı çalışmaları yürütür tam bir sınıf data:bu sınıfın hazır fonklu halı (set-get fonk)
}


