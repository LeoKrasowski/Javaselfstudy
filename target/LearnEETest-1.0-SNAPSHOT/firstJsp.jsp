<%--
  Created by IntelliJ IDEA.
  User: BootCamp
  Date: 9/13/2022
  Time: 4:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
    <h1>Testing JSP </h1>
    <p>
        <%
            java.util.Date now = new java.util.Date();
            String someString = "Current date : " + now;
        %>
        <%@ page import="java.util.Date, logic.TestClass" %>

        <% TestClass testClass = new TestClass(); %>

        <%=
            testClass.getInfo()
        %>
        <%= someString %>
    </p>
    <p>
        <%
            for (int i = 0; i < 10; i++) {
                out.println("<p>" + "Hello : " + i + "</p>");
            }
        %>
        <%@ page import ="java.util.Date" %>

        <%

        %>
    </p>
</body>
</html>
