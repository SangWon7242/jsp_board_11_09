<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.sbs.jsp.board.article.Article" %>

<%
List<Article> articles = (List<Article>) request.getAttribute("articles");
%>

<!--  daisy UI -->
<link href="https://cdn.jsdelivr.net/npm/daisyui@4.12.14/dist/full.min.css" rel="stylesheet" type="text/css" />

<!-- 테일윈드 css 적용 -->
<script src="https://cdn.tailwindcss.com"></script>

<style>
  @font-face {
    font-family: 'GmarketSansMedium';
    src: url('https://fastly.jsdelivr.net/gh/projectnoonnu/noonfonts_2001@1.1/GmarketSansMedium.woff') format('woff');
    font-weight: normal;
    font-style: normal;
  }

  html > body {
    font-family: 'GmarketSansMedium';
    text-underline-position: under;
  }
</style>

<section class="article-list-section">
  <div class="container mx-auto">
    <h1 class="text-[1.5rem] font-bold">게시물 리스트</h1>
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
            <a href="/usr/article/delete/free/<%=article.getId()%>" class="badge badge-secondary badge-outline">삭제</a>
          </td>
        </tr>
        <% } %>
      </tbody>
    </table>
  </div>
</section>