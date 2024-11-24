<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
String pageTitle = "게시물 리스트";
request.setAttribute("pageTitle", pageTitle);
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
        <c:forEach var="article" items="${articles}">
          <tr>
            <td>${article.id}번</td>
            <td>
              <a href="/usr/article/detail/free/${article.id}" class="hover:underline hover:text-red-300">${article.subject}</a>
            </td>
            <td>
              <a href="/usr/article/modify/free/${article.id}" class="badge badge-primary badge-outline">수정</a>
              &nbsp;
              <a onclick="if(!confirm('정말 삭제하시겠습니까?')) return false;" href="/usr/article/delete/free/${article.id}?_method=DELETE" class="badge badge-secondary badge-outline">삭제</a>
            </td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>
</section>

<%@ include file="../../common/foot.jspf" %>