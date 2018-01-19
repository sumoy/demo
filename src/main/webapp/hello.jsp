<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>Hello</title>
</head>
<body>
<c:choose>
<c:when test="${name == 'antu'}">
    Hello ${name} from jsp asjsiac
</c:when>
<c:otherwise>
Welcome ${name}
</c:otherwise>
</c:choose>
</body>
</html>