package com.sbs.jsp.board.article;

import com.sbs.jsp.board.Rq;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ArticleController {
  private List<Article> articleList;

  public ArticleController() {
    articleList = new ArrayList<>();
    makeTestData();
  }
  
  void makeTestData() {

    /*
    for(int i = 5; i >= 1; i--) {
      articleList.add(new Article(i, "제목" + i, "내용" + i));
    }
     */
      
    // 스트림 문법
    IntStream.rangeClosed(1, 5)
        .map(i -> 6 - i) // 5, 4, 3, 2, 1 매핑
        .forEach(i -> articleList.add(new Article(i, "제목" + i, "내용" + i)));
  }

  public void showList(Rq rq) {
    List<Article> articles = articleList;

    rq.setAttr("articles", articles);

    rq.view("usr/article/list");
  }
}
