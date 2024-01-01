<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <html>
    <head>
    <title> Demo </title>
    </head>
    <body>
    <form action="updateemp">
   EMPID:<input type="text" name="empId" value="${emp.empId}"><br>
   EMPNAME:<input type="text" name="empName" value="${emp.empName}"><br>
   EMPSALARY:<input type="text" name="salary" value="${emp.salary}"><br>
   <input type="submit" value="submit"><br>
     </form>
    </body>
    </html>