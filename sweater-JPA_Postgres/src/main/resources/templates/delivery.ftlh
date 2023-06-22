<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div>Список доставок</div>
<table>
    <tr>
        <th>ID</th>
        <th>Дата</th>
        <th>Количество автомобилей</th>
        <th>ID завода</th>
        <th>Название завода</th>
        <th>ID автосалона</th>
        <th>Адрес автосалона</th>
        <th>Автомобиль</th>
    </tr>
    <#list deliveries as delivery>
    <tr>
        <td>${delivery.id}</td>
        <td>${delivery.date}</td>
        <td>${delivery.count_of_cars}</td>
        <td>${delivery.factory.id}</td>
        <td>${delivery.factory.name}</td>
        <td>${delivery.showroom.showroomId}</td>
        <td>${delivery.showroom.address}</td>
        <td>
            <#list delivery.cars as car>
                ${car.brand}
                ${car.model}
            </#list>
        </td>        </#list>
</table>
<a href="main">Главная страница</a>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>

</body>

</html>
