package com.example.kotlindersleri.standart_programlama

fun main() {//swift içi 1...3, i=index(Dizilerdeki indeks numarası) burada 1..3 yaparsak kendi tamamlar
    for (i in 1..3){
        println("Dongu 1:$i")

    }//10 ile 20 arası 5'erli artsın
    for (x in 10..20 step 5){
        println("Dongu 2: $x")
    }
    for (x in 20 downTo 10 step 5){ //downto geri sayım demek
        println("Dongu 3: $x")
    }

    var sayac = 1 //değişken deger o yuzden var kullanılır

    while(sayac < 4){// = genelde eklenmez
        println("Dongu 4 :$sayac")
        sayac+=1
    }
    for (i in 1..5){
        if(i == 3){
            break//döngüyü durdurur break- continue if ile kullanılır
        }
        println("Dongu 5: $i")
    }
    for (i in 1..5){
        if(i == 3){
            continue//bulunduğu adımı pas geçer
        }
       println("Dongu 6: $i")
    }

}