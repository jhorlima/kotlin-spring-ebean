package br.uema.estudo.util

import br.uema.estudo.exception.GenericException
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity

class ResponseStructure {

    companion object {

        protected fun response(response: Response, status: HttpStatus): ResponseEntity<Response>? {
            return ResponseEntity.status(status).body(response)
        }

        fun success(data: Any): ResponseEntity<Response>? {
            val status = HttpStatus.OK
            val response = Response(status, status.reasonPhrase, data)
            response.data = data
            return response(response, status)
        }

        fun success(data: Any, status: HttpStatus): ResponseEntity<Response>? {
            val response = Response(status, status.reasonPhrase, data)
            return response(response, status)
        }

        fun success(message: String): ResponseEntity<Response>? {
            val status = HttpStatus.OK
            val response = Response(status, message, null)
            return response(response, status)
        }

        fun success(message: String, status: HttpStatus): ResponseEntity<Response>? {
            val response = Response(status, message, null)
            return response(response, status)
        }

        fun error(status: HttpStatus, message: String): ResponseEntity<Response>? {
            val response = Response(status, message, null)
            return response(response, status)
        }

        fun error(status: HttpStatus, exception: GenericException): ResponseEntity<Response>? {
            val response = Response(status, exception.message, null)
            return response(response, status)
        }

        fun error(exception: GenericException): ResponseEntity<Response>? {
            val status = exception.statusCode
            val response = Response(status, exception.message, null)
            return response(response, status)
        }

        fun error(message: String): ResponseEntity<Response>? {
            val status = HttpStatus.BAD_REQUEST
            val response = Response(status, message, null)
            return response(response, status)
        }
    }

}