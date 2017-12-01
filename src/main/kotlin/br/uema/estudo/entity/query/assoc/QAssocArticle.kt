package br.uema.estudo.entity.query.assoc

import br.uema.estudo.entity.Article
import br.uema.estudo.entity.query.QArticle
import io.ebean.typequery.PLong
import io.ebean.typequery.PString
import io.ebean.typequery.PTimestamp
import io.ebean.typequery.TQAssocBean
import io.ebean.typequery.TQProperty
import io.ebean.typequery.TypeQueryBean

/**
 * Association query bean for AssocArticle.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
class QAssocArticle<R>(name: String, root: R) : TQAssocBean<Article,R>(name, root) {

  lateinit var id: PLong<R>
  lateinit var version: PLong<R>
  lateinit var created: PTimestamp<R>
  lateinit var updated: PTimestamp<R>
  lateinit var title: PString<R>
  lateinit var content: PString<R>

  // type safe fetch(properties) using varargs not supported yet ...
}
