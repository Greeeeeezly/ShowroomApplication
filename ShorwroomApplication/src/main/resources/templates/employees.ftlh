<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div>Список сотрудников</div>
<table>
    <tr>
        <th>ID</th>
        <th>ID автосалона</th>
        <th>Email автосалона</th>
        <th>Адрес</th>
        <th>Город</th>
        <th>Email</th>
        <th>Телефон</th>
        <th>Действия</th>
    </tr>
<#list employees?sort_by("id") as employee>
<tr>
    <td>${employee.id}</td>
    <td>${employee.showroom.showroomId}</td>
    <td>${employee.showroom.email}</td>
    <td>${employee.address}</td>
    <td>${employee.city}</td>
    <td>${employee.email}</td>
    <td>${employee.phone}</td>
</#list>
</table>
<a href="main">Главная страница</a>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>

</html>
