<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 07.09.2022
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<h1>Add New Book</h1>
<form:form method="post" action="save">
    <table>
        <tr>
            <td>Name:</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Author:</td>
            <td><form:input path="author"/></td>
        </tr>
        <tr>
            <td>Price:</td>
            <td><form:input path="price"/></td>
        </tr>
        <tr>
            <td>Janr:</td>
            <td><form:input path="janr"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="save"></td>
        </tr>
            <%--    <tr>--%>
            <%--        <td>image:</td>--%>
            <%--        <td><form:input path="name"/></td>--%>
            <%--    </tr>--%>

    </table>


</form:form>