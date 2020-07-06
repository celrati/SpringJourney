<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
    <head>
        <title>student confirmation</title>
    </head>

    <body>
        <h1> the student is confirmed ${student.firstName} ${student.lastName}</h1>
        <hr />
        <h1> Country : ${student.country}</h1>
        <hr />
        favourite langauge is ${student.favouriteLanguage}

        <br/>
        operating system :
        <ul>
            <c:forEach var="temp" items="${student.operatingSystem}">
                <li> ${temp} </li>
            </c:forEach>
        </ul>
    </body>
</html>