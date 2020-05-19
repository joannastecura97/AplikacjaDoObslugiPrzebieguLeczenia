/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




$(document).ready(function () {
    $("#flip1").click(function () {
        $("#panel1").slideToggle("slow");
    });
});

$(document).ready(function () {
    $("#flip2").click(function () {
        $("#panel2").slideToggle("slow");
    });
});

$(document).ready(function () {
    $("#flip3").click(function () {
        $("#panel3").slideToggle("slow");
    });
});

$(document).ready(function () {
    $("#flip6").click(function () {
        $("#panel6").slideToggle("slow");
    });
});

$(document).ready(function () {
    $("#flip4").click(function () {
        $("#panel4").slideToggle("slow");
    });
});

$(document).ready(function () {
    $("#flip5").click(function () {
        $("#panel5").slideToggle("slow");
    });
});

$(document).ready(function () {
    $("#flip7").click(function () {
        $("#panel7").slideToggle("slow");
    });
});

$(document).ready(function () {
    $("#flip8").click(function () {
        $("#panel8").slideToggle("slow");
    });
});






 var date=new Date();
 var val=(date.getMonth()+1)+"/"+date.getDate()+"/"+date.getFullYear();

$(document).ready(function () {
    $("#datepicker").datepicker();
    //var date=new Date();
    //var val=(date.getMonth()+1)+"/"+date.getDate()+"/"+date.getFullYear();
    $("#datepicker").val(val);
});


$(document).ready(function () {
    $("#datepicker1").datepicker();
    $("#datepicker1").val(val);
});

$(document).ready(function () {
    $("#datepicker2").datepicker();
    $("#datepicker2").val(val);
});

$(document).ready(function () {
    $("#datepicker3").datepicker();
    $("#datepicker3").val(val);
});

$(document).ready(function () {
    $("#datepicker4").datepicker();
    $("#datepicker4").val(val);
});

$(document).ready(function () {
    $("#datepicker5").datepicker();
    $("#datepicker5").val(val);
});

$(document).ready(function () {
    $("#datepicker6").datepicker();
    $("#datepicker6").val(val);
});

$(document).ready(function () {
    $("#datepicker7").datepicker();
    $("#datepicker7").val(val);
});



$(document).ready(function (){
$("#button").click(function(){
    $("#dg").val($("#datepicker").val()+" "+$("#timepicker").val());
 });

});

$(document).ready(function (){
$("#button2").click(function(){
    $("#d").val($("#datepicker2").val()+" 00:00");
 });

});

$(document).ready(function (){
$("#button3").click(function(){
    $("#dg1").val($("#datepicker1").val()+" "+$("#timepicker1").val());
 });


});

$(document).ready(function (){
$("#button4").click(function(){
    $("#dg3").val($("#datepicker3").val()+" "+$("#timepicker3").val());
 });
  });






