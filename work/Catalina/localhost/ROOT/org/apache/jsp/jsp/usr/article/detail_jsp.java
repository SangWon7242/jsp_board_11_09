/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.28
 * Generated at: 2024-11-23 02:20:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp.usr.article;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class detail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/jsp/common/foot.jspf", Long.valueOf(1731811191316L));
    _jspx_dependants.put("jar:file:/C:/Users/User/.m2/repository/org/mortbay/jasper/taglibs-standard/10.0.0-M10/taglibs-standard-10.0.0-M10.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-10.0.0-M10.jar", Long.valueOf(1708733386169L));
    _jspx_dependants.put("/jsp/common/head.jspf", Long.valueOf(1732326379653L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

String pageTitle = "게시물 상세보기";
request.setAttribute("pageTitle", pageTitle);

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"ko\">\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"UTF-8\">\r\n");
      out.write("  <meta name=\"viewport\"\r\n");
      out.write("        content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("  <title>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageTitle}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</title>\r\n");
      out.write("\r\n");
      out.write("  <!--  daisy UI -->\r\n");
      out.write("  <link href=\"https://cdn.jsdelivr.net/npm/daisyui@4.12.14/dist/full.min.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\r\n");
      out.write("  <!-- 테일윈드 css 적용 -->\r\n");
      out.write("  <script src=\"https://cdn.tailwindcss.com\"></script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"flex flex-col\">\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("  @font-face {\r\n");
      out.write("    font-family: 'GmarketSansMedium';\r\n");
      out.write("    src: url('https://fastly.jsdelivr.net/gh/projectnoonnu/noonfonts_2001@1.1/GmarketSansMedium.woff') format('woff');\r\n");
      out.write("    font-weight: normal;\r\n");
      out.write("    font-style: normal;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  html > body {\r\n");
      out.write("    font-family: 'GmarketSansMedium';\r\n");
      out.write("    text-underline-position: under;\r\n");
      out.write("  }\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<header class=\"top-bar h-[60px] bg-[#efefef]\">\r\n");
      out.write("  <div class=\"container mx-auto flex h-full\">\r\n");
      out.write("    <nav class=\"menu-1\">\r\n");
      out.write("      <ul class=\"flex h-full\">\r\n");
      out.write("        <li><a href=\"/usr/article/write\" class=\"flex h-full items-center px-3\">게시물 작성</a></li>\r\n");
      out.write("        <li><a href=\"/usr/article/list\" class=\"flex h-full items-center px-3\">게시물 리스트</a></li>\r\n");
      out.write("        <li><a href=\"#\" class=\"flex h-full items-center px-3\">로그인</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </nav>\r\n");
      out.write("  </div>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<div class=\"content-wrap h-screen mt-[20px]\">");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<section class=\"article-detail-section\">\r\n");
      out.write("  <div class=\"inner mx-auto flex w-[800px] flex-col\">\r\n");
      out.write("    <div class=\"border rounded-xl p-[20px] w-full min-h-[350px]\">\r\n");
      out.write("      <div>\r\n");
      out.write("        <span class=\"badge badge-primary\">ID</span>\r\n");
      out.write("        :\r\n");
      out.write("        <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${article.id}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div>\r\n");
      out.write("        <span class=\"badge badge-secondary\">SUBJECT</span>\r\n");
      out.write("        :\r\n");
      out.write("         <span>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${article.subject}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"flex flex-col flex-grow gap-y-2\">\r\n");
      out.write("        <span class=\"badge badge-accent\">CONTENT</span>\r\n");
      out.write("        <div class=\"p-3\">\r\n");
      out.write("          ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${article.content}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"btn-group mt-3 flex justify-end\">\r\n");
      out.write("      <a href=\"/usr/article/list\" class=\"btn btn-primary btn-outline\">리스트로 이동</a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</section>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <footer class=\"bottom-bar bg-black text-white h-[100px]\">\r\n");
      out.write("    <div class=\"flex h-full items-center justify-center\">\r\n");
      out.write("      <span class=\"text-[1.3rem]\">copyright(c) 2024 All rights reserved</span>\r\n");
      out.write("    </div>\r\n");
      out.write("  </footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
