<%@ page import="com.hibernate.notetaker.entities.Note" %>
<%@ page import="com.hibernate.notetaker.dao.DBOPs" %>
<%@ page import="org.hibernate.Session" %>
<%@ page import="com.hibernate.notetaker.util.HibernateUtil" %><%--
  Created by IntelliJ IDEA.
  User: imcvk
  Date: 04/09/22
  Time: 12:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <head>
        <%@include file="all_js_css.jsp" %>
    </head>
    <title>Edit Notes</title>
</head>
<body>
<div class="container-fluid p-0 m-0">
    <%@include file="navbar.jsp" %>
    <br>
    <%
        int note_id = Integer.parseInt(request.getParameter("note_id"));
        Session session1 = HibernateUtil.getSessionFactory().openSession();
        Note note = session1.get(Note.class, note_id);
    %>
    <h1>Enter details</h1>
    <form action="${pageContext.request.contextPath}/UpdateServlet" method="post">
        <div class="mb-3">
            <label for="title" class="form-label">Note Title</label>

            <input type="text" class="form-control" id="title" aria-describedby="emailHelp"
                   placeholder="Enter note title" name="title" required value="<%=note.getTitle()%>">
            <input type="text" class="form-control" name="noteId" id="<%=note_id%>" value="<%=note_id%>" hidden>
        </div>

        <div class="mb-3">
            <label for="content" class="form-label">Note Content</label>
            <textarea id="content" placeholder="Enter your content" class="form-control" required
                      style="height: 300px" name="content">
                <%=note.getContent().trim()%>
            </textarea>
        </div>
        <div class="container text-center">
            <button type="submit" class="btn btn-primary">Save</button>
        </div>

    </form>
</div>
</body>
</html>
