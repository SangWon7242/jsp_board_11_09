<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="com.sbs.jsp.board.article.Article" %>

<%
  String pageTitle = "게시물 수정";
  request.setAttribute("pageTitle", pageTitle);

  Article article = (Article) request.getAttribute("article");
%>

<%@ include file="../../common/head.jspf" %>

<script>
  function ArticleSave__submitForm(form) {
    form.subject.value = form.subject.value.trim();

    if(form.subject.value.length == 0) {
      alert("제목을 입력해주세요.");
      form.subject.focus();
      return;
    }

    form.content.value = form.content.value.trim();

    if(form.content.value.length == 0) {
      alert("내용을 입력해주세요.");
      form.content.focus();
      return;
    }

    form.submit();
  }
</script>

<section class="article-modify-section">
  <div class="container mx-auto flex justify-center">
    <form method="POST" onsubmit="ArticleSave__submitForm(this); return false;" class="w-[800px]">
      <div class="flex flex-col">
        <span class="badge badge-accent">번호 : <%=article.getId()%></span>
      </div>
      <div class="flex flex-col gap-y-2 mt-3">
        <span class="badge badge-primary">제목</span>
        <div>
          <input class="input input-bordered w-full" name="subject" type="text" placeholder="제목을 입력해주세요." maxlength="50" value="<%=article.getSubject()%>">
        </div>
      </div>
      <div class="flex flex-col gap-y-2 mt-3">
        <span class="badge badge-secondary">내용</span>
        <div>
          <textarea class="textarea textarea-bordered w-full" name="content" placeholder="내용을 입력해주세요." cols="30" rows="10"><%=article.getContent()%></textarea>
        </div>
      </div>

      <div class="btn-group w-full flex gap-x-2">
        <button type="submit" class="btn btn-outline btn-primary flex-1">수정</button>
        <a href="/usr/article/list" class="btn btn-outline btn-secondary flex-1">취소</a>
      </div>
    </form>
  </div>
</section>

<%@ include file="../../common/foot.jspf" %>