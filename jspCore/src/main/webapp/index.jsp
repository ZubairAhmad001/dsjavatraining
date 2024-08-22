<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome Page</title>
</head>
<body>
    <h1>WELCOME TO THE PAGE</h1>

    <%-- Retrieving the submitted username from the request --%>
    <%
        String name = request.getParameter("username");
        if (name != null && !name.trim().isEmpty()) {
            out.println("<p>Hello, " + name + "! Welcome to the JSP world.</p>");
        } else {
            out.println("<p>Zubair Ahmad.</p>");
        }
    %>

    <%-- Retrieving and processing friend's details --%>
    <%
        String friendName = request.getParameter("friendname");
        int friendAge = Integer.parseInt(request.getParameter("friendage"));
        String friendGender = request.getParameter("friendgender");

        if ((friendAge > 18 && friendGender.equalsIgnoreCase("Male")) ||
            (friendAge > 16 && friendGender.equalsIgnoreCase("Female"))) {
            out.println("<p>" + friendName + ", you can apply.</p>");
             response.sendDirect("www.google.com");
        } else {
            out.println("<p>" + friendName + ", you cannot apply.</p>");

        }
    %>

    <p><a href="index.jsp">Go Back</a></p>
</body>
</html>


