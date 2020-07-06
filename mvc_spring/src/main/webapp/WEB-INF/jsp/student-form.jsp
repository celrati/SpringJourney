<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <title> hello world input form</title>
    </head>

    <body>
        <form:form action="processForm" modelAttribute="student">
            FirstName  : <form:input path="firstName" />
                <br />
            LastName  : <form:input path="lastName" />
            <input type="submit" />
            <hr />

            <form:select path="country">
                <form:options items="${student.countryOptions}" />
            </form:select>

            <hr/>
            favourite language :
            Java <form:radiobutton path="favouriteLanguage" value="java"/>
            c <form:radiobutton path="favouriteLanguage" value="c"/>
            php <form:radiobutton path="favouriteLanguage" value="php"/>

            <br />
           Linux <form:checkbox path="operatingSystem" value="linux" />
           Windows <form:checkbox path="operatingSystem" value="windows" />

        </form:form>
    </body>
</html>