package com.example.kotlindersleri.standart_programlama

fun main() {
    val yas = 17
    println(yas >= 18)
    if(yas >= 18){
        println("Resitsiniz")
    }else{
        println("Resit degilsiniz.")
    }

    val ka = "admin"
    val s =123456
    val sayi = 10

    if(ka == "admin" && s == 123456){
        println("Hosgeldiniz")
    }else{
        println("hatali giris")
    }
    val number = 5
    when(number){//break kullanımına gerek yoktur modern dildir tek yapı kıyaslanır koşul alanı değil değişken alanıdır
        1-> println("Sayi 1'dir")
        2-> println("Sayi 2'dir")
        3-> println("Sayi 3'dir")
        else -> println("Tanimlanmayan sayi")
    }

}