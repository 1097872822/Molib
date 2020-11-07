<#assign base=request.contextPath />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>书籍信息管理</title>
<link rel="stylesheet" href="/layui/css/layui.css" media="all">
<script src="${request.contextPath}/layui/layui.js"></script>
</head>
<body class="layui-layout-body">

  <div class="container-fluid">
		
		<form class="layui-form layui-form-pane"
			action="${request.contextPath}/books/index" method="post"
			style="padding-top: 10px; width: 400px; border: 5px;float: right">

			<div class="layui-form-item">
				<div class="layui-input-block" style="width: 500px; margin: 0 auto;">
					<input type="text" name="name" required="" lay-verify="required"
						placeholder="请输入书籍名称" autocomplete="off" class="layui-input"
						 style="width: 300px; float: left;">

					<button type="submit"
							class="layui-btn layui-btn-radius layui-btn"
						style="float: right; margin-right: 100px;">
						<i class="layui-icon layui-icon-search"></i>
					</button>

				</div>
			</div>

		</form>
		</div>
	
	<div style="padding-top: 10px;padding-bottom: 10px;width:150px">
		<a href="${request.contextPath}/books/toedit" class="layui-btn layui-btn-radius layui-btn-warm" role="button">添加</a>
	</div>
        
	
	<table class="layui-table" id="NavTable" lay-filter="NavTable">
		<!-- 表头 -->

		<thead>
			<tr>
				<th lay-data="{field:'id',checkbox:true,fixed:'left',align:'center'}"></th>
				<th lay-data="{field:'id',width:'100',fixed:'left',align:'center',sort:'true'}">书籍ID</th>
				<th lay-data="{field:'bookName',width:'100',align:'center'}">书名</th>
				<th lay-data="{field:'bookAuthor',width:'100',align:'center'}">作者</th>
				<th lay-data="{field:'bookPress',width:'100',align:'center'}">出版社</th>
				<th lay-data="{field:'bookImg',width:'150',align:'center'}">书籍图片</th>
				<th lay-data="{field:'caName',width:'100',align:'center'}">类型</th>
				<th lay-data="{field:'bookNumber',width:'50',align:'center'}">数量</th>
				<th lay-data="{field:'borrowNumber',width:'100',align:'center'}">借阅数量</th>
				<th lay-data="{field:'addTime',width:'100',align:'center'}">添加时间</th>
				<th lay-data="{field:'bookBrief',width:'150',align:'center'}">书籍简介</th>
				<th lay-data="{field:'bookIntroduce',width:'200',align:'center'}">内容简介</th>
				<th lay-data="{field:'tool',width:'200',fixed:'right',align:'center'}">操作</th>
			</tr>
		<tbody>
			<#list books as book>
			<tr>
				<td lay-data="{checkbox:true,fixed:'left',align:'center'}"></td>
				<td>${book.bookId}</td>
				<td>${book.bookName}</td>
				<td>${book.bookAuthor}</td>
				<td>${book.bookPress}</td>
				<td>${book.bookImg}</td>
				<td>${book.caName}</td>
				<td>${book.bookNumber}</td>
				<td>${book.borrowNumber}</td>
				<td>${(book.addTime?string("yyyy-MM-dd"))!} </td>
				<td>${book.bookBrief}</td>
				<td>${book.bookIntroduce}</td>
				<td><a
					href="${request.contextPath}/books/toedit?id=${book.bookId}"
					class="layui-btn layui-btn-sm layui-btn-normal" role="button"><i
						class="layui-icon"></i></a> <a href="${request.contextPath}/books/delete?id=${book.bookId}" 
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