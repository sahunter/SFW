<%@ page import="arrange.model.*,java.util.List,java.util.ArrayList" language="java" contentType="text/html; charset=UTF-8"
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
    
     WorkService workService = (WorkService) getServletContext().getAttribute("workService");
     WorkArrange last = new WorkArrange();
     last=workService.getTheLastOne();
     
      //List<User> blahs = userService.getUsers();
      List<WorkArrange> blahs = workService.getWorkArranges(last);
      //String sparetime=null;
      
     
       
       List<String> p1 = new ArrayList<String>();
      List<String> p2=new ArrayList<String>();
      List<String> p3=new ArrayList<String>();
      List<String> p4=new ArrayList<String>();
      List<String> p5=new ArrayList<String>();
      List<String> p6=new ArrayList<String>();
      List<String> p7=new ArrayList<String>();
      List<String> p8=new ArrayList<String>();
      List<String> p9=new ArrayList<String>();
      List<String> p10=new ArrayList<String>();
      List<String> p11=new ArrayList<String>();
      List<String> p12=new ArrayList<String>();
      List<String> p13=new ArrayList<String>();
      List<String> p14=new ArrayList<String>(); 
      
      for (int i = 0; i < blahs.size(); i++) { 
	 		WorkArrange bh = blahs.get(i);
	 		String ba=bh.getWorkTime()+bh.getShift();

	 			switch(ba){
	 			case "周一中班":
	 				p1.add(bh.getUserName());
	 				break;
	 			case "周一晚班":
	 				p2.add(bh.getUserName());
	 				break;
	 			case "周二中班":
	 				p3.add(bh.getUserName());
	 				break;
	 			case "周二晚班":
	 				p4.add(bh.getUserName());
	 				break;
	 			case "周三中班":
	 				p5.add(bh.getUserName());
	 				break;
	 			case "周三晚班":
	 				p6.add(bh.getUserName());
	 				break;
	 			case "周四中班":
	 				p7.add(bh.getUserName());
	 				break;
	 			case "周四晚班":
	 				p8.add(bh.getUserName());
	 				break;
	 			case "周五中班":
	 				p9.add(bh.getUserName());
	 				break;
	 			case "周五晚班":
	 				p10.add(bh.getUserName());
	 				break;
	 			case "周六中班":
	 				p11.add(bh.getUserName());
	 				break;
	 			case "周六晚班":
	 				p12.add(bh.getUserName());
	 				break;
	 			case "周日中班":
	 				p13.add(bh.getUserName());
	 				break;
	 			case "周日晚班":
	 				p14.add(bh.getUserName());
	 				break;
	 			}
	 		}
	 	
      
     
         //
     // for(int k=0;k<p1.length;k++){
    	  
     // }
      
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
					<h1 class="page-header">下周排班</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			
			<!-- /.row -->
			<div class="row">
				
				<!-- /.col-lg-6 -->
				<div class="col-lg-6">
					<div class="panel panel-default">
						<div class="panel-heading">值班表 &nbsp;&nbsp;&nbsp;&nbsp;
						<p align="right"><a style="link{text-decoration:none;color:blue}" href="ChangeOff.jsp">申请调班</a>  &nbsp;&nbsp;&nbsp;&nbsp;  <a style="link{text-decoration:none;color:blue}" href="WorkOverTime.jsp">加班信息</a></p>
						</div>
						<!-- /.panel-heading -->
						<div class="panel-body">
							<div class="table-responsive">
							
								<table class="table">
									<thead>
										<tr>
											<th>时段</th>
											<th>周一</th>
											<th>周二</th>
											<th>周三</th>
											<th>周四</th>
											<th>周五</th>
											<th>周六</th>
											<th>周日</th>
										</tr>
									</thead>
									<tbody>
										<tr class="success">
											<td ><strong>上午</strong></td>
											<td><%
														for(int k=0;k<p1.size();k++){
													%>
															<%=p1.get(k) %><br />
													<%} %></td>
											<td><%
														for(int k=0;k<p3.size();k++){
													%>
															<%=p3.get(k) %><br />
													<%} %></td>
											<td><%
														for(int k=0;k<p5.size();k++){
													%>
															<%=p5.get(k) %><br />
													<%} %></td>
											<td><%
														for(int k=0;k<p7.size();k++){
													%>
															<%=p7.get(k) %><br />
													<%} %></td>
											<td><%
														for(int k=0;k<p9.size();k++){
													%>
															<%=p9.get(k) %><br />
													<%} %></td>
											<td><%
														for(int k=0;k<p11.size();k++){
													%>
															<%=p11.get(k) %><br />
													<%} %></td>
											<td><%
														for(int k=0;k<p13.size();k++){
													%>
															<%=p13.get(k) %><br />
													<%} %></td>
										</tr>
										<tr class="warning">
											<td><strong>下午</strong></td>
											<td><%
														for(int k=0;k<p2.size();k++){
													%>
															<%=p2.get(k) %><br />
													<%} %></td>
											<td><%
														for(int k=0;k<p4.size();k++){
													%>
															<%=p4.get(k) %><br />
													<%} %></td>
											<td><%
														for(int k=0;k<p6.size();k++){
													%>
															<%=p6.get(k) %><br />
													<%} %></td>
											<td><%
														for(int k=0;k<p8.size();k++){
													%>
															<%=p8.get(k) %><br />
													<%} %></td>
											<td><%
														for(int k=0;k<p10.size();k++){
													%>
															<%=p10.get(k) %><br />
													<%} %></td>
											<td><%
														for(int k=0;k<p12.size();k++){
													%>
															<%=p12.get(k) %><br />
													<%} %></td>
											<td><%
														for(int k=0;k<p14.size();k++){
													%>
															<%=p14.get(k) %><br />
													<%} %></td>
										</tr>
										
									</tbody>
								</table>
							</div>
							<!-- /.table-responsive -->
						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				</div>
							</div>
							<!-- /.table-responsive -->
						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				
				<!-- /.col-lg-6 -->
			
			<!-- /.row -->
		
		<!-- /#page-wrapper -->

	
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