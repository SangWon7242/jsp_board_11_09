<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%
String pageTitle = "게시물 상세보기";
request.setAttribute("pageTitle", pageTitle);
%>

<%@ include file="../../common/head.jspf" %>

<section class="article-detail-section">
  <div class="inner mx-auto flex w-[800px] flex-col">
    <div class="border rounded-xl p-[20px] w-full min-h-[350px]">
      <div>
        <span class="badge badge-primary">ID</span>
        :
        <span>${article.id}</span>
      </div>
      <div>
        <span class="badge badge-secondary">SUBJECT</span>
        :
         <span>${article.subject}</span>
      </div>
      <div class="flex flex-col flex-grow gap-y-2">
        <span class="badge badge-accent">CONTENT</span>
        <div class="p-3">
          ${article.content}
        </div>
      </div>
    </div>
    <div class="btn-group mt-3 flex justify-end">
      <a href="/usr/article/list" class="btn btn-primary btn-outline">리스트로 이동</a>
    </div>
  </div>
</section>

<%@ include file="../../common/foot.jspf" %>