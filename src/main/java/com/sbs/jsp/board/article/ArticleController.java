package com.sbs.jsp.board.article;

import com.sbs.jsp.board.Rq;
import com.sbs.jsp.board.container.Container;

import java.util.List;

public class ArticleController {
  private ArticleService articleService;

  public ArticleController() {
    articleService = Container.articleService;

  }

  public void showList(Rq rq) {
    List<Article> articles = articleService.getArticles();

    if(articles.isEmpty()) {
      rq.appendBody("게시물이 존재하지 않습니다.");
      return;
    }

    rq.setAttr("articles", articles);

    rq.view("usr/article/list");
  }

  public void showWrite(Rq rq) {
    rq.view("usr/article/write");
  }

  public void doWrite(Rq rq) {
    String subject = rq.getParam("subject", "");

    if(subject.trim().isEmpty()) {
      rq.appendBody("제목을 입력해주세요.");
      return;
    }

    String content = rq.getParam("content", "");

    if(content.trim().isEmpty()) {
      rq.appendBody("내용을 입력해주세요.");
      return;
    }

    long id = articleService.write(subject, content);

    rq.appendBody("<div>%d번 게시물이 생성되었습니다.</div>".formatted(id));
  }
}
