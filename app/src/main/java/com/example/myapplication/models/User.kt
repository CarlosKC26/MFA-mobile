package com.example.myapplication.models

data class User(
    val So: SO,
    val browser: Browser,
    val `data`: Data,
    val domain: Domain,
    val elapsedTime: ElapsedTime,
    val id_empresa: IdEmpresa,
    val id_usuario: IdUsuario,
    val ip: Ip,
    val typeSpeed: TypeSpeed
) {
    data class SO(
        val type: String
    )

    data class Browser(
        val type: String
    )

    data class Data(
        val type: String
    )

    data class Domain(
        val type: String
    )

    data class ElapsedTime(
        val type: String
    )

    data class IdEmpresa(
        val type: String
    )

    data class IdUsuario(
        val type: String
    )

    data class Ip(
        val type: String
    )

    data class TypeSpeed(
        val type: String
    )
}