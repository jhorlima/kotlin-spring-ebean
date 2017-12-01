package br.uema.estudo.controller

import br.uema.estudo.entity.Article
import br.uema.estudo.entity.query.QArticle
import io.ebean.Ebean
import org.springframework.web.bind.annotation.*
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class ArticleController {

    @GetMapping("/articles")
    fun getAllArticles(): List<Article> = QArticle().findList()

    @PostMapping("/articles")
    fun createNewArticle(@Valid @RequestBody article: Article): Article {
        article.save()
        return article
    }

    @GetMapping("/articles/{id}")
    fun getArticleById(@PathVariable(value = "id") articleId: Long): Article {
        return Ebean.find(Article::class.java, articleId) ?: throw Exception("Nenhum artigo foi encontrado para este ID")
    }

    @PutMapping("/articles/{id}")
    fun updateArticleById(@PathVariable(value = "id") articleId: Long, @Valid @RequestBody newArticle: Article): Article {

        val article = Ebean.find(Article::class.java, articleId) ?: throw Exception("Nenhum artigo foi encontrado para este ID")

        article.title = newArticle.title
        article.content = newArticle.content
        article.save()

        return article
    }

    @DeleteMapping("/articles/{id}")
    fun deleteArticleById(@PathVariable(value = "id") articleId: Long): Article {
        val article = Ebean.find(Article::class.java, articleId) ?: throw Exception("Nenhum artigo foi encontrado para este ID")
        article.delete()
        return article
    }
}