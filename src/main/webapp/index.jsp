<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>

	<script language="javascript">
		function changeVildateCode(obj) {
			var timenow = new Date().getTime();
			obj.src = "image.jsp?d=" + timenow;//为了让服务器认为客户端的每次请求验证码都是全新，所以加入了时间
		}

		function checkUserInfo() {
			if (document.regform.name.value == "") {
				alert("用户名不能为空");
				return false;
			}
			if (document.regform.pwd.value == "") {
				alert("密码不能为空");
				return false;
			}
			if (document.regform.valcode.value == "") {
				alert("验证码不能为空");
				return false;
			}
			return true;
		}
	</script>

	<form action="loginstu.action" method="post">

		用户名:<input type="text" name="name" /> 密码:<input type="password"
			name="pwd"> <input type="submit" value="登录" />
		<table>
			<tr>
				<td>&nbsp;</td>
				<td valign="middle" align="center">验证码:</td>
				<td valign="top"><input type="text" name="valcode" size="10"
					class="input"> <img src="image.jsp"
					onclick="changeVildateCode(this)" title="点击图片刷新验证码" size="10" /></td>
				<td>&nbsp;</td>
			</tr>
		</table>
	</form>

	<a href="reg.jsp">注册</a>

</body>
</html>