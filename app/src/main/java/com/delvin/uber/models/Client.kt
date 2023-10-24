package com.delvin.uber.models

import com.beust.klaxon.*

private val klaxon = Klaxon()

data class Client(
    val id: String = "",
    val name: String ? = null,
    val lastname: String ? = null,
    val email: String ? = null,
    val phone: String ? = null,
    val image: String = ""
) {
    constructor(image: () -> Unit) : this()


    public fun toJson() = klaxon.toJsonString(this)

    companion object {
        public fun fromJson(json: String) = klaxon.parse<Client>(json)
    }
}
