<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<style type="text/css">
body {
	font: 14px/150% microsoft yahei, tahoma;
}

.clear {
	clear: both
}

.RadioStyle input {
	display: none
}

.RadioStyle label {
	border: 1px solid #CCC;
	color: #666;
	padding: 2px 10px 2px 5px;
	line-height: 28px;
	min-width: 80px;
	text-align: center;
	float: left;
	margin: 2px;
	border-radius: 4px
}

.RadioStyle input:checked+label {
	background: url(images/ico_checkon.svg) no-repeat right bottom;
	border: 1px solid #00a4ff;
	background-size: 21px 21px;
	color: #00a4ff
}

.RadioStyle input:disabled+label {
	opacity: 0.7;
}
</style>
<title>书籍信息编辑</title>
<!-- Bootstrap 3.3.7 -->
<link rel="stylesheet"
	href="${request.contextPath}/admin/bower_components/bootstrap/dist/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${request.contextPath}/adminup/css/fileinput.min.css">
<link rel="stylesheet"
	href="${request.contextPath}/adminup/css/normalize.min.css">
<link rel="stylesheet"
	href="${request.contextPath}/adminup/css/style.css">
<link rel="stylesheet" href="/layui/css/layui.css">
<script src="/ckeditor/ckeditor.js"></script>
</head>

