<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
 <script>
 var posi;
 	$(function(){
 		$("button").click(function(){
 		$.ajax({
 			url:"/js/test07",
 			success : function(e){
				posi=e;
				console.log(posi);
 			}
 			});
 		});
 	});
 </script>
 <input type="text" name="id" id="id" />
 <button>호출</button>
 <div></div>