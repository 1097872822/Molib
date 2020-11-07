<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>视频管理</title>
<link rel="stylesheet" href="/layui/css/layui.css" media="all">
<script src="${request.contextPath}/layui/layui.js"></script>
</head>
<body class="layui-layout-body">

	
	<div style="padding-top: 10px;padding-bottom: 10px;width:150px">
		<a href="${request.contextPath}/videos/toedit" class="layui-btn layui-btn-radius layui-btn-warm" role="button">添加</a>
	</div>
        
	
	<table class="layui-table" id="NavTable" lay-filter="NavTable">
		<!-- 表头 -->

		<thead>
			<tr>
				<th lay-data="{field:'id',checkbox:true,fixed:'left',align:'center'}"></th>
				<th lay-data="{field:'id',width:'100',fixed:'left',align:'center',sort:'true'}">视频ID</th>
				<th lay-data="{field:'vName',width:'200',align:'center'}">标题</th>
				<th lay-data="{field:'vUrl',width:'200',align:'center'}">视频链接</th>
				<th lay-data="{field:'vImg',width:'200',align:'center'}">图像链接</th>
				<th lay-data="{field:'vConcent',width:'200',align:'center'}">视频简介</th>
				<th lay-data="{field:'tool',width:'200',fixed:'right',align:'center'}">操作</th>
			</tr>
		<tbody>
			<#list videos as v>
			<tr>
				<td lay-data="{checkbox:true,fixed:'left',align:'center'}"></td>
				<td>${v.vId}</td>
				<td>${v.vName}</td>
				<td>${v.vUrl}</td>
				<td>${v.vImg}</td>
				<td>${v.vConcent}</td>
				<td>
				<a href="/videos/toedit?id=${v.vId}"
					class="layui-btn layui-btn-sm layui-btn-normal" role="button"><i
						class="layui-icon"></i></a> 
				<a href="/videos/delete?id=${v.vId}" 
					class="layui-btn layui-btn-sm layui-btn-danger"
					role="button" onclick="return confirm('确定要删除吗?')"><i
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