package br.uema.estudo.controller

import br.uema.estudo.util.Response
import br.uema.estudo.util.ResponseStructure
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import javax.servlet.http.HttpServletRequest
import org.springframework.web.bind.annotation.InitBinder
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.ui.Model
import org.springframework.web.bind.WebDataBinder
import org.springframework.http.converter.HttpMessageNotReadableException

@Controller
@ControllerAdvice
class HandlingController {

    @ExceptionHandler(Exception::class)
    fun handleError(req: HttpServletRequest, ex: Exception): ResponseEntity<Response>? {
        return ResponseStructure.error(ex.message!!)
    }

    @ExceptionHandler(HttpMessageNotReadableException::class)
    fun httpMessageNotReadable(req: HttpServletRequest, ex: Exception): ResponseEntity<Response>? {
        return ResponseStructure.error(ex.message!!)
    }

    @ModelAttribute
    fun dataBinding(model: Model) = null

    @InitBinder
    fun dataBinding(binder: WebDataBinder) = null

}