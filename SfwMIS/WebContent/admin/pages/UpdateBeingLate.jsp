<%@ page import="arrange.model.*,hrm.model.*,java.util.List" language="java" contentType="text/html; charset=UTF-8"
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
<style type="text/css">
	select{
		border:none;
	}
</style>

</head>

<body>

	<%
	//String seller = (String) request.getSession().getAttribute("slogin");
			//String seller ="松三水果店";
	   WebService userService = (WebService) getServletContext()
              .getAttribute("userService");
      
    // User blah = new User();
      List<User> blahs = userService.getUsers();
      WorkService workService = (WorkService) getServletContext().getAttribute("workService");
      
      List<WorkChange> Wblahs = workService.getWorkChangeBLs();
	      
	%>

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
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading"><strong>历史迟到记录</strong></div>
						<!-- /.panel-heading -->
						<div class="panel-body">
							<div class="dataTable_wrapper">
								<table class="table table-striped table-bordered table-hover"
									id="dataTables-example">
									<thead>
										<tr>
											<th>编号</th>
											<th>姓名</th>
											<th>日期</th>
											<th>时段</th>
											<th>摘要</th>
										</tr>
									</thead>
									<tbody>
									<%
													
														for(int i = 0; i < Wblahs.size(); i++){
															WorkChange wbh=Wblahs.get(i);
													%>
													<tr>
															<td><%=wbh.getId() %></td>
															<td><%=wbh.getUserName() %></td>
															<td><%=wbh.getDate() %></td>
															<td class="center"><%=wbh.getTime() %></td>
															<td class="center"><%=wbh.getBeingLate() %></td>
											</tr>
														<%}%>
									</tbody>
								</table>
							</div>
							<!-- /.table-responsive -->
							
						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
			<div class="row">
				<div class="col-lg-6">
					<div class="panel panel-default">                        <!--qingjialalalalal -->
						<div class="panel-heading"><strong>员工迟到记录修改或新增</strong></div>
						<!-- /.panel-heading -->
						<div class="panel-body">
							<div class="table-responsive">
							<form action="../UpdateBeingLate">
								<table class="table table-striped table-bordered table-hover">
									<thead>
										<tr>
											<th>编号</th>
											<th>姓名</th>
											<th>日期</th>
											<th>时段</th>
											<th>迟到理由</th>
										</tr>
									</thead>
									<tbody>
											<tr>
															
													<td><input type="text" name="theId" >
											</td>
											<td><input type="text" name="UPthename" value="修改"></td>
											<td><input type="text" name="UPthedate"></td>
											<td><input type="text" name="UPthetime"></td>
											<td><input type="text" name="UPreason"></td>
										</tr>
														
									</tbody>
								</table>
								<p align="center"><input type="submit" value="修改记录"></p>
								<br />
								<br />
								
								<table class="table table-striped table-bordered table-hover">
									<thead>
										<tr>
											<th>姓名</th>
											<th>日期</th>
											<th>时段</th>
											<th>迟到理由</th>
										</tr>
									</thead>
									<tbody>
											<tr>
															
													<td>&nbsp;
												<select name="late">
													<%
													for(int i = 0; i < blahs.size(); i++){
														User bh=blahs.get(i);
													%>
															<option value="<%=bh.getUsername() %>"><%=bh.getUsername() %>
													<%} %>
												</select>
											</td>
											<td><input type="text" name="thedate"></td>
											<td><input type="text" name="thetime"></td>
											<td><input type="text" name="reason"></td>
										</tr>
														
									</tbody>
								</table>
								<p align="center"><input type="submit" value="新增存档"></p>
								</form>
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
	<script>
    $(document).ready(function() {
        $('#dataTables-example').DataTable({
                responsive: true
        });
    });
    </script>

</body>

</html>