<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<base href="${pageContext.request.contextPath}/">
<head>
    <title>register</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="resources/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="resources/css/shooting_star.css">
    <style>
        /*body:after {*/
        /*content: '';*/
        /*background-repeat: no-repeat;*/
        /*background-size: cover;*/
        /*-webkit-filter: blur(3px);*/
        /*-moz-filter: blur(3px);*/
        /*-o-filter: blur(3px);*/
        /*-ms-filter: blur(3px);*/
        /*filter: blur(3px);*/
        /*position: absolute;*/
        /*top: 0;*/
        /*left: 0;*/
        /*right: 0;*/
        /*bottom: 0;*/
        /*z-index: -1;*/
        /*}*/

        .layui-container {
            width: 100%;
            height: 100%;
        }

        .admin-login-background {
            width: 400px;
            height: auto;
            position: absolute;
            left: 72%;
            top: 8%;
            margin-left: -180px;
            margin-top: 0px;
            z-index: 3;
            opacity: 0.5;
        }

        .logo-title {
            text-align: center;
            letter-spacing: 2px;
            padding: 8px 0;
        }

        .logo-title h1 {
            color: #009688;
            font-size: 25px;
            font-weight: bold;
        }

        .login-form {
            background-color: #fff;
            border: 1px solid #fff;
            border-radius: 6px;
            padding: 0px 20px;
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
            border: 1px solid #e6e6e6;
            height: 36px;
            width: 100%;
        }

        #area-picker input {
            padding-left: 12px;
        }


    </style>
</head>
<body>
<div class="layui-container">
    <form id="form1" class="layui-form login-form admin-login-background" action="user/register" method="post">
        <div class="layui-form-item logo-title">
            <h1>用户注册<i class="layui-icon" style="font-size: 28px;">&#xe609;</i></h1>
        </div>
        <div class="layui-form-item">
            <label class="layui-icon layui-icon-user"></label>
            <input type="text" name="uid" placeholder="账号" lay-verify="required|uid" autocomplete="off"
                   class="layui-input">
        </div>
        <div class="layui-form-item">
            <label class="layui-icon layui-icon-user"></label>
            <input type="text" name="uimg" placeholder="头像" lay-verify="required|uimg" autocomplete="off"
                   class="layui-input">
        </div>
        <div class="layui-form-item">
            <label class="layui-icon layui-icon-user"></label>
            <input type="text" name="uname" placeholder="昵称" lay-verify="required|name" autocomplete="off"
                   class="layui-input">
        </div>
        <div class="layui-form-item">
            <label class="layui-icon layui-icon-password"></label>
            <input type="password" name="upwd" placeholder="密码" lay-verify="required|pass"
                   autocomplete="off" class="layui-input">
        </div>
<!--        <div class="layui-form-item">
            <label class="layui-icon layui-icon-ok-circle"></label>
            <input type="password" name="replypassword" placeholder="请重复密码" lay-verify="required|pass"
                   autocomplete="off" class="layui-input">
        </div>-->
        <div class="layui-form-item ">
            <label class="layui-icon layui-icon-release" for="pid"></label>
            <input type="text" id="pid" name="upid" placeholder="身份证号" lay-verify="required|pid" autocomplete="off"
                   class="layui-input">
        </div>
        <div class="layui-form-item ">
            <label class="layui-icon layui-icon-release" for="email"></label>
            <input type="email" id="email" name="uemail" placeholder="邮箱" lay-verify="required|email" autocomplete="off"
                   class="layui-input">
        </div>
<!--        <div class="layui-form-item">
            <label class="layui-icon layui-icon-cellphone-fine"></label>
            <input type="text" name="uphoneNo" placeholder="手机号" lay-verify="required|phone" autocomplete="off"
                   class="layui-input">
        </div>-->
<!--        <div class="layui-form-item">
            <label class="layui-icon layui-icon-date"></label>
            <input type="text" name="ubirthday" id="birthday" class="layui-input" lay-verify="required"
                   placeholder="生日">
        </div>-->
        <div class="layui-form-item">
            <label class="layui-icon">性别</label>
            <div class="layui-input-block">
                <input type="radio" name="ugender" value="男" title="男" checked>
                <input type="radio" name="ugender" value="女" title="女">
            </div>
        </div>
        <div class="layui-form-item">
            <button class="layui-btn layui-btn-fluid" lay-submit="" lay-filter="login">注 册</button>
        </div>
    </form>
    <div class="night">
        <div class="shooting_star"></div>
        <div class="shooting_star"></div>
        <div class="shooting_star"></div>
        <div class="shooting_star"></div>
        <div class="shooting_star"></div>
        <div class="shooting_star"></div>
        <div class="shooting_star"></div>
        <div class="shooting_star"></div>
        <div class="shooting_star"></div>
        <div class="shooting_star"></div>
        <div class="shooting_star"></div>
        <div class="shooting_star"></div>
        <div class="shooting_star"></div>
        <div class="shooting_star"></div>
        <div class="shooting_star"></div>
        <div class="shooting_star"></div>
        <div class="shooting_star"></div>
        <div class="shooting_star"></div>
        <div class="shooting_star"></div>
        <div class="shooting_star"></div>
        <div class="shooting_star"></div>
        <div class="shooting_star"></div>
    </div>
</div>
<script src="resources/layui/layui.js" charset="utf-8"></script>
<script src="resources/jquery-3.4.1/jquery-3.4.1.min.js" charset="utf-8"></script>
<script src="resources/lay/lay-config.js"></script>
<script src="resources/mousewords.js"></script>
<script>
    layui.use(['form', 'layarea', 'layer', 'laydate'], function () {
        var form = layui.form,
            layer = layui.layer,
            layarea = layui.layarea,
            laydate = layui.laydate,
            $ = layui.jquery;

      // 登录过期的时候，跳出ifram框架
        if (top.location != self.location) top.location = self.location;

        layarea.render({
            elem: '#area-picker',
            change: function (res) {
                //选择结果
                console.log(res);
            }
        });
        laydate.render({
            elem: '#birthday',//指定元素
            theme: 'grid',
            showBottom: false
        });
        // 进行登录操作
        var s = $("p").val();
        var s = document.getElementById("password");
        form.on('submit(login)', function (data) {
            data = data.field;
            if (data.Upwd != data.replypassword) {
                layer.msg('密码前后不一致');
                return false;
            }
            layer.open({
                content: '酷毙了',
                yes: function (index, layero) {
                    window.location = 'login.html';
                },
                icon: 1,
                area: ['500px', '300px']
            });
            $.ajax({
                url: 'user/register',
                method: 'post',
                data: $("#form1").serialize(),
                success: function (res) {
                    if (res.code = '0') {
                        layer.msg('注册成功', function () {
                            window.location = '${pageContext.request.contextPath}/index';
                        });
                    } else
                        alert(res.msg);
                },
                error: function (data) {
                        layer.msg('Ajax请求失败!')
                }
            });
            return false;
        });

    });

</script>
</body>
</html>