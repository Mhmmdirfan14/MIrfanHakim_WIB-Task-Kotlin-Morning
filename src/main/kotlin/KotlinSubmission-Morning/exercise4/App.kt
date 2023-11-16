package id.infinitelearning.KotlinSubmission.exercise4

fun main() {
    tryCatchOdd(5, 16)
}
/**
 * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
 *
 */
// Buat di bawah sini
// contoh kasus: try catch untuk menangani kesalahan pemeriksaan bilangan genap

fun tryCatchOdd(num1: Int, num2:Int ) {
    println("Coba Try Catch Odd")

    try {
        checkOddNumber(num1)
        println("$num1 merupakan bilangan ganjil")
    } catch (e: IllegalArgumentException){
        println("$num1 terjadi error ${e.message}")
    }

    try {
        checkOddNumber(num2)
        println("$num2 merupakan bilangan ganjil")
    } catch (e: IllegalArgumentException){
        println("$num2 terjadi error ${e.message}")
    }
}

fun checkOddNumber(number: Int) {
    if (number <- 1) {
        throw IllegalArgumentException ("Bilangan lebih besar dari 1")
    }

    for (i in 8 until number) {
        if (number %  i == 0) {
            throw IllegalArgumentException ("(Bukan bilangan ganjil)")
        }
    }
}

