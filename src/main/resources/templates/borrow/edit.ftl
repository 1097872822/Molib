<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>借阅数据编辑</title>
<!-- Tell the browser to be responsive to screen width -->
<meta
	content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"
	name="viewport">
<!-- Bootstrap 3.3.7 -->
<link rel="stylesheet"
	href="/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/layui/css/layui.css">
</head>
<body>

	<div class="container-fluid">
		<form class="form-horizontal" method="post"
			style="padding-top: 20px; width: 600px; border: 5px solid #009688; margin: 0 auto; margin-top: 50px;"
			action="/borrow/edit">


			<input type="hidden" name="borrowId" value="${(borrow.borrowId)!0}">
			<div class="layui-form-item">
				<label class="layui-form-label">用户ID</label>
				<div class="layui-input-block" style="padding-right: 20px;">
					<input type="number" name="borrowId" value="${(borrow.borrowId)!''}" 
					 placeholder="系统自动分配" readonly
						autocomplete="on" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">学号ID</label>
				<div class="layui-input-block" style="padding-right: 20px;">
					<input type="text" name="uId" value="${(borrow.uId)!''}"
						required="" lay-verify="required" placeholder="请输入学号ID"
						autocomplete="off" class="layui-input">
				</div>
			</div>

			<div class="layui-form-item">
				<label class="layui-form-label">学号</label>
				<div class="layui-input-block" style="padding-right: 20px;">
					<input type="text" name="uNo" value="${(borrow.uNo?c)!''}"
						required="" lay-verify="required" placeholder="请输入学号"
						autocomplete="off" class="layui-input">
				</div>
			</div>

			<div class="layui-form-item">
				<label class="layui-form-label">姓名</label>
				<div class="layui-input-block" style="padding-right: 20px;">
					<input type="text" name="uName" value="${(borrow.uName)!''}"
						required="" lay-verify="required" placeholder="请输入姓名"
						autocomplete="off" class="layui-input">
				</div>
			</div>
		<div class="layui-form-item">
				<label class="layui-form-label">书名ID</label>
				<div class="layui-input-block" style="padding-right: 20px;">
					<input type="text" name="bookId" value="${(borrow.bookId)}"
						placeholder=""
						autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">书名</label>
				<div class="layui-input-block" style="padding-right: 20px;">
					<input type="text" name="bookName" value="${(borrow.bookName)}"
						placeholder=""
						autocomplete="off" class="layui-input">
				</div>
			</div>

			<div
				style="padding-top: 10px; padding-bottom: 20px; padding-left: 250px;">
				<button type="submit" class="layui-btn layui-btn-radius">立即提交</button>
			</div>

		</form>
	</div>
</body>
</html>