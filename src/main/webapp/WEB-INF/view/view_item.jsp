<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="bemoore.programming.util.Mappings"  %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
    <title>Todo Items</title>
</head>
   <body>
       <div align="center">
       <h1>View Item </h1>
          <div>
               <p>Title: <c:out value="${item.title}"/></p>
               <p>Description: <c:out value="${item.details}"/></p>
               <p>Deadline: <c:out value="${item.deadline}"/></p>
          </div>
          <div>
             <c:url var="addUrl" value="${Mappings.ITEMS}"/>
             <a href="${addUrl}">Back To the list</a>
          </div>
       </div>
   </body>
</html>