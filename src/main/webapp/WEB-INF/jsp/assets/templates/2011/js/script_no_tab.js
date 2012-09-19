/* Author: SDM */
$(function() {
    
    /* hide fields */
	$("#condition-pipe").change(function(){
 	    if ($(this).val() == "New" ) {
 		$(".terms-new-notab").slideDown("fast"); 
            } else {
 		$(".terms-new-notab").slideUp("fast");
                $(".terms-grade1-notab").slideUp("fast");
                $(".terms-grade2-notab").slideUp("fast");
                $(".terms-grade3-notab").slideUp("fast");
                $(".terms-grade4-notab").slideUp("fast");
                $(".terms-grade5-notab").slideUp("fast");
                $(".terms-grade6-notab").slideUp("fast");
	    }
            if ($(this).val() == "Used" ) {
 		$(".terms-used-notab").slideDown("fast"); 
            } else {
 		$(".terms-used-notab").slideUp("fast");
                $(".terms-grade1-notab").slideUp("fast");
                $(".terms-grade2-notab").slideUp("fast");
                $(".terms-grade3-notab").slideUp("fast");
                $(".terms-grade4-notab").slideUp("fast");
                $(".terms-grade5-notab").slideUp("fast");
                $(".terms-grade6-notab").slideUp("fast");
	    }
        });
       
        $("#standard-pipe").change(function(){
 	    if ($(this).val() == "API 5L" ) {
 		$(".terms-grade1-notab").slideDown("fast"); 
            } else {
 		$(".terms-grade1-notab").slideUp("fast");
	    }
            if ($(this).val() == "ASTM A53" ) {
 		$(".terms-grade2-notab").slideDown("fast"); 
            } else {
 		$(".terms-grade2-notab").slideUp("fast");
	    }
            if ($(this).val() == "ASTM A106" ) {
 		$(".terms-grade3-notab").slideDown("fast"); 
            } else {
 		$(".terms-grade3-notab").slideUp("fast");
	    }
            if ($(this).val() == "ASTM A252" ) {
 		$(".terms-grade4-notab").slideDown("fast"); 
            } else {
 		$(".terms-grade4-notab").slideUp("fast");
	    }
	    if ($(this).val() == "ASTM A333" ) {
 		$(".terms-grade5-notab").slideDown("fast"); 
            } else {
 		$(".terms-grade5-notab").slideUp("fast");
	    }
            if ($(this).val() == "ASTM 671" ) {
 		$(".terms-grade6-notab").slideDown("fast"); 
            } else {
 		$(".terms-grade6-notab").slideUp("fast");
	    }
		});
        $("#condition-casing").change(function(){
 	    if ($(this).val() == "New" ) {
 		$(".terms-new-notab").slideDown("fast"); 
            } else {
 		$(".terms-new-notab").slideUp("fast");
            }
        });
        $("#condition-tubing").change(function(){
 	    if ($(this).val() == "New" ) {
 		$(".terms-new-notab").slideDown("fast"); 
            } else {
 		$(".terms-new-notab").slideUp("fast");
            }
        });

});