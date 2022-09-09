<%--
  Created by IntelliJ IDEA.
  User: imcvk
  Date: 01/09/22
  Time: 10:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="all_js_css.jsp" %>
</head>
</head>
<body>
<div class="container-fluid p-0 m-0">
    <%@include file="navbar.jsp" %>
    <br>
    <%--
   this is add note form
    --%>
    <h1>Enter details</h1>
    <form action="saveNoteServlet" method="post">
        <div class="mb-3">
            <label for="title" class="form-label">Note Title</label>
            <input type="text" class="form-control" id="title" aria-describedby="emailHelp"
                   placeholder="Enter note title" name="title" required>
        </div>

        <div class="mb-3">
            <label for="content" class="form-label">Note Content</label>
            <textarea id="content" placeholder="Enter your content" class="form-control" required
                      style="height: 300px" name="content"></textarea>
        </div>
        <div class="container text-center">
            <button type="submit" class="btn btn-primary">Add</button>
        </div>

    </form>

</div>
</body>
</html>
