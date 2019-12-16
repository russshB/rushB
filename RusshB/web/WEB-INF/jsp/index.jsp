<!DOCTYPE html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<base href="${pageContext.request.contextPath}/">
<html>
<head>
    <title>后台管理-登陆</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="resources/layui/css/layui.css" media="all">
    <style>
        html, body {
            width: 100%;
            height: 100%;
            overflow: hidden
        }

        body {
            background: #009688;
        }

        body:after {
            content: '';
            background-repeat: no-repeat;
            background-size: cover;
            -webkit-filter: blur(3px);
            -moz-filter: blur(3px);
            -o-filter: blur(3px);
            -ms-filter: blur(3px);
            filter: blur(3px);
            position: absolute;
            top: 0;
            left: 0;
            right: 0;
            bottom: 0;
            z-index: -1;
        }

        .layui-container {
            width: 100%;
            height: 100%;
            overflow: hidden
        }

        .admin-login-background {
            width: 360px;
            height: 300px;
            position: absolute;
            left: 50%;
            top: 40%;
            margin-left: -180px;
            margin-top: -100px;
        }

        .logo-title {
            text-align: center;
            letter-spacing: 2px;
            padding: 14px 0;
        }

        .logo-title h1 {
            color: #009688;
            font-size: 25px;
            font-weight: bold;
        }

        .login-form {
            background-color: #fff;
            border: 1px solid #fff;
            border-radius: 3px;
            padding: 14px 20px;
            box-shadow: 0 0 8px #eeeeee;
        }

        .login-form .layui-form-item {
            position: relative;
        }

        .login-form .layui-form-item label {
            position: absolute;
            left: 1px;
            top: 1px;
            width: 38px;
            line-height: 36px;
            text-align: center;
            color: #d2d2d2;
        }

        .login-form .layui-form-item input {
            padding-left: 36px;
        }

        .captcha {
            width: 60%;
            display: inline-block;
        }

        .captcha-img {
            display: inline-block;
            width: 34%;
            float: right;
        }

        .captcha-img img {
            height: 34px;
            border: 1px solid #e6e6e6;
            height: 36px;
            width: 100%;
        }
    </style>
</head>
<body>
<div class="layui-container">
    <div class="admin-login-background">
        <div class="layui-form login-form">
            <form class="layui-form" action="do" method="post">
                <div class="layui-form-item logo-title">
                    <h1>用户登录<i class="layui-icon" style="font-size: 28px;">&#xe609;</i></h1>
                </div>
                <div class="layui-form-item">
                    <label class="layui-icon layui-icon-username" for="userid"></label>
                    <input type="text" id="userid" name="userid" placeholder="用户ID"
                           autocomplete="off"
                           class="layui-input">
                </div>
                <div class="layui-form-item">
                    <label class="layui-icon layui-icon-password" for="password"></label>
                    <input type="password" id="password" name="password" placeholder="密码"
                           autocomplete="off" class="layui-input">
                </div>
                <div class="layui-form-item layui-row">
                    <div class=" layui-col-xs8 layui-col-sm8 layui-col-md8">
                        <input type="checkbox" name="rememberMe" value="true" title="记住密码">
                    </div>
                    <div class="layui-col-xs4 layui-col-sm4 layui-col-md4 ">
                        <button class="layui-btn layui-btn-sm layui-btn-primary layui-btn-radius"><a href="#">忘记密码</a></button>
                    </div>
                </div>
                <div class="layui-form-item">
                    <input type="submit" class="layui-btn layui-btn-fluid" value="登入" />
                </div>
            </form>
        </div>
    </div>
</div>
<script src="resources/layui/layui.js" charset="utf-8"></script>
<script src="resources/jquery-3.4.1/jquery-3.4.1.min.js" charset="utf-8"></script>
<script src="resources/jq-module/jquery.particleground.min.js" charset="utf-8"></script>
<script src="resources/mousewords.js"></script>
<script>
    layui.use(['layer', 'form'], function () {
        var form = layui.form,
            layer = layui.layer;

//        // 登录过期的时候，跳出ifram框架
//        if (top.location != self.location) top.location = self.location;

        // 粒子线条背景
        $(document).ready(function () {
            $('.layui-container').particleground({
                dotColor: '#5cbdaa',
                lineColor: '#5cbdaa'
            });
        });

        // 进行登录操作

//        form.on('submit(login)', function (data) {
//            $.ajax({
//                url: './add',
//                method: 'post',
//                data: data.field,
//                dataType: 'JSON',
//                success: function (res) {
//                    if (res.code = '0') {
//                        layer.msg('登录成功', function () {
//                            window.location = '/index.html';
//                        });
//                    } else
//                        alert(res.msg);
//                },
//                error: function (data) {
//                }
//            });
//            return false;
//        });
    });
</script>
</body>
</html>