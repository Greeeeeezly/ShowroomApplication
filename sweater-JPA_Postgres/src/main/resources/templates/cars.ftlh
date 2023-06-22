<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div>Список автомобилей</div>
<table>
    <tr>
        <th>ID</th>
        <th>VIN</th>
        <th>Тип кузова</th>
        <th>Цвет</th>
        <th>Бренд</th>
        <th>Модель</th>
        <th>Описание</th>
        <th>Цена</th>
        <th>ID поставки</th>
        <th>Дата поставки</th>
        <th>ID продажи</th>
        <th>Дата продажи</th>
        <th>Количество проданных автомобилей</th>
        <th>ID автосалона</th>
        <th>Адрес автосалона</th>
    </tr>
    <#list cars?sort_by("id") as car>
    <tr>
        <td>${car.id}</td>
        <td>${car.vin_code}</td>
        <td>${car.type.name}</td>
        <td>${car.color}</td>
        <td>${car.brand}</td>
        <td>${car.model}</td>
        <td>${car.description}</td>
        <td>${car.price}</td>
        <td>${car.delivery.id}</td>
        <td>${car.delivery.date}</td>
        <td>${car.selling.id}</td>
        <td>${car.selling.date}</td>
        <td>${car.selling.count_of_cars}</td>
        <td>${car.selling.showroom.showroomId}</td>
        <td>${car.selling.showroom.address}</td>
        </#list>
</table>
<a href="main">Главная страница</a>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>

</html>
