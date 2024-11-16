package com.sbs.jsp.board.article;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ArticleRepository {
  private static List<Article> datum;
  private static long lastId;

  public ArticleRepository() {
    datum = new ArrayList<>();
    makeTestData();

    lastId = datum.get(datum.size() - 1).getId(); // 게시물의 마지막 번호
  }

  void makeTestData() {
    IntStream.rangeClosed(1, 5)
        .forEach(i -> datum.add(new Article(i, "제목" + i, "내용" + i)));
  }

  public List<Article> getArticles() {
    List<Article> articles = datum;

    return articles;
  }

  public long write(String subject, String content) {
    long id = ++lastId;

    Article article = new Article(id, subject, content);

    datum.add(article);

    return id;
  }
}
