<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.sbs.jsp.board.article.Article" %>

<%
List<Article> articles = (List<Article>) request.getAttribute("articles");
%>

<h1>게시물 리스트</h1>

<section class="article-list-section">
  <table border="1" style="border-collapse: collapse;">
    <colgroup>
      <col width="50"/>
      <col width="300"/>
    </colgroup>

    <thead>
      <tr>
        <th>번호</th>
        <th>제목</th>
      </tr>
    </thead>
    <tbody>

    <% for(int i = articles.size() - 1; i >= 0; i--) {
      Article article = articles.get(i);
    %>
      <tr>
        <td><%=article.getId()%>번</td>
        <td>
          <a href="/usr/article/detail?id=<%=article.getId()%>"><%=article.getSubject()%></a>
        </td>
      </tr>
    <% } %>
    </tbody>
  </table>
</section>