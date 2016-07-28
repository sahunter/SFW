<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>商家管理</title>

<!-- Bootstrap Core CSS -->
<link href="../bower_components/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- MetisMenu CSS -->
<link href="../bower_components/metisMenu/dist/metisMenu.min.css"
	rel="stylesheet">

<!-- DataTables CSS -->
<link
	href="../bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.css"
	rel="stylesheet">

<!-- DataTables Responsive CSS -->
<link
	href="../bower_components/datatables-responsive/css/dataTables.responsive.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link href="../dist/css/sb-admin-2.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="../bower_components/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->




</head>

<body>

	<div id="wrapper">

		<!-- Navigation -->
		<nav class="navbar navbar-default navbar-static-top" role="navigation"
			style="margin-bottom: 0">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.jsp">商家管理</a>
			</div>
			<!-- /.navbar-header -->

			<ul class="nav navbar-top-links navbar-right">
				
				<!-- /.dropdown -->
				<li class="dropdown"><a class="dropdown-toggle"
					data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
						<i class="fa fa-caret-down"></i>
				</a>
					<ul class="dropdown-menu dropdown-user">
						<li><a href="#"><i class="fa fa-user fa-fw"></i> User
								Profile</a></li>
						<li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
						</li>
						<li class="divider"></li>
						<li><a href="login.jsp"><i class="fa fa-sign-out fa-fw"></i>
								Logout</a></li>
					</ul> <!-- /.dropdown-user --></li>
				<!-- /.dropdown -->
			</ul>
			<!-- /.navbar-top-links -->

			<div class="navbar-default sidebar" role="navigation">
				<div class="sidebar-nav navbar-collapse">
					<ul class="nav" id="side-menu">
						<li class="sidebar-search">
							<div class="input-group custom-search-form">
								<input type="text" class="form-control" placeholder="Search...">
								<span class="input-group-btn">
									<button class="btn btn-default" type="button">
										<i class="fa fa-search"></i>
									</button>
								</span>
							</div> <!-- /input-group -->
						</li>
						<li><a href="index.jsp"><i class="fa fa-dashboard fa-fw"></i>指示板</a>
						</li>
						<li><a href="#"><i class="fa fa-bar-chart-o fa-fw"></i>图表<span
								class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li><a href="flot.jsp">Flot 图表</a></li>
								<li><a href="morris.jsp">Morris.js图表</a></li>
							</ul> <!-- /.nav-second-level --></li>
						<li><a href="tables.html"><i class="fa fa-table fa-fw"></i>
								表格</a></li>





						<li><a href="#"><i class="fa fa-files-o fa-fw"></i> 样本页<span
								class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<li><a href="blank.jsp">空白页</a></li>
								<li><a href="login.jsp">登录页</a></li>
							</ul> <!-- /.nav-second-level --></li>
					</ul>
				</div>
				<!-- /.sidebar-collapse -->
			</div>
			<!-- /.navbar-static-side -->
		</nav>

		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">工作变动</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			
			<!-- /.row -->
			<div class="row">
				<div class="col-lg-6">
					<div class="panel panel-default">                        <!--qingjialalalalal -->
						<div class="panel-heading">调班</div>
						<!-- /.panel-heading -->
						<div class="panel-body">
							<div class="table-responsive">
							<form action="../ChangeOff">
								<table class="table table-striped table-bordered table-hover">
									<thead>
										<tr>
											<th>原来的日期</th>
											<th>原来的时段</th>
											<th>调后的班次</th>
											
											<th>&nbsp;&nbsp;</th>
										</tr>
									</thead>
									<tbody>	
										<tr>
											<td><input type="text" name="olddate" id="olddate"></td>
											<td><input type="text" name="oldtime" id="oldtime"></td>
											<td><input type="text" name="newsection" id="newsection"></td>
											
											<td><input type="button" value="申请调班"  class="item_addcart"></td>
										</tr>                                                         <!--  add3 -->
									</tbody>
								</table>    </form>
							</div>
							<!-- /.table-responsive -->
						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				</div>
				<!-- /.col-lg-6 -->
				
				<!-- /.col-lg-6 -->
			</div>
			
			<!-- /.row -->
			
			<!-- /.row -->
		</div>
		<!-- /#page-wrapper -->

	</div>
	<!-- /#wrapper -->

	<!-- jQuery -->
	<script type="text/javascript" src="../js/jquery-1.11.1.min.js"></script>
<script type="text/javascript" src="../js/jquery.jscrollpane.min.js"></script>
<script type="text/javascript" src="../js/jquery-1.11.3.js"></script>
	
	
	<script src="../bower_components/jquery/dist/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="../bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="../bower_components/metisMenu/dist/metisMenu.min.js"></script>

	<!-- DataTables JavaScript -->
	<script
		src="../bower_components/datatables/media/js/jquery.dataTables.min.js"></script>
	<script
		src="../bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="../dist/js/sb-admin-2.js"></script>

	<!-- Page-Level Demo Scripts - Tables - Use for reference -->
	
	
	
	
	
	<script type="text/javascript" id="sourcecode">
	$(function()
			{
				$(".item_addcart").click(function(){
					
					//var quantity =$("#quantity").val();
					$.post("../ChangeOff", {
						olddate : $("#olddate").val(),
						oldtime : $("#oldtime").val(),
						newsection : $("#newsection").val()
						//quantity :quantity,
						//goodsname : $(this).attr("goodsname"),
						//seller : $(this).attr("seller")
					}, function(data) {
						if (data==1) {
							alert("调班申请已成功提交！");
						} else {
							alert("调班申请提交失败！");
						}
						
						
					})							
				$('.scroll-pane').jScrollPane();
			});
			});

		
	</script>

</body>

</html>