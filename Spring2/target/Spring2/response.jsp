<%--
  Created by IntelliJ IDEA.
  User: 任安阳
  Date: 2020/6/3
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%--<script src="js/jquery.min.js"></script>--%>
    <script src="js/jquery.min.js"></script>
    <script>
        $(function(){
            $("#btn").click(function(){
                alert("hello world");
            });
        });
    </script>
</head>
<body>
    <a href="user/testString">testString</a>
    <br/>
    <a href="user/testVoid">testVoid</a>
    <br/>
    <a href="user/testModelAndView">testModelAndView</a>
    <br/>
    <a href="user/testForward">testForward</a>
    <br/>
    <button id="btn">发送Ajax的请求</button>
</body>
</html>