<body>
	<div class="container-fluid">
		<form class="form-horizontal" style="width: 100%; padding-top: 50px;"
			action="${request.contextPath}/books/edit" method="post">
			<input type="hidden" name="bookId" value="${(book.bookId)!''}">

			<div class="box-body">

				<div class="form-group">
					<label class="col-sm-2 control-label">书籍ID</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" readonly="readonly"
							name="bookId" placeholder="默认自增长" value="${(book.bookId)!''}">
					</div>
				</div>

				<div class="form-group">
					<label class="col-sm-2 control-label">书名</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="bookName"
							placeholder="请输入书名" value="${(book.bookName)!''}">
					</div>
					<label class="col-sm-2 control-label">作者</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="bookAuthor"
							placeholder="请输入作者" value="${(book.bookAuthor)!''}">
					</div>
				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">出版社</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="bookPress"
							placeholder="" value="${book.bookPress!''}">
					</div>
					<label class="col-sm-2 control-label">类型ID</label>
					<div class="col-sm-3">
						<select id ="cateList" onchange="A(this)">
						<#list categoryindex as category>
							<option <#if book.caName == category.caName> selected </#if> value="${category.caId}">${category.caName}</option>
						</#list>
						</select> 
						<input type="hidden" class="form-control" id="caid" name="caId" value="${book.caId}">
						<input type="hidden" class="form-control" id="caname" name="caName" value="${book.caName}">
					</div>

				</div>
				<div class="form-group">
					<label class="col-sm-2 control-label">数量</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="bookNumber"
							placeholder="" value="${book.bookNumber!''}">
					</div>

					<label class="col-sm-2 control-label">借阅数量</label>
					<div class="col-sm-3">
						<input type="text" class="form-control" name="borrowNumber"
							placeholder="" value="${book.borrowNumber!''}">
					</div>

					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">书籍图片</label>
						<div class="col-sm-10">
							<input id="input-id" type="file" class="file file-loading">
						</div>
					</div>

					<div class="form-group">
						<label class="col-sm-2 control-label">图片地址</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="inputBigImg"
								name="bookImg" value="${(book.bookImg)!''}" readonly="readonly">
						</div>
					</div>
				</div>

				<div class="form-group">
					<label class="col-sm-2 control-label">书籍简介</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" name="bookBrief"
							placeholder="" value="${book.bookBrief!''}">
					</div>
				</div>

				<div class="form-group">
					<label class="col-sm-2 control-label">内容简介</label>
					<div class="col-sm-10">
						<textarea class="form-control" id="editor" name="bookIntroduce"
							required="required"> 
							${(book.bookIntroduce)!''}
							</textarea>
					</div>
				</div>

				<div class="form-group">
					<div style="padding-top: 20px; padding-bottom: 20px; float: right;">
						<button type="submit" class="layui-btn layui-btn-radius">立即提交</button>
					</div>
				</div>
			</div>
		</form>
	</div>
	<!-- jQuery 3 -->
	
	
	
	<!-- jQuery 3 -->
	<script
		src="${request.contextPath}/admin/bower_components/jquery/dist/jquery.min.js"></script>
	<!-- piexif  -->
	<script src="${request.contextPath}/adminup/js/plugins/piexif.min.js"></script>

	<!-- purify  -->
	<script src="${request.contextPath}/adminup/js/plugins/purify.min.js"></script>

	<!-- fileinput  -->
	<script src="${request.contextPath}/adminup/js/fileinput.min.js"></script>

	<!-- Bootstrap 3.3.7 -->
	<script
		src="${request.contextPath}/admin/bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

	<!-- fileinput  -->
	<script src="${request.contextPath}/adminup/js/locales/zh.js"></script>
	<script type="text/javascript">
		var obj1 = $("#input-id");
		var option1 = {}
		option1.uploadUrl = "/api/upload/uploadimage";
		option1.uploadAsync = true;
		option1.language = "zh";
		option1.showCaption = true;
		option1.showUpload = true;
		option1.showRemove = true;
		option1.showPreview = true;
		option1.resizeImage = true;
		option1.maxFileSize = 10000;
		option1.autoReplace = true;
		option1.resizePreference = 'width';
		option1.browseClass = "btn btn-primary";
		option1.uploadLabel = "上传";
		option1.enctype = "multipart/form-data";
		option1.dropZoneEnabled = false;
		option1.allowedFileExtensions = [ "png", "jpg", "gif" ];
		option1.maxFileCount = 5;

		//with plugin options

		obj1.fileinput(option1/* {
							uploadUrl : "/file/uploadimageone",//上传的地址
							uploadAsync : true, //异步上传
							language : "zh", //设置语言
							showCaption : true, //是否显示标题
							showUpload : false, //是否显示上传按钮
							showRemove : true, //是否显示移除按钮
							showPreview : true, //是否显示预览按钮
							resizeImage : true, //调整图片的宽度
							maxImageWidth : 200,
							maxImageHeight : 200,
							resizePreference : 'width',
							browseClass : "btn btn-primary", //按钮样式
							uploadLabel : "上传", //设置上传按钮的汉字
							enctype : 'multipart/form-data',
							dropZoneEnabled : false, //是否显示拖拽区域
							allowedFileExtensions : [ "png", "jpg", "gif" ], //接收的文件后缀
							maxFileCount : 5

						} */).on("fileuploaded", function(event, data) {
			var response = data.response.response;
			console.log(response);
			if (response.uploaded == 1) {

				$("#inputBigImg").val(response.url)

			} else {
				alert("文件上传失败")
			}

		}).on('fileerror', function(event, data, msg) { //一个文件上传失败
			alert('文件上传失败！' + msg);

		}).on("filebatchselected", function(event, files) {
			console.log(files)
		}).on('fileselect', function(event, numFiles, label) {

		});
		;

		function isEmpty(obj1) {
			if (typeof obj1 == "undefined" || obj1 == null || obj1 == "") {
				return true;
			} else {
				return false;
			}
		}
	</script>

	<script type="text/javascript">
		CKEDITOR.replace('editor');
	</script>

	<script type="text/javascript">
		function changeState(el) {
			if (el.readOnly)
				el.checked = el.readOnly = false;
			else if (!el.checked)
				el.readOnly = el.indeterminate = true;
		}
	</script>
	
<script type="text/javascript">
//给label和value设置初值
/* window.onload = getVal(); */
/* //select的onchange调用函数
function getVal(){
var countrySelect = document.getElementById('cateList');//获取select的dom
var index = countrySelect.selectedIndex;//获取选中的index
var label = countrySelect.options[index].text; //获取标签值
var value = countrySelect.options[index].value;//获取value值
document.getElementById('caname').value = label;
document.getElementById('caid').value = value;
console.log(value,label)
} */
var countrySelect = document.getElementById('cateList');
countrySelect.addEventListener("change", A(e), false);

function A(e)
{
	var index = e.selectedIndex;//获取选中的index
	var label = e.options[index].text; //获取标签值
	var value = e.options[index].value;//获取value值
	document.getElementById('caname').value = label;
	document.getElementById('caid').value = value;
	console.log(value,label)
}

</script>

</body>

</html>