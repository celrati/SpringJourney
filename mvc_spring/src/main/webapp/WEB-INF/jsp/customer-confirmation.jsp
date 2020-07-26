<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
    <head>
        <title> customer confirmation</title>

    </head>

    <body>
        the costumer is confirmed : ${customer.firstName}  ${customer.lastName}
        <br /> <br />
        freePasses : ${customer.freePasses}
        <br /> <br />

        postalCode : ${customer.postalCode}

        <br /> <br />
        CourseCode : ${customer.courseCode}
    </body>
</html>