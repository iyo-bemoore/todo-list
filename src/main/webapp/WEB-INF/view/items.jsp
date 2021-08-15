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
       <h1>Complete To do items  </h1>
       <p> You have <c:out value="${todoData.items.size()}"/> items in the list </p>
       <c:url var="addUrl" value="${Mappings.ADD_ITEM}"/>
       <a href="${addUrl}">New Item</a>
          <table border="1" cellPadding="5" >
            <tr>

               <th>
                   Title
               </th>
               <th>
                  Deadline
               </th>
                <th>
                   Edit
                </th>
               <th>
                  Delete
               </th>
               <th>
                   View
               </th>
            </tr>
            <c:forEach var="item" items="${todoData.items}" >
            <c:url var="editUrl" value="${Mappings.ADD_ITEM}">
              <c:param name="id" value="${item.id}"/>
            </c:url>
            <c:url var="viewUrl" value="${Mappings.VIEW_ITEM}">
                    <c:param name="id" value="${item.id}"/>
            </c:url>
            <c:url var="deleteUrl" value="${Mappings.DELETE_ITEM}">
               <c:param name="id" value="${item.id}"/>
            </c:url>
                <tr>
                   <td><c:out value="${item.title}"/></td>
                   <td><c:out value="${item.deadline}"/></td>
                   <td><a href="${editUrl}"> Edit </a></td>
                   <td><a href="${deleteUrl}"> Remove </a></td>
                   <td><a href="${viewUrl}"> View </a></td>
                </tr>
            </c:forEach>
          </table>
       </div>
   </body>
</html>