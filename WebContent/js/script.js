/**
 * 
 */
let xhr = new XMLHttpRequest();

window.onload = function() {
    document.getElementById("btnSalary").addEventListener("click", calculateSalary);
    document.getElementById("btnSalary2").addEventListener("click",calculateSalary2);
}

function calculateSalary() {
    xhr.onload = functionCallBack;
    let name = document.getElementById("txtName").value;
    let salary = document.getElementById("txtSalary").value;
    xhr.open("GET", "CalculateSalaryServlet?txtName="+name+"&txtSalary="+salary);
    xhr.send(null);
}

function functionCallBack() {
    document.getElementById("salaryCalculated").innerHTML = xhr.responseText;
}

function calculateSalary2(){
    xhr.onload = functionCallBack2;
    let name2 = document.getElementById("txtName2").value;
    let salary2 = document.getElementById("txtSalary2").value;
    let form = new FormData();
    form.append("txtName",name2);
    form.append("txtSalary",salary2);
    xhr.open("POST", "CalculateSalaryServlet2");
    xhr.send(form);
}
function functionCallBack2() {
    document.getElementById("salaryCalculated2").innerHTML = xhr.responseText;
}
