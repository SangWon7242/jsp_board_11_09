package com.sbs.jsp.board.container;

import com.sbs.jsp.board.article.ArticleController;
import com.sbs.jsp.board.member.MemberController;

public class Container {
  public static MemberController memberController;
  public static ArticleController articleController;

  static {
    memberController = new MemberController();
    articleController = new ArticleController();
  }
}
