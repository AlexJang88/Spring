<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
 <script>
 var inter ;
 function time(){
	 $.ajax({
			url:'/js/time',
			success :  function(a){
				$("#result").html(a);
			}
		});
 }
 	$(function(){
 		$("#start").click(function(){
 			inter = setInterval(time , 1000);
 		});
 		$("#stop").click(function(){
			clearInterval(inter);
 		});
 	});
 </script>
 <button id="start">씨짞</button>
 <a id="stop"><img src="/resources/img/22.png"></a>
 <div id="result"></div>