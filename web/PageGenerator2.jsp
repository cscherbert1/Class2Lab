<%-- 
    Document   : PageGenerator2
    Created on : Sep 4, 2017, 11:48:42 AM
    Author     : cscherbert1
--%>

<%@page import="java.time.Month"%>
<%@page import="java.time.LocalDate"%>
<%@page import="java.time.LocalDateTime"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Attendance</title>
    </head>
    <body>
        <h1>Distributed Java Attendance</h1>
        <%
          LocalDate classDate = LocalDate.of(2017, Month.AUGUST, 31);  
        %>
        
        <p>Date: <% out.println(classDate);%> </p>
        
        <table id="attendanceTable" name ="attendanceTable">
            <tr>
                <th>Student Id</th>
                <th>Student Name</th>
                <th>Attended Class</th>
            </tr>
            <tr>
                <td>1</td>
                <td>John Smith</td>
                <td>True</td>
            </tr>
            <tr>
                <td>2</td>
                <td>Jane Doe</td>
                <td>False</td>
            </tr>
            <tr>
                <td>3</td>
                <td>Collin Scherbert</td>
                <td>True</td>
            </tr>           
        </table>
    </body>
</html>
