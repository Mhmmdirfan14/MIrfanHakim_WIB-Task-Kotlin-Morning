package id.infinitelearning.KotlinSubmission.exercise2

import com.sun.tools.javac.Main

fun main() {

    /** Latihan 1 List
    Buatlah sebuah variabel bertipe list dengan ketentuan:
    - List tersebut menampung bilangan genap dari 1 hingga 100
    Optional:
    - Agar lebih mudah, gunakanlah for loop dan logika if untuk mengisi bilangan genap pada list
     */
    // Buat di bawah sini
    val numberList = mutableListOf<Int>()

    for (i in 1..100) {
        if (i % 2 == 0) {
            numberList.add(i)
        }
    }

    println("List bilangan genap 1 sampai 100")
    println(numberList)


    /**
     *   Latihan 2 Map
     *     Buatlah variabel bertipe Map dengan kriteria:
     *     Daftar nama bulan dalam setahun,
     *     - Set Key nya dengan inisial nama bulan dan Value nya nama bulan, contoh
     *     - key "Jan", value January
     *     - key "Feb", value February
     *     - dst...
     */
    // Buat di bawah sini
    val monthsMap = mapOf(
        "Jan" to "Januari",
        "Feb" to "Februari",
        "Mar" to "Maret",
        "Apr" to "April",
        "Mei" to "Mei",
        "Jun" to "Juni",
        "Jul" to "Juli",
        "Agu" to "Agustus",
        "Sep" to "September",
        "Okt" to "Oktober",
        "Nov" to "November",
        "Des" to "Desember"
    )

    println("\nDaftar nama bulan:")
    println(monthsMap)
    /**
     *  Cetak semua nama bulan dengan fungsi forEach sehingga hasil output seperti:
     *     - Jan -> January
     *     - Feb -> February
     *     - Dst...
     */
    // Buat di bawah sini
    monthsMap.forEach {(short, month) ->
        println("- $short -> $month.")
    }

    /**
     *  Cetak nama bulan sekarang dan bulan lahir kamu dengan format string berikut:
     *  - "It's {$monthNow} now, I was born in {$birthMonth}"
     */
    // Buat di bawah sini
    val monthNow = (monthsMap["Nov"])
    val birthMonth = (monthsMap.getValue("Apr"))

    println("\nIt's $monthNow now, I was born in $birthMonth")




}
