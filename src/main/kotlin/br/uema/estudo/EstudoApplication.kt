package br.uema.estudo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Bean

import io.ebean.EbeanServerFactory
import io.ebean.config.ServerConfig
import io.ebean.EbeanServer
import io.ebean.spring.txn.SpringJdbcTransactionManager

import javax.sql.DataSource

@Configuration
@SpringBootApplication
class EstudoApplication{

    companion object {
        @JvmStatic fun main(args: Array<String>) {
            runApplication<EstudoApplication>(*args)
        }
    }

    @Bean
    fun ebeanServerConfig(dataSource: DataSource): ServerConfig {
        val config = ServerConfig()

        config.addPackage("br.uema.estudo")
        config.name = "ebeanServer"
        config.isDefaultServer = true
        config.dataSource = dataSource
        config.externalTransactionManager = SpringJdbcTransactionManager()
        config.isAutoCommitMode = false
        config.isExpressionNativeIlike = true

        return config
    }

    @Bean
    fun ebeanServer(serverConfig: ServerConfig): EbeanServer {
        return EbeanServerFactory.create(serverConfig)
    }

}