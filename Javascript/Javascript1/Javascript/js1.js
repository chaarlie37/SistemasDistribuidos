$(function () {
        $("#midiv").on("dblclick", function () {
                if($(this).height() == 70){
                    $(this).animate({height:250, width:250}, 200);
                }else{
                    $(this).animate({height:70, width:800}, 200);
                }

            });



});