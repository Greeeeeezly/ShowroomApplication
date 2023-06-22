<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div>Поиск продаж по id автосалона</div>
<form method="post" action="filter">
    <input type="number" name="id">
    <button type="submit">Найти</button>
</form>
<div>Список продаж</div>
<table>
    <tr>
        <th>ID</th>
        <th>ID автосалона</th>
        <th>Email автосалона</th>
        <th>ID клиента</th>
        <th>Email клиента</th>
        <th>Количество автомобилей</th>
    </tr>
    <#list sellings as selling>
    <tr>
        <td>${selling.id}</td>
        <td>${selling.showroom.showroomId}</td>
        <td>${selling.showroom.email}</td>
        <td>${selling.customer.id}</td>
        <td>${selling.customer.email}</td>
        <td>${selling.count_of_cars}</td>
        </#list>
</table>
<a href="main">Главная страница</a>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>

</html>
