package com.example.hesapmakinesicalismasi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.hesapmakinesicalismasi.databinding.FragmentCalculatorBinding

class CalculatorFragment : Fragment() {
    private lateinit var binding: FragmentCalculatorBinding
    private var islem = "0"  // İlk işlem başlangıcı
    private var sayi = 0.0 // Sayı tipi Double olarak değiştirildi
    private var numbers = mutableListOf<Double>() // Double listesi kullanıldı
    private var isaretler = mutableListOf<Char>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCalculatorBinding.inflate(inflater, container, false)

        textEdit(islem)

        // Button tıklama işlemleri
        binding.button0.setOnClickListener { textEdit(islem + "0") }
        binding.button1.setOnClickListener { textEdit(islem + "1") }
        binding.button2.setOnClickListener { textEdit(islem + "2") }
        binding.button3.setOnClickListener { textEdit(islem + "3") }
        binding.button4.setOnClickListener { textEdit(islem + "4") }
        binding.button5.setOnClickListener { textEdit(islem + "5") }
        binding.button6.setOnClickListener { textEdit(islem + "6") }
        binding.button7.setOnClickListener { textEdit(islem + "7") }
        binding.button8.setOnClickListener { textEdit(islem + "8") }
        binding.button9.setOnClickListener { textEdit(islem + "9") }

        // Diğer işlem butonları
        binding.buttonAC.setOnClickListener {
            textEdit("0")
            numbers.clear()
            isaretler.clear()
        }

        binding.buttoncarpi.setOnClickListener {
            textEdit(islem + "x")
        }

        binding.buttoneksi.setOnClickListener {
            textEdit(islem + "-")
        }

        binding.buttonarti.setOnClickListener {
            textEdit(islem + "+")
        }

        binding.buttonbolu.setOnClickListener {
            textEdit(islem + "/")
        }

        binding.buttonesit.setOnClickListener {
            try {
                if (kontrolFonksiyonu(islem)) {
                    Toast.makeText(requireContext(), "Hatalı işlem", Toast.LENGTH_LONG).show()
                } else {
                    hesapla()
                }
            } catch (e: ArithmeticException) {
                Toast.makeText(requireContext(), "Sıfıra bölme hatası!", Toast.LENGTH_LONG).show()
            }
        }

        return binding.root
    }

    fun textEdit(islemString: String) {
        if (islem == "0" && islemString.length == 2 && islemString.startsWith("0")) {
            // Yani: islem "0" iken bir rakam basılmışsa, sadece o rakamı yaz
            islem = islemString.last().toString()
        } else {
            islem = islemString
        }
        binding.textView2.text = islem
    }

    // İşlem kontrol fonksiyonu
    private fun kontrolFonksiyonu(islem: String): Boolean {
        // İşlemi kontrol et (geçersiz işlem)
        return islem.contains(Regex("[\\+\\-\\*/]{2}"))
    }

    // Hesaplama fonksiyonu
    private fun hesapla() {
        // İşlem metnini parçalayarak sayıları ve işlemleri ayıralım
        val regex = """(-?\d+(\.\d+)?|\+|-|x|/|\*)""".toRegex()
        val parts = regex.findAll(islem).map { it.value }.toList()

        // Sayıları ve işlemleri listeye ayıralım
        numbers.clear()
        isaretler.clear()

        parts.forEach {
            when {
                it.toDoubleOrNull() != null -> numbers.add(it.toDouble())
                it in listOf("+", "-", "x", "/") -> isaretler.add(it.first())
            }
        }

        // Çarpma ve bölme işlemleri öncelikli yapılmalı
        var result = numbers[0]
        for (operator in listOf('x', '/', '+', '-')) {
            for (i in 0 until isaretler.size) {
                if (isaretler[i] == operator) {
                    when (operator) {
                        'x' -> result *= numbers[i + 1]
                        '/' -> {
                            if (numbers[i + 1] == 0.0) {
                                throw ArithmeticException("Sıfıra bölme hatası")
                            }
                            result /= numbers[i + 1]
                        }
                        '+' -> result += numbers[i + 1]
                        '-' -> result -= numbers[i + 1]
                    }
                }
            }
        }

        textEdit(result.toString())
    }
}
