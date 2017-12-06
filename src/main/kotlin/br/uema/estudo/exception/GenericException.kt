package br.uema.estudo.exception

import org.springframework.http.HttpStatus
import org.springframework.web.client.HttpStatusCodeException

open class GenericException(status: HttpStatus, statusText: String) : HttpStatusCodeException(status, statusText)