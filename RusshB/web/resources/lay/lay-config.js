window.rootPath = (function (src) {
    src = document.scripts[document.scripts.length - 1].src;
    return src.substring(0, src.lastIndexOf("/") + 1);

})();

layui.config({
    base: rootPath + "lay-modules/",
    version: true
}).extend({
    layarea: 'layarea/layarea'//地区选择
});