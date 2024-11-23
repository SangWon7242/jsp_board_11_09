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
    List<Article> articles = articleService.findAll();

    if(articles.isEmpty()) {
      rq.replace("/usr/article/list/free", "게시물이 존재하지 않습니다.");
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
      rq.replace("/usr/article/write", "제목을 입력해주세요.");
      return;
    }

    String content = rq.getParam("content", "");

    if(content.trim().isEmpty()) {
      rq.replace("/usr/article/write", "내용을 입력해주세요.");
      return;
    }

    long id = articleService.write(subject, content);


    rq.replace("/usr/article/detail/free/%d".formatted(id), "%d번 게시물이 생성되었습니다.".formatted(id));
  }

  public void showDetail(Rq rq) {
    long id = rq.getLongPathValueByIndex(1, 0);

    if(id == 0) {
      rq.replace("/usr/article/list", "올바른 요청이 아닙니다.");
      return;
    }

    Article article = articleService.findById(id);

    if(article == null) {
      rq.replace("/usr/article/list/free", "%d번 게시물은 존재하지 않습니다.".formatted(id));
      return;
    }

    rq.setAttr("article", article);

    rq.view("usr/article/detail");
  }

  public void doDelete(Rq rq) {
    long id = rq.getLongPathValueByIndex(1, 0);

    if(id == 0) {
      rq.replace("/usr/article/list/free", "올바른 요청이 아닙니다.");
      return;
    }

    Article article = articleService.findById(id);

    if(article == null) {
      rq.replace("/usr/article/list/free", "%d번 게시물은 존재하지 않습니다.".formatted(id));
      return;
    }

    articleService.delete(id);

    rq.replace("/usr/article/list/free", "%d번 게시물이 삭제되었습니다.".formatted(id));
  }

  public void showModify(Rq rq) {
    long id = rq.getLongPathValueByIndex(1, 0);

    if(id == 0) {
      rq.replace("/usr/article/list/free", "올바른 요청이 아닙니다.");
      return;
    }

    Article article = articleService.findById(id);

    if(article == null) {
      rq.replace("/usr/article/list/free", "%d번 게시물은 존재하지 않습니다.".formatted(id));
      return;
    }

    rq.setAttr("article", article);

    rq.view("usr/article/modify");
  }

  public void doModify(Rq rq) {
    long id = rq.getLongPathValueByIndex(1, 0);

    String subject = rq.getParam("subject", "");

    if(subject.trim().isEmpty()) {
      rq.replace("/usr/article/write", "제목을 입력해주세요.");
      return;
    }

    String content = rq.getParam("content", "");

    if(content.trim().isEmpty()) {
      rq.replace("/usr/article/write", "내용을 입력해주세요.");
      return;
    }

    articleService.modify(id, subject, content);

    rq.replace("/usr/article/detail/free/%d".formatted(id), "%d번 게시물이 수정되었습니다.".formatted(id));
  }
}
