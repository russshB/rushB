<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<base href="${pageContext.request.contextPath}/">
<head>
    <title>new_post</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" href="resources/layui/css/layui.css" media="all">
    <script type="text/javascript" src="resources/wangEditor/wangEditor.js"></script>
</head>
<body>
    <div>
        <form action="post/addPost" name="new_post_fprm">
            <div class="layui-row">
                <select class="layui-input-block" name="block" lay-verify="required">
                    <option value="1">请选择一个板块</option>
                    <option value="6">旅游</option>
                    <option value="5">养生</option>
                    <option value="4">数码</option>
                    <option value="3">运动</option>
                    <option value="2">影视</option>
                    <option value="1">动漫</option>
                </select>
                <input type="text" name="title" class="layui-input" placeholder="请输入标题" autocomplete="off" required>
                <input type="text" name="abstr" class="layui-input" placeholder="请输入简介" autocomplete="off" required>
                <input type="hidden" name="user" class="layui-input" autocomplete="off" value="${users.getUid()}">
            </div>
            <div>
                <div id="editor">
                    <p>欢迎使用 <b>wangEditor</b> 富文本编辑器</p>
                </div>
                <div>
                    <input type="hidden" name="content" id="editor_txt"/>
                </div>
                <div>
                    <button class="layui-btn layui-btn-primary" type="submit">发布</button>
                </div>
            </div>
        </form>
    </div>
</body>
<script src="resources/jquery-3.4.1/jquery-3.4.1.min.js" charset="utf-8"></script>
<script>
    var E = window.wangEditor;
    var editor = new E('#editor');
    var $text1 = $('#editor_txt');
    
    // 使用 base64 保存图片
    //editor.customConfig.uploadImgShowBase64 = true

    // 上传图片到服务器
    editor.customConfig.uploadFileName = 'myFile'; //设置文件上传的参数名称
    editor.customConfig.uploadImgServer = 'upload/wang'; //设置上传文件的服务器路径
    editor.customConfig.uploadImgMaxSize = 3 * 1024 * 1024; // 将图片大小限制为 3M
    //自定义上传图片事件
    editor.customConfig.uploadImgHooks = {
        before: function (xhr, editor, files) {

        },
        success: function (xhr, editor, result) {
            console.log("上传成功");
        },
        fail: function (xhr, editor, result) {
            console.log("上传失败,原因是" + result);
        },
        error: function (xhr, editor) {
            console.log("上传出错");
        },
        timeout: function (xhr, editor) {
            console.log("上传超时");
        }
    }


    editor.customConfig.onchange = function (html) {
        // html 即变化之后的内容
        $text1.val(html);
    }
    editor.create();
    $text1.val(editor.txt.html());
</script>
</html>
