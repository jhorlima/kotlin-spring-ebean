package br.uema.estudo.entity

import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
data class Article(@get: NotBlank var title: String = "", @get: NotBlank var content: String = "") : Base()