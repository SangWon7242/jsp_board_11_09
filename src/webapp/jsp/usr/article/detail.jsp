<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="com.sbs.jsp.board.article.Article" %>

<%
String pageTitle = "게시물 상세보기";
request.setAttribute("pageTitle", pageTitle);

Article article = (Article) request.getAttribute("article");
%>

<%@ include file="../../common/head.jspf" %>

<section class="article-detail-section">
  <div>
    <% if(article != null) { %>
    <div>
      ID : <%=article.getId()%>
    </div>
    <div>
      SUBJECT : <%=article.getSubject()%>
    </div>
    <div>
      CONTENT : <%=article.getContent()%>
    </div>
    <% } %>
  </div>
  <div class="btn-group">
    <a href="/usr/article/list">리스트로 이동</a>
  </div>
</section>

<%@ include file="../../common/foot.jspf" %>