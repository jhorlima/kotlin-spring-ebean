package br.uema.estudo.entity.query;

import br.uema.estudo.entity.Article;
import io.ebean.EbeanServer;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.PTimestamp;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;

/**
 * Query bean for Article.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QArticle extends TQRootBean<Article,QArticle> {

  private static final QArticle _alias = new QArticle(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QArticle alias() {
    return _alias;
  }

  public PLong<QArticle> id;
  public PLong<QArticle> version;
  public PTimestamp<QArticle> created;
  public PTimestamp<QArticle> updated;
  public PString<QArticle> title;
  public PString<QArticle> content;


  /**
   * Construct with a given EbeanServer.
   */
  public QArticle(EbeanServer server) {
    super(Article.class, server);
  }

  /**
   * Construct using the default EbeanServer.
   */
  public QArticle() {
    super(Article.class);
  }

  /**
   * Construct for Alias.
   */
  private QArticle(boolean dummy) {
    super(dummy);
  }
}
