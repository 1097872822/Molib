<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>书籍借阅管理</title>
<link rel="stylesheet" href="/layui/css/layui.css" media="all">
<script src="${request.contextPath}/layui/layui.js"></script>
</head>
<body class="layui-layout-body">

  <div class="container-fluid">
		
		<form class="layui-form layui-form-pane"
			action="${request.contextPath}/borrow/index" method="post"
			style="padding-top: 10px; width: 400px; border: 5px;float: right">

			<div class="layui-form-item">
				<!--
				<div class="layui-input-block" style="width: 500px; margin: 0 auto;">
					<input type="text" name="name" required="" lay-verify="required"
						placeholder="请输入学号" autocomplete="off" class="layui-input"
						 style="width: 300px; float: left;">

					<button type="submit"
							class="layui-btn layui-btn-radius layui-btn"
						style="float: right; margin-right: 100px;">
						<i class="layui-icon layui-icon-search"></i>
					</button>

				</div>
				  -->
			</div>

		</form>
		</div>
	
	<div style="padding-top: 10px;padding-bottom: 10px;width:150px">
		<div class="layui-btn " ></div>
	</div>
        
	
	<table class="layui-table" id="NavTable" lay-filter="NavTable">
		<!-- 表头 -->

		<thead>
			<tr>
				<th lay-data="{field:'id',checkbox:true,fixed:'left',align:'center'}"></th>
				<th lay-data="{field:'id',width:'100',fixed:'left',align:'center',sort:'true'}">借阅ID</th>
				<th lay-data="{field:'uNo',width:'100',align:'center'}">学号</th>
				<th lay-data="{field:'uName',width:'100',align:'center'}">姓名</th>
				<th lay-data="{field:'bookName',width:'200',align:'center'}">书名</th>
				<th lay-data="{field:'addTime',width:'150',align:'center'}">借阅时间</th>
				<th lay-data="{field:'stopTime',width:'150',align:'center',sort:'true'}">逾期时间</th>
				<th lay-data="{field:'tool',width:'200',fixed:'right',align:'center'}">操作</th>
			</tr>
		<tbody>
			<#list borrows as borrow>
			<tr>
				<td lay-data="{checkbox:true,fixed:'left',align:'center'}"></td>
				<td>${borrow.borrowId}</td>
				<td>${borrow.uNo}</td>
				<td>${borrow.uName}</td>
				<td>${borrow.bookName}</td>
				<td>${(borrow.addTime?string("yyyy-MM-dd"))!}</td>
				<td>${(borrow.stopTime?string("yyyy-MM-dd"))!} </td>
				<td>
			<!-- 	<a href="${request.contextPath}/borrow/toedit?uNo=${borrow.uNo}"
					class="layui-btn layui-btn-sm " role="button">提醒
					<i class="layui-icon"></i></a> --> 
				<a href="${request.contextPath}/borrow/delete?id=${borrow.borrowId}&uno=${(borrow.uNo?c)!''}&bookname=${borrow.bookName}" 
						class="layui-btn layui-btn-sm layui-btn-danger"
					    role="button" onclick="return confirm('确定归还?')"><i
						class="layui-icon">归还</i></a></td>
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