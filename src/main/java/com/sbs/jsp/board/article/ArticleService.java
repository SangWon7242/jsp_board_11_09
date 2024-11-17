package com.sbs.jsp.board.article;

import com.sbs.jsp.board.container.Container;

import java.util.List;

public class ArticleService {
  private ArticleRepository articleRepository;

  public ArticleService() {
    articleRepository = Container.articleRepository;
  }

  public List<Article> findAll() {
    return articleRepository.findAll();
  }

  public long write(String subject, String content) {
    return articleRepository.write(subject, content);
  }

  public Article findById(long id) {
    return articleRepository.findById(id);
  }

  public void delete(long id) {
    articleRepository.delete(id);
  }
}
