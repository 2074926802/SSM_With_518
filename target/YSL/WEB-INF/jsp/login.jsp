
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>登录</title>
    <script type="text/javascript" src="../../js/jquery-1.11.0.min.js"></script>
    <script type="text/javascript">
        $(
            function () {
                $("#btn").on("click",function () {
                    var error="";
                    var flag=true;

                    var userName=$("#uName").val();
                    var pwd=$("#pwd").val();
                    if(userName==""||userName==undefined){
                        error="用户名不能为空！";
                        flag=false;
                    }
                    if(pwd==""||pwd==undefined){
                        error="密码不能为空！";
                        flag=false;
                    }
                    if(flag==true&&error==''){
                        $("#formId").submit();
                    }else{
                        alert(error);
                        return;
                    }
                });
            }
        );
    </script>
</head>
<body>
<h1>登录</h1>
<P style="color: red">${error}</P>
<form:form action="/doLogin" method="post" modelAttribute="user" id="formId">
    用户名：<form:input path="uname" id="uName"/><br>
    密码：<form:password path="password" id="pwd"/><br>
    <input type="button" value="提交" id="btn">
</form:form>
</body>
</html>
