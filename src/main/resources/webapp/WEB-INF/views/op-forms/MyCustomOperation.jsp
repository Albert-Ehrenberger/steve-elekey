<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<h2>My Custom Operation</h2>

<form:form method="post" modelAttribute="params">
    <label>Wert:</label>
    <form:input path="myField" />
    <button type="submit">Perform</button>
</form:form>
