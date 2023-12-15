<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
<style>
	div{
		width:300px;
		height:300px;
		background:red;
		display : none;
	}
</style>

<script>
	$(function(){
		/* $("button").click(function(){
			$("div").show("slow",function(){
				$(this).css("background","blue");	
			});
			
		}); */
		$("#show").click(function(){
			$("div:not(:animated)").toggle("fast");
		});
		$("#hide").click(function(){
			$("div").hide("slow");
		});
	});
</script>
<button id="show">show</button>
<button id="hide">hide</button>

<div></div>
