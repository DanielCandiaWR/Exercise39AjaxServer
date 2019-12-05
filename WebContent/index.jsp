<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>Insert title here</title>
        <link rel="stylesheet" href="css/style.css">
    </head>

    <body>
        <h1>Ajax Server Side</h1>
        <h2>Practica 1</h2>

        <div>
            <label for="txtName">Name of Employee</label>
            <input type="text" id="txtName" name="txtName" placeholder="Name">
        </div>
        <div>
            <label for="txtSalary">Salary of Employee</label>
            <input type="text" id="txtSalary" name="txtSalary" placeholder="Salary">
        </div>
        <div>
            <input id="btnSalary" class="btn btn-info" type="submit" value="Calculate Salary">
        </div>

        <div id="salaryCalculated">

        </div>
        
        <h2>Practica 2</h2>
        <div>
            <label for="txtName2">Name of Employee</label>
            <input type="text" id="txtName2" name="txtName2" placeholder="Name2">
        </div>
        <div>
            <label for="txtSalary2">Salary of Employee</label>
            <input type="text" id="txtSalary2" name="txtSalary2" placeholder="Salary2">
        </div>
        <div>
            <input id="btnSalary2" class="btn btn-info" type="submit" value="Calculate Salary">
        </div>

        <div id="salaryCalculated2">

        </div>
        
        <script src="js/script.js"></script>
    </body>

    </html>