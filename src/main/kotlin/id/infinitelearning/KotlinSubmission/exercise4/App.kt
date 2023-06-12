package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */

        try {
            print("Masukkan angka : ")
            val input = readLine()
            val number = input?.toInt()

            println("Angka yang dimasukkan: $number")
        } catch (e: NumberFormatException) {
            println("Input tidak valid. Maasukkan angka.")
        }
    }





