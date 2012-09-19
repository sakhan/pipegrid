/* Author: SDM */
$(function() {
    
    /* hide fields */
	$("#condition-pipe").change(function(){
 	    if ($(this).val() == "New" ) {
 		$(".terms-new-pipe").slideDown("fast"); 
            } else {
 		$(".terms-new-pipe").slideUp("fast");
                $(".terms-grade1-pipe").slideUp("fast");
                $(".terms-grade2-pipe").slideUp("fast");
                $(".terms-grade3-pipe").slideUp("fast");
                $(".terms-grade4-pipe").slideUp("fast");
                $(".terms-grade5-pipe").slideUp("fast");
                $(".terms-grade6-pipe").slideUp("fast");
	    }
            if ($(this).val() == "Used" ) {
 		$(".terms-used-pipe").slideDown("fast"); 
            } else {
 		$(".terms-used-pipe").slideUp("fast");
                $(".terms-grade1-pipe").slideUp("fast");
                $(".terms-grade2-pipe").slideUp("fast");
                $(".terms-grade3-pipe").slideUp("fast");
                $(".terms-grade4-pipe").slideUp("fast");
                $(".terms-grade5-pipe").slideUp("fast");
                $(".terms-grade6-pipe").slideUp("fast");
	    }
        });
       
        $("#standard-pipe").change(function(){
 	    if ($(this).val() == "API 5L" ) {
 		$(".terms-grade1-pipe").slideDown("fast"); 
            } else {
 		$(".terms-grade1-pipe").slideUp("fast");
	    }
            if ($(this).val() == "ASTM A53" ) {
 		$(".terms-grade2-pipe").slideDown("fast"); 
            } else {
 		$(".terms-grade2-pipe").slideUp("fast");
	    }
            if ($(this).val() == "ASTM A106" ) {
 		$(".terms-grade3-pipe").slideDown("fast"); 
            } else {
 		$(".terms-grade3-pipe").slideUp("fast");
	    }
            if ($(this).val() == "ASTM A252" ) {
 		$(".terms-grade4-pipe").slideDown("fast"); 
            } else {
 		$(".terms-grade4-pipe").slideUp("fast");
	    }
	    if ($(this).val() == "ASTM A333" ) {
 		$(".terms-grade5-pipe").slideDown("fast"); 
            } else {
 		$(".terms-grade5-pipe").slideUp("fast");
	    }
            if ($(this).val() == "ASTM 671" ) {
 		$(".terms-grade6-pipe").slideDown("fast"); 
            } else {
 		$(".terms-grade6-pipe").slideUp("fast");
	    }
		});
        $("#condition-casing").change(function(){
 	    if ($(this).val() == "New" ) {
 		$(".terms-new-casing").slideDown("fast"); 
            } else {
 		$(".terms-new-casing").slideUp("fast");
            }
        });
        $("#condition-tubing").change(function(){
 	    if ($(this).val() == "New" ) {
 		$(".terms-new-tubing").slideDown("fast"); 
            } else {
 		$(".terms-new-tubing").slideUp("fast");
            }
        });

});