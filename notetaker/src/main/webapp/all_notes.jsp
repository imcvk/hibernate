<%@ page import="com.hibernate.notetaker.dao.DBOPs" %>
<%@ page import="java.util.List" %>
<%@ page import="com.hibernate.notetaker.entities.Note" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="java.text.SimpleDateFormat" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <head>
        <%@include file="all_js_css.jsp" %>
    </head>
</head>
<title>All Notes</title>
</head>
<body>
<div class="container-fluid p-0 m-0">
    <%@include file="navbar.jsp" %>
    <br>
    <h1>All Notes</h1>
    <div class="col-12">
        <%
            DBOPs dboPs = new DBOPs();
            List<Note> noteList = dboPs.getAllNotes();
            for (Note n : noteList) {
        %>
        <div class="card">
            <img class="card-img-top m-4" src="img/notes.png" alt="Card image cap" style="max-width: 50px">
            <div class="card-body">
                <b><h5 class="card-title"><%=n.getTitle()%>
                </h5></b>
                <p class="card-text"><%=n.getContent()%>
                </p>


                    <p class="card-text">
                    <b>Added/Updated date:</b>
                        <%=new SimpleDateFormat("dd.MM.yyyy").format(n.getAddedDate())%>
                    </p>

            </div>
            <div class="container text-center">
                <a href="${pageContext.request.contextPath}/DeleteServlet?note_id=<%=n.getId()%>"
                   class="btn btn-danger">Delete</a>
                <a href="edit.jsp?note_id=<%=n.getId()%>" class="btn btn-primary">Update</a>
            </div>

        </div>
        <%
            }

        %>

    </div>

</div>
</body>
</html>
