<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<base href="${pageContext.request.contextPath}/">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="resources/layui/css/layui.css">
    <link rel="stylesheet" href="resources/css/person.css">
    <link rel="stylesheet" href="resources/css/ulcss.css">
</head>
<body>
    <div class="layui-container">
        <div class="layui-row">
            <ul class="layui-nav">
                <li class="layui-nav-item"><a href=""><i class="layui-icon" style="font-size: 20px;">&#xe609;</i>首页</a>
                </li>
                <li class="layui-nav-item"><a href="">分类区</a></li>
                <li class="layui-nav-item"><a href="post/newpost">发布区</a></li>
                <li class="layui-nav-item layui-layout-right layui-this"><a href=""><img src="resources/images/${users.getUimg()}.jpeg"
                                                                                         style="width: 50px;height: 50px;"
                                                                                         class="layui-circle"></a></li>
            </ul>
        </div>
        <div id="userInf">
            <div class="layui-row layui-col-md4 layui-col-md-offset5">
                <img src="resources/images/${users.getUimg()}.jpeg" style="width: 180px;height: 180px;" class="layui-circle">
            </div>
            <div class="layui-row">
                <div class="layui-col-md1 layui-col-md-offset5">
                    <p><i class="layui-icon" style="font-size: 18px; color: #6666ff">&#xe662;</i>${users.getUname()}</p>
                </div>
                <div class="layui-col-md2">
                    <p><i class="layui-icon" style="font-size: 18px;color: #00b7ee;">&#xe715;</i>山东青岛</p>
                </div>
            </div>
            <div class="layui-row">
                <div class="layui-col-md4 layui-col-md-offset6">
                    <p>${users.getUid()}</p>
                </div>
            </div>
            <div class="layui-row">
                <div class="layui-col-md4 layui-col-md-offset6">
                    <p>${users.getUemail()}</p>
                </div>
            </div>
            <!--喜欢的帖子列-->
            <div class="layui-row layui-col-md5 layui-col-md-offset1">
                <p>自己发布的帖子</p>
                <hr class="layui-bg-blue">
                <c:forEach var="post" items="${SelfPost}">

                    <div class="layui-row">
                        <div class="plist layui-col-md9">
                            <p>${post.getPabstr()}</p>
                        </div>
                        <div class="plist layui-col-md2">
                            <p>${post.getUser().getUname()}</p>
                        </div>
                        <div class="layui-col-md1 puser">
                            <img src="resources/images/${post.getUser().getUimg()}.jpeg">
                        </div>
                    </div>

                </c:forEach>  
            </div>

            <div class="layui-row layui-col-md4 layui-col-md-offset1">
                <p>信息</p>
                    <hr class="layui-bg-cyan">
                <c:forEach var="m" items="${message}">
                    <div class="layui-col-md2">
                        <p>${m.getMuser()}</p>
                        <div class="layui-col-md4">
                            <p><i class="layui-icon" style="color:#1E9FFF;">&#xe678;</i>17852423220</p>
                        </div>
                        <div class="layui-col-md1 layui-col-md-offset5">
                            <a><i class="layui-icon" style="color: #009688;font-size: 20px;">&#xe63a;</i></a>
                        </div>
                    </div>
                </c:forEach>
            </div>
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