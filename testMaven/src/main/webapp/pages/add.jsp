<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form id="user-form">
		用户名: <input type="text" name="username"/><br/>
		密码: <input type="text" name="password"/><br/>
		状态: <input type="text" name="status"/><br/>
		<button  type="button" onclick="add()">新增</button>
	</form>



<script src="${pageContext.request.contextPath}/js/jquery-1.11.1.min.js"></script>
<script>
	function add(){
		$.ajax({
			url:"${pageContext.request.contextPath}/user/add",
			type:"post",
			dataType:"json",
			data:$("#user-form").serialize(),
			success:function(msg){
			    alert(msg);
				if(msg.flag == "success"){
					alert(msg.msg);
				}else{
					alert(msg.msg);
				}
			}
		})
	}
</script>
</body>
</html>