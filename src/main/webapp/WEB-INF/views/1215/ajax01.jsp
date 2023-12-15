<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<h1>/1215/ajax.jsp</h1>

<script>
	//(document).ready() 생략가능 -jquery
//	$(function(){
	//	.on 생략해서 사용할때
	// 	$("#btn").click(function(){
			
	//	}); 
//	});
	$(document).ready(
	function(){
		$("#btn").on("click",function(){
			$("img").attr("src","/resources/img/a1.jpg");
			var na= $("#name").val();
			var ph= $("#phone").val();
			if(na==""){
				$("#nameMsg").html("<h1>이름좀 알려줘~</h1>").css("color","red");
			}
			if(ph==""){
				$("#phMsg").text("전화번호도 알려줘~").css("color","red");
			}
			
			alert(na);
			$("#name").val("");
		//	$("#nameMsg").text(na);
			$("#phone").val("");
			//$("#phMsg").text("ㅣㅃ뽀삐뽀");
		})
		$("#btn1").on("click",function(){
			$("img").attr("src","/resources/img/a1.jpg");
		})
		$("#btn2").on("click",function(){
			$("img").attr("src","/resources/img/a2.jpg");
		})
		$("#btn3").on("click",function(){
			$("img").attr("src","/resources/img/a3.jpg");
		})
		$("#btn4").on("click",function(){
			$("img").attr("src","/resources/img/a4.jpg");
		})
		$("select").on("change",function(){
			alert($(this).value);
		})
	});
</script>

<button id="btn1">Button 버튼</button>
<button id="btn2">Button 버튼</button>
<button id="btn3" class="bs">Button 버튼</button>
<button id="btn4" class="bs">Button 버튼</button>
<br />

<img src="/resources/img/a1.jpg" width="500">
<br />

이름이뭐에요? : <input type="text" name="name" id="name"/> 
			<p id="nameMsg"></p>
<br />
전화번호뭐에요? : <input type="text" name="phone" id="phone"/>
			<p id="phMsg"></p>
<br />
<select>
	<option>SKT T1</option>
	<option>KT and G</option>
	<option>LG Twins</option>
</select>
<button id="btn">Roger That</button>