<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="bemoore.programming.util.Mappings"  %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    <title>Todo Items Welcome Page </title>
</head>
   <body>
       <div align="center">
       <c:url var="itemsLink" value="${Mappings.ITEMS}" />
         <h1> Welcome to Todo Home Page </<h1>
         <p><a href="${itemsLink}">Click here to see the items</a></p>
       </div>
   </body>
</html>