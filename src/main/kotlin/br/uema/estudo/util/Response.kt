package br.uema.estudo.util

import org.springframework.http.HttpStatus

class Response() {

    var meta : Map<String, Any?>? = null
    var data : Any? = null

    constructor(status: HttpStatus, message: String?, data: Any?) : this() {
        this.meta = hashMapOf("code" to status.value(), "message" to message)
        this.data = data
    }
}