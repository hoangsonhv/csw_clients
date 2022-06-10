<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Son
  Date: 08/06/2022
  Time: 11:53 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%--%>
<%--    HashMap<String, String> errors = (HashMap<String, String>) request.getAttribute("errors");--%>
<%--    if (errors == null) {--%>
<%--        errors = new HashMap<>();--%>
<%--    }--%>
<%--%>--%>
<html>
<head>
    <title>Create Product</title>
    <link href="/assets/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
    <div class="container">
        <h1>Form Creatre New Product</h1>
<%--        <%--%>
<%--            if (errors != null && errors.size() > 0) {--%>
<%--        %>--%>
<%--            <div class="w3-pannel w3-pale-red w3-border">--%>
<%--                <h3>Please fix error below !</h3>--%>
<%--                <ul>--%>
<%--                    <% for (String message :--%>
<%--                                errors.values()) {%>--%>
<%--                        <li><%=message%>--%>
<%--                        </li>--%>
<%--                    <%--%>
<%--                        }--%>
<%--                    %>--%>
<%--                </ul>--%>
<%--            </div>--%>
<%--        <%--%>
<%--            }--%>
<%--        %>--%>
        <form action="/employees/store" method="POST">
            <div class="mb-3">
                <label class="form-label">Name</label>
                <input type="text" name="name" class="form-control" placeholder="Enter Name">
<%--                <%if (errors.containsKey("name")) {%>--%>
<%--                <span class="w3-text-red">* <%=errors.get("name")%></span>--%>
<%--                <%}%>--%>
            </div>
            <div class="mb-3">
                <label class="form-label">Salary</label>
                <input type="number" class="form-control" name="salary" placeholder="Enter Salary">
<%--                <%if (errors.containsKey("price")) {%>--%>
<%--                <span class="w3-text-red">* <%=errors.get("price")%></span>--%>
<%--                <%}%>--%>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>

</body>
</html>
