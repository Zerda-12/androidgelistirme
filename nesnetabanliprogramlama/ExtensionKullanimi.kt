package com.example.kotlindersleri.nesnetabanliprogramlama

fun main() {
    val sonuc = 5 carp 2//5.carp(2)-infix eklenmez ise bu şekilde kullanılır
    println(sonuc)
}
//Her yerden erişmek için burada yazıyoruz
    infix fun Int.carp(sayi:Int):Int{//Int sınıfına carp fonk eklendi anlamına geliyor -void olarak da kullanılabilir
   return this * sayi //this(Int)
}