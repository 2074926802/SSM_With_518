<%--
  Created by IntelliJ IDEA.
  User: Small hin heart
  Date: 2020/5/19
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        .content {
            width: 950px;
        }

        #All:hover {
            cursor: pointer;
        }

        .content table input {
            width: 15px;
            height: 15px;
        }
    </style>

</head>
<body>
<h1>客户信息列表</h1>
<div class="content">
    <form:form modelAttribute="customer" action="" id="queryFor">
        <table border="1px" cellpadding="5" cellspacing="0">
            <tr>
                <td width="5%" align="center" id="All" 全选></td>
                <td width="15%" align="center">客户编号</td>
                <td width="15%" align="center">客户名称</td>
                <td width="15%" align="center">客户负责人</td>
                <td width="18%" align="center">客户信息来源</td>
                <td width="18%" align="center">客户所属行业</td>
                <td width="23%" align="center">创建日期</td>
            </tr>
            <c:forEach items="${customer}" var="item">
                <tr align="center">
                    <td>
                        <input type="checkbox" name="selectCustomrtid" value="${item.customerId}"/>
                    </td>
                    <td>
                            ${item.customerId}
                    </td>
                    <td>
                            ${item.customerName}
                    </td>
                    <td>
                            ${item.customerUserId}
                    </td>
                    <td>
                            ${item.customerSourse}
                    </td>
                    <td>
                            ${item.customerIndustry}
                    </td>
                    <td>
                            ${item.customerDate}
                    </td>
                </tr>
            </c:forEach>
        </table>
    </form:form>
</div>

</body>
</html>
