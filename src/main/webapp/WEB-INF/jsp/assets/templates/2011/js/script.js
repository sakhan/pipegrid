/* Author: SDM */
$(function() {
    
    /* drop down menu */
	$('ul.sf-menu').superfish({ 
         delay        :    300,
         autoArrows   :    false                          
    }); 

	/* tabs */
	$("ul.tabs").tabs(".panes > .panes-individual", {effect: 'slide', direction: 'up'});
    
	/* tablesorter */
	$.tablesorter.defaults.widgets = ['zebra'];
    $(".recent-list").tablesorter({
         headers: { 
            12: { 
                sorter: false
            }, 
            13: { 
                sorter: false 
            } 
        } 
    });
    $(".rfq-list-public").tablesorter({
        headers: { 
            11: { 
                sorter: false 
            }, 
            12: { 
                sorter: false 
            } 
        } 
    });
    $(".rfq-list-public").tablesorterPager({container: $("#rfq-pager")});
	$(".rfq-list-member").tablesorter({
        headers: { 
            14: { 
                sorter: false 
            }, 
            15: { 
                sorter: false 
            } 
        } 
    });
    $(".rfq-list-member").tablesorterPager({container: $("#rfq-pager")});
	$(".rfq-list-post").tablesorter({
        headers: { 
            14: { 
                sorter: false 
            }, 
        } 
    });
    $(".pipe-list").tablesorter({
        headers: { 
            10: { 
                sorter: false 
            }, 
            11: { 
                sorter: false 
            } 
        } 
    });
    $(".pipe-list").tablesorterPager({container: $("#pipe-pager")}); 
    $(".pipe-list-tabs").tablesorter({
        headers: { 
            12: { 
                sorter: false 
            }, 
            13: { 
                sorter: false 
            } 
        } 
    });
    $(".pipe-list-tabs").tablesorterPager({container: $("#pipe-pager")}); 
    $(".pipe-list-lots").tablesorter({
        headers: { 
            12: { 
                sorter: false 
            } 
        } 
    });
    $(".casing-list").tablesorter({
        headers: { 
            9: { 
                sorter: false 
            }, 
            10: { 
                sorter: false 
            } 
        } 
    });
    $(".casing-list").tablesorterPager({container: $("#casing-pager")});
    $(".casing-list-tabs").tablesorter({
        headers: { 
            8: { 
                sorter: false 
            }, 
            9: { 
                sorter: false 
            } 
        } 
    });
    $(".casing-list-tabs").tablesorterPager({container: $("#casing-pager")}); 
    $(".casing-list-lots").tablesorter({
        headers: { 
            8: { 
                sorter: false 
            } 
        } 
    });
    $(".tubing-list").tablesorter({
        headers: { 
            9: { 
                sorter: false 
            }, 
            10: { 
                sorter: false 
            } 
        } 
    });
    $(".tubing-list").tablesorterPager({container: $("#tubing-pager")});
    $(".tubing-list-tabs").tablesorter({
        headers: { 
            8: { 
                sorter: false 
            }, 
            9: { 
                sorter: false 
            } 
        } 
    });
    $(".tubing-list-tabs").tablesorterPager({container: $("#tubing-pager")}); 
    $(".tubing-list-lots").tablesorter({
        headers: { 
            8: { 
                sorter: false 
            } 
        } 
    });
     
    /* table row clickable */
	$('tbody tr[data-href]').addClass('clickable').click( function() { 
        window.location = $(this).attr('data-href'); 
    }).find('a').hover( function() { 
        $(this).parents('tr').unbind('click'); 
    }, function() { 
        $(this).parents('tr').click( function() { 
            window.location = $(this).attr('data-href'); 
        }); 
    }); 
 
	/* hide fields */
	$("#country").change(function(){
 		if ($(this).val() == "United States" ) {
 			$("#hide-companyaddress").slideDown("fast");
 		} else {
 			$("#hide-companyaddress").slideUp("fast"); 
 		}
    });
	$("#companytype").change(function(){
 		if ($(this).val() == "Other" ) {
 			$("#hide-companyother").slideDown("fast");
 		} else {
 			$("#hide-companyother").slideUp("fast");
 		}
	});
	$("#companytype").change(function(){
 		if ($(this).val() == "Pipeline Operator" ) {
 			$(".hide-companyclassifications").slideUp("fast");
			$("#hide-pipelineclassification").slideDown("fast");
 		} else {
 			$(".hide-companyclassifications").slideDown("fast");
			$("#hide-pipelineclassification").slideUp("fast");
 		}
	});

	/* tooltips */
	$(".form-tooltips :input").tooltip({
		position: "top center",
		offset: [-10, 0],
		effect: "fade",
		opacity: 0.8
	});

	/* form date picker */
	$(":date").dateinput({
		format: 'mm/dd/yyyy',	
	    offset: [5,5],            	
		speed:  'fast'             
	});

	/* used for extra spam protection */
	$(".office-fax").hide();
    
    /* overlays/popups */
	$("a.popup-feedback").fancybox({
        'height'         :  343,
        'width'          :  508,
        'transitionIn'   :  'elastic',
		'transitionOut'  :  'elastic'
    });
    $("a.popup-newsletter").fancybox({
        'height'         :  200,
        'width'          :  415,
        'transitionIn'   :  'elastic',
		'transitionOut'  :  'elastic'
    });
	 $("a.popup-advertising").fancybox({
        'height'         :  473,
        'width'          :  520,
        'transitionIn'   :  'elastic',
		'transitionOut'  :  'elastic'
    });
    $("a.popup-size").fancybox({
        'height'         :  238,
        'width'          :  320,
        'transitionIn'   :  'elastic',
		'transitionOut'  :  'elastic'
    });
	$("a.popup-pictures").fancybox({
        'height'         :  500,
        'scrolling'      :  'no',
        'titleShow'      :  false,
        'transitionIn'   :  'elastic',
		'transitionOut'  :  'elastic'
    });
    $("a.popup-seller").fancybox({
        'height'         :  488,
        'width'          :  520,
        'transitionIn'   :  'elastic',
		'transitionOut'  :  'elastic'
    });
    $("a.popup-lots-rfqs").fancybox({
        'height'         :  535,
        'width'          :  520,
        'transitionIn'   :  'elastic',
		'transitionOut'  :  'elastic'
    });
    $("a.popup-videos").fancybox({
        'height'         :  282,
        'width'          :  473,
        'transitionIn'   :  'elastic',
		'transitionOut'  :  'elastic'
    });
    $("a.popup-message").fancybox({
        'height'         :  632,
        'width'          :  520,
        'transitionIn'   :  'elastic',
		'transitionOut'  :  'elastic'
    });

	/* custom print output */
	$(".print-me").click(function() {
        window.print();
        return false;
    });

});