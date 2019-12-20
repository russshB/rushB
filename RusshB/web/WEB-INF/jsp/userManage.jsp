<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<base href="${pageContext.request.contextPath}/">
<head>
    <meta charset="UTF-8">
    <title>用户管理页面</title>
    <link rel="stylesheet" href="resources/layui/css/layui.css">
</head>
<body>
<div class="layui-container">
    <div class="layui-row">
        <div class="layui-form" action="">
            <div class="layui-form-item">
                <div class="layui-input-block">
                    <select name="" lay-verify="required">
                        <!--要是觉得这个选项框不好写，就不用了，改成俩页面也行-->
                        <option value=""></option>
                        <option value="1">用户</option>
                        <option value="2">帖子</option>
                    </select>
                    <button class="layui-btn layui-layout-right" lay-submit lay-filter="formDemo">立即提交</button>
                </div>
            </div>
        </div>
    </div>
    <div class="layui-row">
        <fieldset class="layui-elem-field layui-field-title">
            <!--或者帖子表-->
            <legend>用户表</legend>
        </fieldset>
        <table class="layui-table">
            <thead>
            <tr>
                <th>用户id</th>
                <th>用户名</th>
                <th>性别</th>
                <th>用户等级</th>
                <th>手机号</th>
                <th>邮箱</th>
            </tr>
            </thead>
            <c:forEach var="user" items="${Alluser}">
                <tbody>
            <tr>
                <td>${user.getUid()}</td>
                <td>${user.getUname()}</td>
                <td>${user.getUgender()}</td>
                <td>${user.getUpower()}</td>
                <td>${user.getUphoneNo()}</td>
                <td>${user.getUemail()}</td>
            </tr>
            </tbody>
            </c:forEach>
        </table>
    </div>
</div>
<script src="resources/layui/layui.js"></script>
<script>
    layui.use('form', function () {
        var form = layui.form;
    })
</script>
</body>
</html>