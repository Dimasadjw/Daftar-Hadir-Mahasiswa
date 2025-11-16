package com.example.daftarhadirmahasiswa

data class Mahasiswa(
    val name: String,
    val nim: String,
    val status: Status,
    val email: String=""
)

enum class Status{
    HADIR,
    ALFA,
    IZIN,
    SAKIT
}

fun main(){
    val x = Mahasiswa("x", "10", Status.HADIR)
}
