<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<base href="${pageContext.request.contextPath}/">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="resources/layui/css/layui.css">
    <link rel="stylesheet" href="resources/css/blog.css">
    
</head>
<body>
    <div class="layui-container">
        <div class="layui-row">
            <ul class="layui-nav">
                <li class="layui-nav-item"><a href=""><i class="layui-icon" style="font-size: 20px;">&#xe609;</i>首页</a>
                </li>
                <li class="layui-nav-item"><a href="">分类区</a></li>
                <li class="layui-nav-item"><a href="">发布区</a></li>
                <li class="layui-nav-item layui-layout-right"><a href=""><img src="resources/images/57.jpeg"
                                                                              style="width: 50px;height: 50px;"
                                                                              class="layui-circle"></a></li>
            </ul>
        </div>
        <div class="layui-row">
            <article class="article-list">
                <section class="article-item">
                    <aside class="title" style="line-height:1.5;">
                        <!--标题-->
                        <h2>${post.getPtitle()}</h2>
                        <p class="fc-grey fs-14">
                            <small class="layui-bg-gray">围观群众：<i class="readcount">${post.getPreadnum()}</i></small>
                            <small class="layui-bg-gray">更新于 <label>2018-05-22:17:30:24</label></small>
                        </p>
                    </aside>
                    <div class="detail-about">
                        <a class="fly-avatar" href="../user/home.html">
                            <img src="resources/images/57.jpeg"
                                 alt="九万七">
                        </a>
                        <div class="fly-detail-user">
                            <a href="../user/home.html" class="fly-link">
                                <cite>${post.getUser().getUname()}</cite>
                                <i class="" title="认证信息：{{ rows.user.approve }}"></i>
                                <i class="layui-badge fly-badge-vip">VIP${post.getUser().getUpower()}</i>
                            </a>
                        </div>

                        <div class="detail-hits" id="LAY_jieAdmin" data-id="123">
                            <span class="layui-btn layui-btn-sm layui-btn-primary"><a
                                    href="add.html">个人主页</a></span>
                            <span class="layui-btn layui-btn-sm layui-btn-primary"><a
                                    href="edit.html">编辑此贴</a></span>
                        </div>
                    </div>
                    <div class="time mt10" style="padding-bottom:0;">
                        <span class="day">22</span>
                        <span class="month fs-18">5<small class="fs-14">月</small></span>
                        <span class="year fs-18">2018</span>
                    </div>
                    <div class="content artiledetail"
                         style="border-bottom: 1px solid #e1e2e0; padding-bottom: 20px;">
                        <div class="copyright mt20">
                            <p>${post.getPdetails()}</p>
                        </div>
                    </div>
                    <c:forEach var="r" items="${replys}">
                        <div class="fly-detail-user">
                            <a href="../user/home.html" class="fly-link">
                                <cite>${r.getUser().getUname()}</cite>
                                <i class="" title="认证信息：{{ rows.user.approve }}"></i>
                                <i class="layui-badge fly-badge-vip">VIP${r.getUser().getUpower()}</i>
                            </a>
                        </div>
                        <div class="content artiledetail"
                             style="border-bottom: 1px solid #e1e2e0; padding-bottom: 20px;">
                            <div class="copyright mt20">
                                <p>${r.getRcontent()}</p>
                            </div>
                        </div>
                    </c:forEach>
                    <div class="mt20 f-fwn fs-24 fc-grey comment"
                         style="border-top: 1px solid #e1e2e0; padding-top: 20px;">
                    </div>
                    <%!
                        String getDate(){
                            Date date = new Date();
                            SimpleDateFormat day = new SimpleDateFormat("y年MM月dd日 hh:mm:ss");
                            return day.format(date);
                        }
                    %>
                    <fieldset class="layui-elem-field layui-field-title">
                        <legend>发表评论</legend>
                        <div class="layui-field-box">
                            <div class="leavemessage" style="text-align:initial">
                                <form class="layui-form blog-editor" action="reply/addReply" method="get">
                                    <input type="hidden" name="post" id="articleid" value="${post}">
                                    <input type="hidden" name="ruser" id="articleid" value="${users}">
                                    <!--<input type="hidden" name="rtime" id="articleid" value="">-->
                                    <div class="layui-form-item">
                                        <textarea name="rcontent" placeholder="请输入内容"
                                                  class="layui-textarea"></textarea>
                                    </div>
                                    <div class="layui-form-item">
                                        <button class="layui-btn" type="submit" lay-submit="formLeaveMessage"
                                                lay-filter="formLeaveMessage">提交留言
                                        </button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </fieldset>
                    <ul class="blog-comment" id="blog-comment">

                    </ul>
                </section>
            </article>
        </div>
    </div>
</div>
<script src="resources/layui/layui.js"></script>
<script>
layui.use()
</script>
</body>
</html>