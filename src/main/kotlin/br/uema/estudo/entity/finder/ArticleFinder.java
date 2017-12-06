package br.uema.estudo.entity.finder;

import br.uema.estudo.entity.Article;
import br.uema.estudo.entity.query.QArticle;
import io.ebean.Finder;

public class ArticleFinder extends Finder<Long,Article> {

  /**
   * Construct using the default EbeanServer.
   */
  public ArticleFinder() {
    super(Article.class);
  }

  /**
   * Construct with a given EbeanServer.
   */
  public ArticleFinder(String serverName) {
    super(Article.class, serverName);
  }

  /**
   * Start a new typed query.
   */
  protected QArticle where() {
     return new QArticle(db());
  }

  /**
   * Start a new document store query.
   */
  protected QArticle text() {
     return new QArticle(db()).text();
  }
}
