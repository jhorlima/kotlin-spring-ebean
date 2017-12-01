package br.uema.estudo.entity.query

import br.uema.estudo.entity.Article
import io.ebean.EbeanServer
import io.ebean.typequery.PLong
import io.ebean.typequery.PString
import io.ebean.typequery.PTimestamp
import io.ebean.typequery.TQRootBean
import io.ebean.typequery.TypeQueryBean

/**
 * Query bean for Article.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
class QArticle : TQRootBean<Article, QArticle> {

  companion object {
    /**
     * shared 'Alias' instance used to provide
     * properties to select and fetch clauses
     */
    val _alias = QArticle(true)
  }

  lateinit var id: PLong<QArticle>
  lateinit var version: PLong<QArticle>
  lateinit var created: PTimestamp<QArticle>
  lateinit var updated: PTimestamp<QArticle>
  lateinit var title: PString<QArticle>
  lateinit var content: PString<QArticle>


  /**
   * Construct with a given EbeanServer.
   */
  constructor(server: EbeanServer) : super(Article::class.java, server)

  /**
   * Construct using the default EbeanServer.
   */
  constructor() : super(Article::class.java)

  /**
   * Construct for Alias.
   */
  private constructor(dummy: Boolean) : super(dummy)
}
