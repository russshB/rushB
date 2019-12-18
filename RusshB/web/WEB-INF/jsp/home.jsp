<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<base href="${pageContext.request.contextPath}/">
<head>
    <meta charset="UTF-8">
    <title>Home</title>
    <link rel="stylesheet" href="resources/layui/css/layui.css" media="all">
    <link rel="stylesheet" href="resources/css/ulcss.css">
    <style>
        body{
            background-image: url("${pageContext.request.contextPath}/resources/images/91.jpeg");
            background-repeat: no-repeat;
            background-size: 100%;
            background-position: center;
        }
    </style>
</head>
<body>
<div class="layui-container">
    <div class="layui-row">
        <ul class="layui-nav">
            <li class="layui-nav-item layui-this"><a href=""><i class="layui-icon" style="font-size: 20px;">&#xe609;</i>首页</a>
            </li>
            <li class="layui-nav-item"><a href="">分类区</a></li>
            <li class="layui-nav-item"><a href="">发布区</a></li>
            <li class="layui-nav-item layui-layout-right"><a href="user/topersonhome"><img src="resources/images/${users.getUimg()}.jpeg"
                                                                          style="width: 50px;height: 50px;"
                                                                          class="layui-circle"></a></li>
        </ul>
    </div>
    <div class="layui-row">
        <div class="layui-col-md10 layui-col-md-offset1">
            <div id="ullist">
                <!--列表内容-->
                <c:forEach var="post" items="${posts}">
                    <div class="layui-row bet">
                    <div class="plist layui-col-md10">
                        <a href="post/topostPage?pid=${post.getPid()}">
                            <!--帖子的标题或简略-->
                            <p>${post.getPdetails()}</p>
                        </a>
                    </div>
                    <div class="layui-col-md1">
                        <!--用户名-->
                        <p>${post.getUser().getUname()}</p>
                    </div>
                    <div class="puser layui-col-md1">
                        <!--头像-->
                        <a href="user/topersonhome2?uid=${users.getUid()}">
                            <img src="resources/images/${users.getUimg()}.jpeg">
                        </a>
                    </div>
                </div>
                </c:forEach>
        </div>
    </div>
</div>
<script src="resources/layui/layui.js" charset="utf-8"></script>
<script src="resources/jquery-3.4.1/jquery-3.4.1.min.js" charset="utf-8"></script>
<script src="resources/mousewords.js"></script>
<script>
    layui.use(['carousel', 'element'], function () {
        var carousel = layui.carousel,
            element = layui.element;
        carousel.render({
            elem: '#test1',
            width: '100%',
            arrow: 'always',
            anim: 'default'
        });
        
        
    });
</script>
</body>
</html>