<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <table>
            <tr>
                <th>第一个板块的内容</th>
            </tr>
        </table>
    <c:forEach var="post" items="B001">
        <table>
            <tr>
                <td>${B001.getPdetails()}</td>
            </tr>
        </table>
    </c:forEach>
    </body>
</html>
