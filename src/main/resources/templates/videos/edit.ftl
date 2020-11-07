<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>视频编辑</title>
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
			action="/videos/edit">

			<input type="hidden" name="id" value="${(Videoss.vId)!0}">
			<div class="layui-form-item">
				<label class="layui-form-label">视频ID</label>
				<div class="layui-input-block" style="padding-right: 20px;">
					<input type="number" name="vId" value="${(Videoss.vId)!''}" 
					 placeholder="系统自动分配" readonly
						autocomplete="off" class="layui-input">
				</div>
			</div>

			<div class="layui-form-item">
				<label class="layui-form-label">标题</label>
				<div class="layui-input-block" style="padding-right: 20px;">
					<input type="text" name="vName" value="${(Videoss.vName)!''}"
						required="" lay-verify="required" placeholder="请输入标题"
						autocomplete="off" class="layui-input">
				</div>
			</div>

			<div class="layui-form-item">
				<label class="layui-form-label">视频链接</label>
				<div class="layui-input-block" style="padding-right: 20px;">
					<input type="text" name="vUrl" value="${(Videoss.vUrl)!''}"
						placeholder="请输入视频链接"
						autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">图片链接</label>
				<div class="layui-input-block" style="padding-right: 20px;">
					<input type="text" name="vImg" value="${(Videoss.vImg)!''}"
						placeholder="请输入图片链接"
						autocomplete="off" class="layui-input">
				</div>
			</div>
			<div class="layui-form-item">
				<label class="layui-form-label">简介</label>
				<div class="layui-input-block" style="padding-right: 20px;">
					<input type="text" name="vConcent" value="${(Videoss.vConcent)!''}"
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