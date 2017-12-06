package br.uema.estudo.entity

import br.uema.estudo.util.EntityValidator
import io.ebean.Model
import io.ebean.annotation.WhenCreated
import io.ebean.annotation.WhenModified
import java.sql.Timestamp
import javax.persistence.*
import javax.validation.ConstraintViolation
import javax.validation.ValidationException

@MappedSuperclass
abstract class Base : Model() {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    @Version
    var version: Long? = null

    @WhenCreated
    @Column(name = "created_at")
    var created: Timestamp? = null

    @WhenModified
    @Column(name = "updated_at")
    var updated: Timestamp? = null

    override fun save() {
        val validator = EntityValidator.validate(this)

        if (!validator.isEmpty()) {
            val error: ConstraintViolation<Base> = validator.iterator().next()
            val campo: String = error.getPropertyPath().toString()
            throw ValidationException(campo + " - " + error.getMessage())
        }
        super.save()
    }

    fun forceSave() {
        super.save()
    }
}