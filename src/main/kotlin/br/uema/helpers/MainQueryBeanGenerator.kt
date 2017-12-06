package br.uema.helpers

import io.ebean.typequery.generator.Generator
import io.ebean.typequery.generator.GeneratorConfig
import java.io.IOException

object MainQueryBeanGenerator {

    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {

        val config = GeneratorConfig()
        config.destDirectory = "./src/main/kotlin"
        config.destResourceDirectory = "./src/main/resources"

        config.entityBeanPackage = "br.uema.estudo.entity"

        config.isOverwriteExistingFinders = true

        val generator = Generator(config)
        generator.generateQueryBeans()

        generator.generateFinders()
        generator.modifyEntityBeansAddFinderField()
    }
}