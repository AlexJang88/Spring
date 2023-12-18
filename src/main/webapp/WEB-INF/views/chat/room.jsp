<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="/resources/js/jquery-1.10.2.min.js"></script>
<script src="/resources/js/socket.io.js"></script>
<script>
	$(function() {
		var socket = io.connect("http://192.168.219.151:9999"); //채팅 서버 연결
		//채팅 내용 받는다.
		socket.on("response",function(message){
			$("#msgs").append(message.msg+"<br />");
		});
		//채팅 내용 보낸다.
		$("#sendBtn").on("click",function(){
			var m = $("#chat").val();
			socket.emit("chatMsg",{msg : '${sessionScope.memId}'+'-'+m},{id:'${sessionScope.memId}'});
		});
	});	
</script>
<h1>This Page is for the chat on live..!!</h1>
<input type="text" name="chat" id="chat" />
<input type="button" value="send" id="sendBtn" />
<hr color="red" />
<div id="msgs">
===chat start=== <br />
<c:forEach var="s" items="${list}">
	${s}<br/>
</c:forEach>
</div>


