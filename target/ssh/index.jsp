<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2016/11/29
  Time: 18:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>保存商品页面</title>
</head>
<body>
<h2>保存商品页面</h2>
<s:form action="product_save" theme="simple" method="post" namespace="/">
    <table width="400px" border="1">
        <tr>
            <td>商品名称</td>
            <td>
                <s:textfield name="pname"></s:textfield>
            </td>
        </tr>
        <tr>
            <td>商品价格</td>
            <td>
                <s:textfield name="price"></s:textfield>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="提交">
            </td>
        </tr>
    </table>
</s:form>
</body>
</html>
