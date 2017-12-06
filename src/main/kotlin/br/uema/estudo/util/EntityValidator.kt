package br.uema.estudo.util

import javax.validation.ConstraintViolation
import javax.validation.Validation
import javax.validation.Validator
import javax.validation.ValidatorFactory

class EntityValidator {

    companion object {
        val factory: ValidatorFactory = Validation.buildDefaultValidatorFactory()

        val validator: Validator = factory.getValidator()

        fun <T> validate(entity: T): Set<ConstraintViolation<T>> {
            return validator.validate(entity)
        }
    }
}