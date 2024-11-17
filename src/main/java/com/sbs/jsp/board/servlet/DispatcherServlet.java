package com.sbs.jsp.board.servlet;

import com.sbs.jsp.board.Rq;
import com.sbs.jsp.board.article.ArticleController;
import com.sbs.jsp.board.container.Container;
import com.sbs.jsp.board.member.MemberController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/usr/*")
public class DispatcherServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    Rq rq = new Rq(req, resp);

    MemberController memberController = Container.memberController;
    ArticleController articleController = Container.articleController;

    switch (rq.getMethod()) {
      case "GET" -> {
        switch (rq.getActionPath()) {
          case "/usr/article/write" -> articleController.showWrite(rq);
          case "/usr/article/list" -> articleController.showList(rq);
          case "/usr/article/detail" -> articleController.showDetail(rq);
          case "/usr/article/delete" -> articleController.doDelete(rq);
          case "/usr/member/join" -> memberController.showJoin(rq);
        }
      }
      case "POST" -> {
        switch (rq.getActionPath()) {
          case "/usr/article/write" -> articleController.doWrite(rq);
        }
      }
    }
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    doGet(req, resp);
  }
}
