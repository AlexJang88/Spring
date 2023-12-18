<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
 <script>
 	$(function(){
 		$("button").click(function(){
 		$.ajax({
 			url:"/js/idCheck",
 			data : {id:$("#id").val()},
 			method : "get" ,
 			success : function(e){
 				if(e=='fail'){
 					$("div").text(e).css("color","red");
 				}else if(e=='success'){
 					$("div").text(e).css("color","green");
 					}
 				}
 			});
 		});
 	});
 </script>
 <input type="text" name="id" id="id" />
 <button>호출</button>
 <div></div>