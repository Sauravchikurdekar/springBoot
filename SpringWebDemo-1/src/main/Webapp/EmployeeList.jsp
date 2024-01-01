<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <html>
    <head>
    <title> Demo </title>
    </head>
    <body>
  <table border="1">
  <tr>
  <td>Id</td>
  <td>Name</td>
  <td>salary</td>
  <td colspan="2">action</td>
  </tr>
  <C:forEach var="emp" item="${list}">
  <tr>
  <td>${emp.empId}</td>
  <td>${emp.empName}</td>
  <td>${emp.salary}</td>
    
  <td><a href="edit?={emp.empId}">edit</td>
  <td><a href="delete?={emp.empId}">delete</td>
  </tr>
  </C:forEach>
  </table> 	
    </body>
    </html>