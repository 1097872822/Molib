<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>评论管理</title>
<link rel="stylesheet" href="/layui/css/layui.css" media="all">
<script src="${request.contextPath}/layui/layui.js"></script>
</head>
<body class="layui-layout-body">

	<div style="padding-top: 10px;padding-bottom: 10px;width:150px">
		<a href="${request.contextPath}/swiperdata/toedit" class="layui-btn layui-btn-radius layui-btn-warm" role="button">添加</a>
	</div>
        
	
	<table class="layui-table" id="NavTable" lay-filter="NavTable">
		<!-- 表头 -->

		<thead>
			<tr>
				<th lay-data="{field:'id',checkbox:true,fixed:'left',align:'center'}"></th>
				<th lay-data="{field:'id',width:'105',fixed:'left',align:'center',sort:'true'}">评论ID</th>
				<th lay-data="{field:'uNo',width:'100',align:'center'}">学号</th>
				<th lay-data="{field:'uName',width:'150',align:'center'}">姓名</th>
				<th lay-data="{field:'bookId',width:'100',align:'center'}">书籍ID</th>
				<th lay-data="{field:'cConcent',width:'200',align:'center'}">内容</th>
				<th lay-data="{field:'cTime',width:'200',align:'center'}">时间</th>
				<th lay-data="{field:'cState',width:'200',align:'center'}">状态</th>
				<th lay-data="{field:'tool',width:'200',fixed:'right',align:'center'}">操作</th>
			</tr>
		<tbody>
			<#list comments as c>
			<tr>
				<td lay-data="{checkbox:true,fixed:'left',align:'center'}"></td>
				<td>${c.commentId}</td>
				<td>${c.uNo}</td>
				<td>${c.uName}</td>
				<td>${c.bookId}</td>
				<td>${c.cConcent}</td>
				<td>${(c.cTime?string("yyyy-MM-dd"))!}</td>
				<td>${c.cState}</td>
				<td><a
					href="${request.contextPath}/swiperdata/toedit?id=${datas.swId}"
					class="layui-btn layui-btn-sm layui-btn-normal" role="button"><i
						class="layui-icon"></i></a> <a href="${request.contextPath}/swiperdata/delete?id=${datas.swId}" 
						class="layui-btn layui-btn-sm layui-btn-danger"
					    role="button" onclick="return confirm('真的要删除吗???')"><i
						class="layui-icon"></i></a></td>
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