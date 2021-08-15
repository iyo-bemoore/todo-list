<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="bemoore.programming.util.AttributeName" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Add Todo Item</title>
</head>
   <body>
       <div align="center">
          <form:form method="POST" modelAttribute="${AttributeName.TODO_ITEM}">
              <div>
                 <label>ID</label>
                 <form:input path="id" disabled="true"/>
              </div>
              <div>
                <label>Title</label>
                <form:input path="title"/>
              </div>
              <div>
                  <label>Details</label>
                  <form:textarea path="details"/>
              </div>
              <div>
                 <label>Deadline</label>
                 <form:input path="deadline" />
              </div>
              <div>
                  <input type="submit" value="Submit"/>
              </div>
          </form:form>
       </div>
   </body>
</html>