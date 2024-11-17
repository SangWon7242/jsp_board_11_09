package com.sbs.jsp.board.article;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ArticleRepository {
  private static List<Article> datum;
  private static long lastId;

  public ArticleRepository() {
    datum = new ArrayList<>();
    lastId = 0;

    makeTestData();
  }

  public static void makeTestData() {
    IntStream.rangeClosed(1, 10)
        .forEach(id -> {
          String subject = "제목%d".formatted(id);
          String content = "내용%d".formatted(id);

          write(subject, content);
        });
  }

  public static List<Article> findAll() {
    List<Article> articles = datum;

    return articles;
  }

  public static long write(String subject, String content) {
    long id = ++lastId;

    Article article = new Article(id, subject, content);

    datum.add(article);

    return id;
  }

  public static Article findById(long id) {
    for(Article article : datum) {
      if(article.getId() == id) {
        return article;
      }
    }

    return null;
  }

  public void delete(long id) {
    Article article = findById(id);

    if (article == null) return;

    datum.remove(article);
  }

  public void modify(long id, String subject, String content) {
    Article article = findById(id);

    if (article == null) return;

    article.setSubject(subject);
    article.setContent(content);
  }
}
