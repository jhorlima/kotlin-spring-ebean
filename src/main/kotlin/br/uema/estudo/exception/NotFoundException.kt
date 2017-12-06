package br.uema.estudo.exception

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ResponseStatus

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Não encontrado")
class NotFoundException(status: HttpStatus, statusText: String) : GenericException(status, statusText)