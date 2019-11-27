<%@ page import="ru.itpark.domain.Auto" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <%@ include file="bootstrap.jsp" %>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col">
            <h1>Result</h1>




            <div class="row">
                <% if (request.getAttribute("result") != null) { %>
                <% for (Auto item : (List<Auto>)request.getAttribute("result")) { %>
                <div class="col-sm-6 mt-3">
                    <div class="card">
                        <img src="<%= request.getContextPath() %>/images/<%= item.getImage() %>" class="card-img-top">
                        <div class="card-body">
                            <h5 class="card-title"><%= item.getName() %></h5>
                            <p class="card-text"><%= item.getDescription()%></p>
                            <a href="<%= request.getContextPath() %>/<%= item.getId() %>" class="btn btn-primary">Details</a>
                        </div>
                    </div>
                </div>
                <% } %>
                <% } %>
            </div>
        </div>
    </div>
</div>


</body>
</html>