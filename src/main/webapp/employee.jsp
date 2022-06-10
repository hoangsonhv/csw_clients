<%@ page import="java.util.List" %>
<%@ page import="com.example.csw_clients.entity.Employee" %><%--
  Created by IntelliJ IDEA.
  User: Son
  Date: 08/06/2022
  Time: 9:51 SA
  To change this template use File | Settings | File Templates.
--%>
<%
    List<Employee> list = (List<Employee>) request.getAttribute("employees");
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Employee</title>
    <link href="/assets/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
    <div class="container">
        <h1 class="text-center">List Employee</h1>
        <a href="create.jsp" class="btn btn-primary">Create New Employee</a>
        <table class="table tab-container">
            <thead>
                <tr>
                    <td>ID</td>
                    <td>Name</td>
                    <td>Price</td>
                </tr>
            </thead>
            <tbody>
                <%for (Employee employee:
                        list) {%>
                    <tr>
                        <td><%= employee.getId() %></td>
                        <td><%= employee.getName() %></td>
                        <td><%= employee.getSalary() %></td>
                    </tr>
                <%
                    }
                %>
            </tbody>
        </table>
    </div>
</body>
</html>
