<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
 <script>
 	//setInterval(alarm,10000);
 	function alarm() {
		$.ajax({
			url:'/al/alarm',
			success:function(e){
				$("label").html(e);
			}
		});
	}
 </script>
 <h1>/alarm/main</h1>
 <h2>메세지 확인<label>${count}</label></h2>
 