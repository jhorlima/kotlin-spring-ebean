package br.uema.estudo.entity.query.assoc;

import br.uema.estudo.entity.Article;
import br.uema.estudo.entity.query.QArticle;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.PTimestamp;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;

/**
 * Association query bean for AssocArticle.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QAssocArticle<R> extends TQAssocBean<Article,R> {

  public PLong<R> id;
  public PLong<R> version;
  public PTimestamp<R> created;
  public PTimestamp<R> updated;
  public PString<R> title;
  public PString<R> content;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetch(TQProperty<QArticle>... properties) {
    return fetchProperties(properties);
  }

  public QAssocArticle(String name, R root) {
    super(name, root);
  }
}
