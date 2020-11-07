<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户信息管理</title>
<link rel="stylesheet" href="/layui/css/layui.css" media="all">
<script src="${request.contextPath}/layui/layui.js"></script>
</head>
<body class="layui-layout-body">

	
	<div style="padding-top: 10px;padding-bottom: 10px;width:150px">
		<a href="${request.contextPath}/user/toedit" class="layui-btn layui-btn-radius layui-btn-warm" role="button">添加</a>
	</div>
        
	
	<table class="layui-table" id="NavTable" lay-filter="NavTable">
		<!-- 表头 -->

		<thead>
			<tr>
				<th lay-data="{field:'id',checkbox:true,fixed:'left',align:'center'}"></th>
				<th lay-data="{field:'id',width:'100',fixed:'left',align:'center',sort:'true'}">用户ID</th>
				<th lay-data="{field:'uno',width:'100',align:'center'}">学号</th>
				<th lay-data="{field:'uname',width:'200',align:'center'}">姓名</th>
				<th lay-data="{field:'upwd',width:'150',align:'center'}">密码</th>
				<th lay-data="{field:'uqq',width:'200',align:'center'}">QQ邮箱</th>
				<th lay-data="{field:'tool',width:'200',fixed:'right',align:'center'}">操作</th>
			</tr>
		<tbody>
			<#list clientusers as cuser>
			<tr>
				<td lay-data="{checkbox:true,fixed:'left',align:'center'}"></td>
				<td>${cuser.uId}</td>
				<td>${cuser.uNo}</td>
				<td>${cuser.uName}</td>
				<td>${cuser.uPwd}</td>
				<td>${cuser.uQq}</td>
				
				<td>
				<a href="${request.contextPath}/user/toedit?id=${cuser.uId}"
					class="layui-btn layui-btn-sm layui-btn-normal" role="button"><i
						class="layui-icon"></i></a> 
				<a href="/user/delete?id=${cuser.uId}" 
					class="layui-btn layui-btn-sm layui-btn-danger"
					role="button" onclick="return confirm('真的要删除吗???')"><i
						class="layui-icon"></i></a>
				</td>
			</tr>
			</#list>
		</tbody>
		</thead>
	</table>
	

	<script src="${base}/layui/layui.all.js"></script>
	<script>
		layui.use([ 'laypage', 'table' ], function() {
			var table = layui.table, form = layui.form;
			table.init('NavTable', {
				height : 680,
				toolbar : '#toolbar',
				page : true,
				limit : 20,
				limits:[20,50,100]
				
			});

		})
	</script>
</body>
</html>