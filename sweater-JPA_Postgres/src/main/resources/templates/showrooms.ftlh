<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body>
<div>Добавление автосалона</div>
<div>
    <form method="post" action="/showrooms">
        <input type="text" name="address" placeholder="Адрес" />
        <input type="number" name="area" placeholder="Площадь" />
        <input type="text" name="city" placeholder="Город" />
        <input type="text" name="email" placeholder="Email" />
        <input type="text" name="phone" placeholder="Телефон" />
        <button type="submit">Добавить</button>
    </form>
</div>
<div>Список автосалонов</div>

<table>
    <tr>
        <th>ID</th>
        <th>Адрес</th>
        <th>Площадь</th>
        <th>Телефон</th>
        <th>Город</th>
        <th>Email</th>
        <th>ID сотрудников</th>
    </tr>
    <#list showrooms?sort_by("showroomId") as showroom>
        <#list showroom.employees as employee>
        <tr>
            <td>${showroom.showroomId}</td>
            <td>${showroom.address}</td>
            <td>${showroom.area}</td>
            <td>${showroom.city}</td>
            <td>${showroom.email}</td>
            <td>${showroom.phone}</td>
            <td>

                    ${employee.id}
            </td>
            <td>
                <button onclick="toggleEditForm('${showroom.showroomId}')">Изменить</button>
            </td>
        </tr>
        <tr id="editForm_${showroom.showroomId}" style="display: none;">
            <td colspan="7">
                <form action="/updateShowroom" method="post">
                    <input type="hidden" name="showroom_id" value="${showroom.showroomId}" />
                    <input type="text" name="address" value="${showroom.address}" />
                    <input type="number" name="area" value="${showroom.area}" />
                    <input type="text" name="city" value="${showroom.city}" />
                    <input type="text" name="email" value="${showroom.email}" />
                    <input type="text" name="phone" value="${showroom.phone}" />
                    <button type="submit">Отправить</button>
                </form>
            </td>
        </tr>
        </#list>

    </#list>
</table>
<div>Удаление автосалона</div>
<form action="/deleteShowroom" method="post">
    <label for="showroom_id">ID автосалона:</label>
    <input type="text" id="showroom_id" name="showroom_id" required />
    <button type="submit">Удалить</button>
</form>

<script>
    function toggleEditForm(showroomId) {
        var editForm = document.getElementById("editForm_" + showroomId);
        if (editForm.style.display === "") {
            editForm.style.display = "table-row";
        } else {
            editForm.style.display = "";
        }
    }
</script>
<a href="main">Главная страница</a>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
