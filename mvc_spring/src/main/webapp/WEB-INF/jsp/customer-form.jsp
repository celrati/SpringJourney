<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <title> hello world customer form</title>
        <style>
            .error {color: red}
        </style>
    </head>

    <body>
        <form:form action="processForm" modelAttribute="customer">

            FirstName : <form:input path="firstName" />
            <br /> <br />

            LastName(*) : <form:input path="lastName"  />
            <form:errors path="lastName" cssClass="error" />

            Free passes: <form:input path="freePasses" />
            <form:errors path="freePasses"  cssClass="error" />


            PostalCode : <form:input path="postalCode" />
            <form:errors path="postalCode"  cssClass="error" />

            Course Code: <form:input path="courseCode" />
            <form:errors path="courseCode" cssClass="error" />

		    <br><br>

            <br /> <br />
            <input type="submit" value"submit" />


        </form:form>
    </body>
</html>