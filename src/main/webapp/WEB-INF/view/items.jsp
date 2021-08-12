<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
          <table border="1" cellPadding="5" >
            <caption>
               <h2>Todo Items</h2>
            </caption>
            <tr>
               <th>
                   Title
               </th>
               <th>
                  Deadline
               </th>
            </tr>
            <c:forEach var="item" items="${todoData.items}" >
                <tr>
                   <td><c:out value="${item.title}"/></td>
                   <td><c:out value="${item.deadline}"/></td>
                </tr>
            </c:forEach>
          </table>
       </div>
   </body>
</html>