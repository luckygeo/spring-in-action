<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/common/tag.jsp"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document1</title>
</head>
<body>
<span>spittles111</span>
<ul>
    <c:forEach items="${spittles}" var="item">
        <li>${item.message}</li>
    </c:forEach>
</ul>
<span id="jq">我爱你</span>
</body>
<script type="text/javascript" src="/js/jquery-1.11.3.min.js">

</script>
<script>
    console.log($("#jq").text());
</script>
</html>
