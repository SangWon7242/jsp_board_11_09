<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.sbs.jsp.board.article.Article" %>

<%
String pageTitle = "게시물 리스트";
request.setAttribute("pageTitle", pageTitle);

List<Article> articles = (List<Article>) request.getAttribute("articles");
%>

<%@ include file="../../common/head.jspf" %>

<section class="article-list-section">
  <div class="container mx-auto">
    <table class="table text-center">
      <colgroup>
        <col width="100"/>
        <col width="300"/>
      </colgroup>

      <thead class="text-[1.2rem]">
        <tr>
          <th>번호</th>
          <th>제목</th>
          <th>비고</th>
        </tr>
      </thead>
      <tbody>
        <% for(int i = articles.size() - 1; i >= 0; i--) {
        Article article = articles.get(i);
        %>
        <tr>
          <td><%=article.getId()%>번</td>
          <td>
            <a href="/usr/article/detail/free/<%=article.getId()%>" class="hover:underline hover:text-red-300"><%=article.getSubject()%></a>
          </td>
          <td>
            <a href="/usr/article/modify/free/<%=article.getId()%>" class="badge badge-primary badge-outline">수정</a>
            &nbsp;
            <a onclick="if(!confirm('정말 삭제하시겠습니까?')) return false;" href="/usr/article/delete/free/<%=article.getId()%>" class="badge badge-secondary badge-outline">삭제</a>
          </td>
        </tr>
        <% } %>
      </tbody>
    </table>
  </div>
</section>

  <%@ include file="../../common/foot.jspf" %>