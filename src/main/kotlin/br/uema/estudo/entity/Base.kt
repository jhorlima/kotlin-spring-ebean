package br.uema.estudo.entity

import io.ebean.Model
import io.ebean.annotation.WhenCreated
import io.ebean.annotation.WhenModified
import java.sql.Timestamp
import javax.persistence.*

@MappedSuperclass
abstract class Base: Model() {

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

}