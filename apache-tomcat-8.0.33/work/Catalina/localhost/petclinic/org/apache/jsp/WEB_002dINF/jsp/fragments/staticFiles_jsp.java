/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.33
 * Generated at: 2016-03-29 20:02:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.fragments;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class staticFiles_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.2.5.RELEASE.jar", Long.valueOf(1459273056000L));
    _jspx_dependants.put("jar:file:/Users/shaun/workspaces/jcsdemo247/petclinic/apache-tomcat-8.0.33/webapps/petclinic/WEB-INF/lib/spring-webmvc-4.2.5.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1456391492000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("PetClinic :: a Spring Framework demonstration\n");
      out.write("-->\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("    <title>PetClinic :: a Spring Framework demonstration</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_spring_005furl_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bootstrapCss}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_spring_005furl_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${petclinicCss}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" rel=\"stylesheet\"/>\n");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_spring_005furl_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jQuery}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></script>\n");
      out.write("\n");
      out.write("    <!-- jquery-ui.js file is really big so we only load what we need instead of loading everything -->\n");
      out.write("    ");
      if (_jspx_meth_spring_005furl_005f3(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jQueryUiCore}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></script>\n");
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_spring_005furl_005f4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jQueryUiDatePicker}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></script>\n");
      out.write("\n");
      out.write("    <!-- jquery-ui.css file is not that big so we can afford to load it -->\n");
      out.write("    ");
      if (_jspx_meth_spring_005furl_005f5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${jQueryUiCss}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" rel=\"stylesheet\"/>\n");
      out.write("</head>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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

  private boolean _jspx_meth_spring_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f0 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f0.setParent(null);
    // /WEB-INF/jsp/fragments/staticFiles.jsp(12,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f0.setValue("/vendors/bootstrap/docs/assets/css/bootstrap.css");
    // /WEB-INF/jsp/fragments/staticFiles.jsp(12,4) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f0.setVar("bootstrapCss");
    int[] _jspx_push_body_count_spring_005furl_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f0 = _jspx_th_spring_005furl_005f0.doStartTag();
      if (_jspx_th_spring_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f1 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f1.setParent(null);
    // /WEB-INF/jsp/fragments/staticFiles.jsp(15,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f1.setValue("/resources/css/petclinic.css");
    // /WEB-INF/jsp/fragments/staticFiles.jsp(15,4) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f1.setVar("petclinicCss");
    int[] _jspx_push_body_count_spring_005furl_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f1 = _jspx_th_spring_005furl_005f1.doStartTag();
      if (_jspx_th_spring_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f2 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f2.setParent(null);
    // /WEB-INF/jsp/fragments/staticFiles.jsp(18,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f2.setValue("/vendors/jquery/jquery.js");
    // /WEB-INF/jsp/fragments/staticFiles.jsp(18,4) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f2.setVar("jQuery");
    int[] _jspx_push_body_count_spring_005furl_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f2 = _jspx_th_spring_005furl_005f2.doStartTag();
      if (_jspx_th_spring_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f2.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f3 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f3.setParent(null);
    // /WEB-INF/jsp/fragments/staticFiles.jsp(22,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f3.setValue("/vendors/jquery-ui/ui/jquery.ui.core.js");
    // /WEB-INF/jsp/fragments/staticFiles.jsp(22,4) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f3.setVar("jQueryUiCore");
    int[] _jspx_push_body_count_spring_005furl_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f3 = _jspx_th_spring_005furl_005f3.doStartTag();
      if (_jspx_th_spring_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f3.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f4(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f4 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f4.setParent(null);
    // /WEB-INF/jsp/fragments/staticFiles.jsp(25,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f4.setValue("/vendors/jquery-ui/ui/jquery.ui.datepicker.js");
    // /WEB-INF/jsp/fragments/staticFiles.jsp(25,4) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f4.setVar("jQueryUiDatePicker");
    int[] _jspx_push_body_count_spring_005furl_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f4 = _jspx_th_spring_005furl_005f4.doStartTag();
      if (_jspx_th_spring_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f4.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f5(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f5 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f5.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f5.setParent(null);
    // /WEB-INF/jsp/fragments/staticFiles.jsp(29,4) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f5.setValue("/vendors/jquery-ui/themes/base/jquery.ui.base.css");
    // /WEB-INF/jsp/fragments/staticFiles.jsp(29,4) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f5.setVar("jQueryUiCss");
    int[] _jspx_push_body_count_spring_005furl_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f5 = _jspx_th_spring_005furl_005f5.doStartTag();
      if (_jspx_th_spring_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f5.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f5);
    }
    return false;
  }
}
