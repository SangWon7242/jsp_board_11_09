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
      rq.print("""
                    <script>
                      alert('게시물이 존재하지 않습니다.');
                    </script>
                    """);
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
      rq.print("""
                    <script>
                      alert('제목을 입력해주세요.');
                    </script>
                    """);
      return;
    }

    String content = rq.getParam("content", "");

    if(content.trim().isEmpty()) {
      rq.print("""
                    <script>
                      alert('내용을 입력해주세요.');
                    </script>
                    """);
      return;
    }

    long id = articleService.write(subject, content);

    rq.print("""
                    <script>
                      alert('%d번 게시물이 생성되었습니다.');
                    </script>
                    """.formatted(id));
  }

  public void showDetail(Rq rq) {
    long id = rq.getLongPathValueByIndex(1, 0);

    if(id == 0) {
      rq.print("""
                    <script>
                      alert('올바른 요청이 아닙니다.');
                    </script>
                    """);
      return;
    }

    Article article = articleService.findById(id);

    if(article == null) {
      rq.print("""
                    <script>
                      alert('%d번 게시물은 존재하지 않습니다.');
                    </script>
                    """.formatted(id));
      return;
    }

    rq.setAttr("article", article);

    rq.view("usr/article/detail");
  }

  public void doDelete(Rq rq) {
    long id = rq.getLongPathValueByIndex(1, 0);

    if(id == 0) {
      rq.print("""
                    <script>
                      alert('올바른 요청이 아닙니다.');
                    </script>
                    """);
      return;
    }

    Article article = articleService.findById(id);

    if(article == null) {
      rq.print("""
                    <script>
                      alert('%d번 게시물은 존재하지 않습니다.');
                    </script>
                    """.formatted(id));
      return;
    }

    articleService.delete(id);

    rq.print("""
                    <script>
                      alert('%d번 게시물이 삭제되었습니다.');
                    </script>
                    """.formatted(id));
  }

  public void showModify(Rq rq) {
    long id = rq.getLongPathValueByIndex(1, 0);

    if(id == 0) {
      rq.print("""
                    <script>
                      alert('올바른 요청이 아닙니다.');
                    </script>
                    """);
      return;
    }

    Article article = articleService.findById(id);

    if(article == null) {
      rq.print("""
                    <script>
                      alert('%d번 게시물은 존재하지 않습니다.');
                    </script>
                    """.formatted(id));
      return;
    }

    rq.setAttr("article", article);

    rq.view("usr/article/modify");
  }

  public void doModify(Rq rq) {
    long id = rq.getLongPathValueByIndex(1, 0);

    String subject = rq.getParam("subject", "");

    if(subject.trim().isEmpty()) {
      rq.print("""
                    <script>
                      alert('제목을 입력해주세요.');
                    </script>
                    """);
      return;
    }

    String content = rq.getParam("content", "");

    if(content.trim().isEmpty()) {
      rq.print("""
                    <script>
                      alert('내용을 입력해주세요.');
                    </script>
                    """);
      return;
    }

    articleService.modify(id, subject, content);

    rq.print("""
                    <script>
                      alert('%d번 게시물이 수정되었습니다.');
                    </script>
                    """.formatted(id));
  }
}
