<%-- 
    Document   : response
    Created on : Aug 29, 2017, 9:28:54 PM
    Author     : cscherbert1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Basic Java Web | Response </title>
    </head>
    <body>
        <h2>Hello Response:</h2>
        
        <%--Retrieve response created by the server --%>
        <%
            Object msgObj = request.getAttribute("nameMsg");
            String msg = "Undefined";
            
            if(msgObj != null){
                //msg = (String)msgObj;
                msg = msgObj.toString();
            }
            
            out.println("<p>" + msg + "</p>");
        %>
    </body>
</html>
