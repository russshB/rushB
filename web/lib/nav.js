var isAnimated = false;
$(document).ready(function(){
    $(window).on("scroll",function () {
        if ($(this).scrollTop()>180) {

            if (!isAnimated) {
                isAnimated = true;
            }
        }else {
            isAnimated = false;



        }
    })
})