var txt = document.getElementById('text');
var btn = document.getElementsByTagName('button')[0];
var pl = document.getElementsByClassName('blog-comment')[0];
var Olen = document.getElementById('len');

txt.onblur = function() {
    txt.style.width = '450px';
    txt.style.heigth = '150px'
}
txt.oninput = function() {
    Olen.innerHTML = txt.value.length;
}
btn.onclick = function() {
    if (txt.value == '') {
        confirm('你确定不出入内容吗')
        return false;
    } else {
        var ul = document.createElement('ul');
        pl.appendChild(ul);
        var li = document.createElement('li');
        ul.appendChild(li);
        li.innerHTML = txt.value;
        txt.value = ''
        var li = document.createElement('li');
        ul.appendChild(li);
        var date = new Date();
        li.innerHTML = date.toLocaleDateString();
        var oa = document.createElement('a');
        li.appendChild(oa);
        oa.innerHTML = '删除';
        oa.style.float = 'right';
        oa.style.href = '#'
    }
    oa.onclick = function() {
        oa.parentNode.parentNode.remove()
        oa.style.cursor = 'pointer'
    }

}