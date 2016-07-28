<%@ page import="hrm.model.*,java.util.List,java.util.ArrayList" language="java" contentType="text/html; charset=UTF-8"
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
      
     //User blah = new User();
      List<User> blahs = userService.getUsers();
      String sparetime=null;
      
     
       
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
	 		User bh = blahs.get(i);
	 		String a=bh.getSparetime();
	 	      String ssss[]=a.split("、");
	 		for(int j = 0;j<ssss.length;j++){
	 			sparetime=ssss[j];
	 			switch(sparetime){
	 			case "周一上午":
	 				p1.add(bh.getUsername());
	 				break;
	 			case "周一下午":
	 				p2.add(bh.getUsername());
	 				break;
	 			case "周二上午":
	 				p3.add(bh.getUsername());
	 				break;
	 			case "周二下午":
	 				p4.add(bh.getUsername());
	 				break;
	 			case "周三上午":
	 				p5.add(bh.getUsername());
	 				break;
	 			case "周三下午":
	 				p6.add(bh.getUsername());
	 				break;
	 			case "周四上午":
	 				p7.add(bh.getUsername());
	 				break;
	 			case "周四下午":
	 				p8.add(bh.getUsername());
	 				break;
	 			case "周五上午":
	 				p9.add(bh.getUsername());
	 				break;
	 			case "周五下午":
	 				p10.add(bh.getUsername());
	 				break;
	 			case "周六上午":
	 				p11.add(bh.getUsername());
	 				break;
	 			case "周六下午":
	 				p12.add(bh.getUsername());
	 				break;
	 			case "周日上午":
	 				p13.add(bh.getUsername());
	 				break;
	 			case "周日下午":
	 				p14.add(bh.getUsername());
	 				break;
	 			}
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
					<h1 class="page-header">排班</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			
			<!-- /.row -->
			<div class="row">
				
				<!-- /.col-lg-6 -->
				<div class="col-lg-6">
					<div class="panel panel-default">
						<div class="panel-heading">值班安排</div>
						<!-- /.panel-heading -->
						<div class="panel-body">
							<div class="table-responsive">
							<form action="../WorkArrangement" method="post">
								<table class="table">
									<thead>
										<tr>
											<th>时段</th>
											<th>区域</th>
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
											<td rowspan="12"><strong>上午</strong></td>
											<td>负责人</td>
											<td>&nbsp;
												<select name="MM1">
													<%
														for(int k=0;k<p1.size();k++){
													%>
															<option value="<%=p1.get(k) %>"><%=p1.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="TM1">
													<%
														for(int k=0;k<p3.size();k++){
													%>
															<option value="<%=p3.get(k) %>"><%=p3.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="WM1">
													<%
														for(int k=0;k<p5.size();k++){
													%>
															<option value="<%=p5.get(k) %>"><%=p5.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="THM1">
													<%
														for(int k=0;k<p7.size();k++){
													%>
															<option value="<%=p7.get(k) %>"><%=p7.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="FM1">
													<%
														for(int k=0;k<p9.size();k++){
													%>
															<option value="<%=p9.get(k) %>"><%=p9.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SAM1">
													<%
														for(int k=0;k<p11.size();k++){
													%>
															<option value="<%=p11.get(k) %>"><%=p11.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SUM1">
													<%
														for(int k=0;k<p13.size();k++){
													%>
															<option value="<%=p13.get(k) %>"><%=p13.get(k) %>
													<%} %>
												</select>
											</td>
										</tr>
										<tr class="info">
											<td>客服</td>
											<td>&nbsp;
												<select name="MM2">
													<%
														for(int k=0;k<p1.size();k++){
													%>
															<option value="<%=p1.get(k) %>"><%=p1.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="TM2">
													<%
														for(int k=0;k<p3.size();k++){
													%>
															<option value="<%=p3.get(k) %>"><%=p3.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="WM2">
													<%
														for(int k=0;k<p5.size();k++){
													%>
															<option value="<%=p5.get(k) %>"><%=p5.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="THM2">
													<%
														for(int k=0;k<p7.size();k++){
													%>
															<option value="<%=p7.get(k) %>"><%=p7.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="FM2">
													<%
														for(int k=0;k<p9.size();k++){
													%>
															<option value="<%=p9.get(k) %>"><%=p9.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SAM2">
													<%
														for(int k=0;k<p11.size();k++){
													%>
															<option value="<%=p11.get(k) %>"><%=p11.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SUM2">
													<%
														for(int k=0;k<p13.size();k++){
													%>
															<option value="<%=p13.get(k) %>"><%=p13.get(k) %>
													<%} %>
												</select>
											</td>
										</tr>
										<tr class="warning">
											<td>松苑</td>
											<td>&nbsp;
												<select name="MM3">
													<%
														for(int k=0;k<p1.size();k++){
													%>
															<option value="<%=p1.get(k) %>"><%=p1.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="TM3">
													<%
														for(int k=0;k<p3.size();k++){
													%>
															<option value="<%=p3.get(k) %>"><%=p3.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="WM3">
													<%
														for(int k=0;k<p5.size();k++){
													%>
															<option value="<%=p5.get(k) %>"><%=p5.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="THM3">
													<%
														for(int k=0;k<p7.size();k++){
													%>
															<option value="<%=p7.get(k) %>"><%=p7.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="FM3">
													<%
														for(int k=0;k<p9.size();k++){
													%>
															<option value="<%=p9.get(k) %>"><%=p9.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SAM3">
													<%
														for(int k=0;k<p11.size();k++){
													%>
															<option value="<%=p11.get(k) %>"><%=p11.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SUM3">
													<%
														for(int k=0;k<p13.size();k++){
													%>
															<option value="<%=p13.get(k) %>"><%=p13.get(k) %>
													<%} %>
												</select>
											</td>
										</tr>
										<tr class="danger">
											<td>桃苑</td>
											<td>&nbsp;
												<select name="MM4">
													<%
														for(int k=0;k<p1.size();k++){
													%>
															<option value="<%=p1.get(k) %>"><%=p1.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="TM4">
													<%
														for(int k=0;k<p3.size();k++){
													%>
															<option value="<%=p3.get(k) %>"><%=p3.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="WM4">
													<%
														for(int k=0;k<p5.size();k++){
													%>
															<option value="<%=p5.get(k) %>"><%=p5.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="THM4">
													<%
														for(int k=0;k<p7.size();k++){
													%>
															<option value="<%=p7.get(k) %>"><%=p7.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="FM4">
													<%
														for(int k=0;k<p9.size();k++){
													%>
															<option value="<%=p9.get(k) %>"><%=p9.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SAM4">
													<%
														for(int k=0;k<p11.size();k++){
													%>
															<option value="<%=p11.get(k) %>"><%=p11.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SUM4">
													<%
														for(int k=0;k<p13.size();k++){
													%>
															<option value="<%=p13.get(k) %>"><%=p13.get(k) %>
													<%} %>
												</select>
											</td>
										</tr>
										<tr class="success">
											<td>研苑</td>
											<td>&nbsp;
												<select name="MM5">
													<%
														for(int k=0;k<p1.size();k++){
													%>
															<option value="<%=p1.get(k) %>"><%=p1.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="TM5">
													<%
														for(int k=0;k<p3.size();k++){
													%>
															<option value="<%=p3.get(k) %>"><%=p3.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="WM5">
													<%
														for(int k=0;k<p5.size();k++){
													%>
															<option value="<%=p5.get(k) %>"><%=p5.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="THM5">
													<%
														for(int k=0;k<p7.size();k++){
													%>
															<option value="<%=p7.get(k) %>"><%=p7.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="FM5">
													<%
														for(int k=0;k<p9.size();k++){
													%>
															<option value="<%=p9.get(k) %>"><%=p9.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SAM5">
													<%
														for(int k=0;k<p11.size();k++){
													%>
															<option value="<%=p11.get(k) %>"><%=p11.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SUM5">
													<%
														for(int k=0;k<p13.size();k++){
													%>
															<option value="<%=p13.get(k) %>"><%=p13.get(k) %>
													<%} %>
												</select>
											</td>
										</tr>
										<tr class="info">
											<td>杏苑</td>
											<td>&nbsp;
												<select name="MM6">
													<%
														for(int k=0;k<p1.size();k++){
													%>
															<option value="<%=p1.get(k) %>"><%=p1.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="TM6">
													<%
														for(int k=0;k<p3.size();k++){
													%>
															<option value="<%=p3.get(k) %>"><%=p3.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="WM6">
													<%
														for(int k=0;k<p5.size();k++){
													%>
															<option value="<%=p5.get(k) %>"><%=p5.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="THM6">
													<%
														for(int k=0;k<p7.size();k++){
													%>
															<option value="<%=p7.get(k) %>"><%=p7.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="FM6">
													<%
														for(int k=0;k<p9.size();k++){
													%>
															<option value="<%=p9.get(k) %>"><%=p9.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SAM6">
													<%
														for(int k=0;k<p11.size();k++){
													%>
															<option value="<%=p11.get(k) %>"><%=p11.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SUM6">
													<%
														for(int k=0;k<p13.size();k++){
													%>
															<option value="<%=p13.get(k) %>"><%=p13.get(k) %>
													<%} %>
												</select>
											</td>
										</tr>
										<tr class="warning">
											<td>梅苑</td>
											<td>&nbsp;
												<select name="MM7">
													<%
														for(int k=0;k<p1.size();k++){
													%>
															<option value="<%=p1.get(k) %>"><%=p1.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="TM7">
													<%
														for(int k=0;k<p3.size();k++){
													%>
															<option value="<%=p3.get(k) %>"><%=p3.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="WM7">
													<%
														for(int k=0;k<p5.size();k++){
													%>
															<option value="<%=p5.get(k) %>"><%=p5.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="THM7">
													<%
														for(int k=0;k<p7.size();k++){
													%>
															<option value="<%=p7.get(k) %>"><%=p7.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="FM7">
													<%
														for(int k=0;k<p9.size();k++){
													%>
															<option value="<%=p9.get(k) %>"><%=p9.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SAM7">
													<%
														for(int k=0;k<p11.size();k++){
													%>
															<option value="<%=p11.get(k) %>"><%=p11.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SUM7">
													<%
														for(int k=0;k<p13.size();k++){
													%>
															<option value="<%=p13.get(k) %>"><%=p13.get(k) %>
													<%} %>
												</select>
											</td>
										</tr>
										<tr class="danger">
											<td>学院</td>
											<td>&nbsp;
												<select name="MM8">
													<%
														for(int k=0;k<p1.size();k++){
													%>
															<option value="<%=p1.get(k) %>"><%=p1.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="TM8">
													<%
														for(int k=0;k<p3.size();k++){
													%>
															<option value="<%=p3.get(k) %>"><%=p3.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="WM8">
													<%
														for(int k=0;k<p5.size();k++){
													%>
															<option value="<%=p5.get(k) %>"><%=p5.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="THM8">
													<%
														for(int k=0;k<p7.size();k++){
													%>
															<option value="<%=p7.get(k) %>"><%=p7.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="FM8">
													<%
														for(int k=0;k<p9.size();k++){
													%>
															<option value="<%=p9.get(k) %>"><%=p9.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SAM8">
													<%
														for(int k=0;k<p11.size();k++){
													%>
															<option value="<%=p11.get(k) %>"><%=p11.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SUM8">
													<%
														for(int k=0;k<p13.size();k++){
													%>
															<option value="<%=p13.get(k) %>"><%=p13.get(k) %>
													<%} %>
												</select>
											</td>
										</tr>
										<tr class="success">
											<td>竹一</td>
											<td>&nbsp;
												<select name="MM9">
													<%
														for(int k=0;k<p1.size();k++){
													%>
															<option value="<%=p1.get(k) %>"><%=p1.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="TM9">
													<%
														for(int k=0;k<p3.size();k++){
													%>
															<option value="<%=p3.get(k) %>"><%=p3.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="WM9">
													<%
														for(int k=0;k<p5.size();k++){
													%>
															<option value="<%=p5.get(k) %>"><%=p5.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="THM9">
													<%
														for(int k=0;k<p7.size();k++){
													%>
															<option value="<%=p7.get(k) %>"><%=p7.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="FM9">
													<%
														for(int k=0;k<p9.size();k++){
													%>
															<option value="<%=p9.get(k) %>"><%=p9.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SAM9">
													<%
														for(int k=0;k<p11.size();k++){
													%>
															<option value="<%=p11.get(k) %>"><%=p11.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SUM9">
													<%
														for(int k=0;k<p13.size();k++){
													%>
															<option value="<%=p13.get(k) %>"><%=p13.get(k) %>
													<%} %>
												</select>
											</td>
										</tr>
										<tr class="info">
											<td>竹二</td>
											<td>&nbsp;
												<select name="MM10">
													<%
														for(int k=0;k<p1.size();k++){
													%>
															<option value="<%=p1.get(k) %>"><%=p1.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="TM10">
													<%
														for(int k=0;k<p3.size();k++){
													%>
															<option value="<%=p3.get(k) %>"><%=p3.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="WM10">
													<%
														for(int k=0;k<p5.size();k++){
													%>
															<option value="<%=p5.get(k) %>"><%=p5.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="THM10">
													<%
														for(int k=0;k<p7.size();k++){
													%>
															<option value="<%=p7.get(k) %>"><%=p7.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="FM10">
													<%
														for(int k=0;k<p9.size();k++){
													%>
															<option value="<%=p9.get(k) %>"><%=p9.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SAM10">
													<%
														for(int k=0;k<p11.size();k++){
													%>
															<option value="<%=p11.get(k) %>"><%=p11.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SUM10">
													<%
														for(int k=0;k<p13.size();k++){
													%>
															<option value="<%=p13.get(k) %>"><%=p13.get(k) %>
													<%} %>
												</select>
											</td>
										</tr>
										<tr class="warning">
											<td>竹三</td>
											<td>&nbsp;
												<select name="MM11">
													<%
														for(int k=0;k<p1.size();k++){
													%>
															<option value="<%=p1.get(k) %>"><%=p1.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="TM11">
													<%
														for(int k=0;k<p3.size();k++){
													%>
															<option value="<%=p3.get(k) %>"><%=p3.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="WM11">
													<%
														for(int k=0;k<p5.size();k++){
													%>
															<option value="<%=p5.get(k) %>"><%=p5.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="THM11">
													<%
														for(int k=0;k<p7.size();k++){
													%>
															<option value="<%=p7.get(k) %>"><%=p7.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="FM11">
													<%
														for(int k=0;k<p9.size();k++){
													%>
															<option value="<%=p9.get(k) %>"><%=p9.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SAM11">
													<%
														for(int k=0;k<p11.size();k++){
													%>
															<option value="<%=p11.get(k) %>"><%=p11.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SUM11">
													<%
														for(int k=0;k<p13.size();k++){
													%>
															<option value="<%=p13.get(k) %>"><%=p13.get(k) %>
													<%} %>
												</select>
											</td>
										</tr>
										<tr class="danger">
											<td>竹四</td>
											<td>&nbsp;
												<select name="MM12">
													<%
														for(int k=0;k<p1.size();k++){
													%>
															<option value="<%=p1.get(k) %>"><%=p1.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="TM12">
													<%
														for(int k=0;k<p3.size();k++){
													%>
															<option value="<%=p3.get(k) %>"><%=p3.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="WM12">
													<%
														for(int k=0;k<p5.size();k++){
													%>
															<option value="<%=p5.get(k) %>"><%=p5.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="THM12">
													<%
														for(int k=0;k<p7.size();k++){
													%>
															<option value="<%=p7.get(k) %>"><%=p7.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="FM12">
													<%
														for(int k=0;k<p9.size();k++){
													%>
															<option value="<%=p9.get(k) %>"><%=p9.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SAM12">
													<%
														for(int k=0;k<p11.size();k++){
													%>
															<option value="<%=p11.get(k) %>"><%=p11.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SUM12">
													<%
														for(int k=0;k<p13.size();k++){
													%>
															<option value="<%=p13.get(k) %>"><%=p13.get(k) %>
													<%} %>
												</select>
											</td>
										</tr>
										<tr >
											<td colspan="9"><hr color="black"  /></td>
										</tr>
										                                       <!-- fenge -->
										<tr class="success">
											<td rowspan="12"><strong>下午</strong></td>
											<td>负责人</td>
											<td>&nbsp;
												<select name="MA1">
													<%
														for(int k=0;k<p2.size();k++){
													%>
															<option value="<%=p2.get(k) %>"><%=p2.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="TA1">
													<%
														for(int k=0;k<p4.size();k++){
													%>
															<option value="<%=p4.get(k) %>"><%=p4.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="WA1">
													<%
														for(int k=0;k<p6.size();k++){
													%>
															<option value="<%=p6.get(k) %>"><%=p6.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="THA1">
													<%
														for(int k=0;k<p8.size();k++){
													%>
															<option value="<%=p8.get(k) %>"><%=p8.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="FA1">
													<%
														for(int k=0;k<p10.size();k++){
													%>
															<option value="<%=p10.get(k) %>"><%=p10.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SAA1">
													<%
														for(int k=0;k<p12.size();k++){
													%>
															<option value="<%=p12.get(k) %>"><%=p12.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SUA1">
													<%
														for(int k=0;k<p14.size();k++){
													%>
															<option value="<%=p14.get(k) %>"><%=p14.get(k) %>
													<%} %>
												</select>
											</td>
										</tr>
										<tr class="info">
											<td>客服</td>
											<td>&nbsp;
												<select name="MA2">
													<%
														for(int k=0;k<p2.size();k++){
													%>
															<option value="<%=p2.get(k) %>"><%=p2.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="TA2">
													<%
														for(int k=0;k<p4.size();k++){
													%>
															<option value="<%=p4.get(k) %>"><%=p4.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="WA2">
													<%
														for(int k=0;k<p6.size();k++){
													%>
															<option value="<%=p6.get(k) %>"><%=p6.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="THA2">
													<%
														for(int k=0;k<p8.size();k++){
													%>
															<option value="<%=p8.get(k) %>"><%=p8.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="FA2">
													<%
														for(int k=0;k<p10.size();k++){
													%>
															<option value="<%=p10.get(k) %>"><%=p10.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SAA2">
													<%
														for(int k=0;k<p12.size();k++){
													%>
															<option value="<%=p12.get(k) %>"><%=p12.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SUA2">
													<%
														for(int k=0;k<p14.size();k++){
													%>
															<option value="<%=p14.get(k) %>"><%=p14.get(k) %>
													<%} %>
												</select>
											</td>
										</tr>
										<tr class="warning">
											<td>松苑</td>
											<td>&nbsp;
												<select name="MA3">
													<%
														for(int k=0;k<p2.size();k++){
													%>
															<option value="<%=p2.get(k) %>"><%=p2.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="TA3">
													<%
														for(int k=0;k<p4.size();k++){
													%>
															<option value="<%=p4.get(k) %>"><%=p4.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="WA3">
													<%
														for(int k=0;k<p6.size();k++){
													%>
															<option value="<%=p6.get(k) %>"><%=p6.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="THA3">
													<%
														for(int k=0;k<p8.size();k++){
													%>
															<option value="<%=p8.get(k) %>"><%=p8.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="FA3">
													<%
														for(int k=0;k<p10.size();k++){
													%>
															<option value="<%=p10.get(k) %>"><%=p10.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SAA3">
													<%
														for(int k=0;k<p12.size();k++){
													%>
															<option value="<%=p12.get(k) %>"><%=p12.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SUA3">
													<%
														for(int k=0;k<p14.size();k++){
													%>
															<option value="<%=p14.get(k) %>"><%=p14.get(k) %>
													<%} %>
												</select>
											</td>
										</tr>
										<tr class="danger">
											<td>桃苑</td>
											<td>&nbsp;
												<select name="MA4">
													<%
														for(int k=0;k<p2.size();k++){
													%>
															<option value="<%=p2.get(k) %>"><%=p2.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="TA4">
													<%
														for(int k=0;k<p4.size();k++){
													%>
															<option value="<%=p4.get(k) %>"><%=p4.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="WA4">
													<%
														for(int k=0;k<p6.size();k++){
													%>
															<option value="<%=p6.get(k) %>"><%=p6.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="THA4">
													<%
														for(int k=0;k<p8.size();k++){
													%>
															<option value="<%=p8.get(k) %>"><%=p8.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="FA4">
													<%
														for(int k=0;k<p10.size();k++){
													%>
															<option value="<%=p10.get(k) %>"><%=p10.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SAA4">
													<%
														for(int k=0;k<p12.size();k++){
													%>
															<option value="<%=p12.get(k) %>"><%=p12.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SUA4">
													<%
														for(int k=0;k<p14.size();k++){
													%>
															<option value="<%=p14.get(k) %>"><%=p14.get(k) %>
													<%} %>
												</select>
											</td>
										</tr>
										<tr class="success">
											<td>研苑</td>
											<td>&nbsp;
												<select name="MA5">
													<%
														for(int k=0;k<p2.size();k++){
													%>
															<option value="<%=p2.get(k) %>"><%=p2.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="TA5">
													<%
														for(int k=0;k<p4.size();k++){
													%>
															<option value="<%=p4.get(k) %>"><%=p4.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="WA5">
													<%
														for(int k=0;k<p6.size();k++){
													%>
															<option value="<%=p6.get(k) %>"><%=p6.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="THA5">
													<%
														for(int k=0;k<p8.size();k++){
													%>
															<option value="<%=p8.get(k) %>"><%=p8.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="FA5">
													<%
														for(int k=0;k<p10.size();k++){
													%>
															<option value="<%=p10.get(k) %>"><%=p10.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SAA5">
													<%
														for(int k=0;k<p12.size();k++){
													%>
															<option value="<%=p12.get(k) %>"><%=p12.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SUA5">
													<%
														for(int k=0;k<p14.size();k++){
													%>
															<option value="<%=p14.get(k) %>"><%=p14.get(k) %>
													<%} %>
												</select>
											</td>
										</tr>
										<tr class="info">
											<td>杏苑</td>
											<td>&nbsp;
												<select name="MA6">
													<%
														for(int k=0;k<p2.size();k++){
													%>
															<option value="<%=p2.get(k) %>"><%=p2.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="TA6">
													<%
														for(int k=0;k<p4.size();k++){
													%>
															<option value="<%=p4.get(k) %>"><%=p4.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="WA6">
													<%
														for(int k=0;k<p6.size();k++){
													%>
															<option value="<%=p6.get(k) %>"><%=p6.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="THA6">
													<%
														for(int k=0;k<p8.size();k++){
													%>
															<option value="<%=p8.get(k) %>"><%=p8.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="FA6">
													<%
														for(int k=0;k<p10.size();k++){
													%>
															<option value="<%=p10.get(k) %>"><%=p10.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SAA6">
													<%
														for(int k=0;k<p12.size();k++){
													%>
															<option value="<%=p12.get(k) %>"><%=p12.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SUA6">
													<%
														for(int k=0;k<p14.size();k++){
													%>
															<option value="<%=p14.get(k) %>"><%=p14.get(k) %>
													<%} %>
												</select>
											</td>
										</tr>
										<tr class="warning">
											<td>梅苑</td>
											<td>&nbsp;
												<select name="MA7">
													<%
														for(int k=0;k<p2.size();k++){
													%>
															<option value="<%=p2.get(k) %>"><%=p2.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="TA7">
													<%
														for(int k=0;k<p4.size();k++){
													%>
															<option value="<%=p4.get(k) %>"><%=p4.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="WA7">
													<%
														for(int k=0;k<p6.size();k++){
													%>
															<option value="<%=p6.get(k) %>"><%=p6.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="THA7">
													<%
														for(int k=0;k<p8.size();k++){
													%>
															<option value="<%=p8.get(k) %>"><%=p8.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="FA7">
													<%
														for(int k=0;k<p10.size();k++){
													%>
															<option value="<%=p10.get(k) %>"><%=p10.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SAA7">
													<%
														for(int k=0;k<p12.size();k++){
													%>
															<option value="<%=p12.get(k) %>"><%=p12.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SUA7">
													<%
														for(int k=0;k<p14.size();k++){
													%>
															<option value="<%=p14.get(k) %>"><%=p14.get(k) %>
													<%} %>
												</select>
											</td>
										</tr>
										<tr class="danger">
											<td>学院</td>
											<td>&nbsp;
												<select name="MA8">
													<%
														for(int k=0;k<p2.size();k++){
													%>
															<option value="<%=p2.get(k) %>"><%=p2.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="TA8">
													<%
														for(int k=0;k<p4.size();k++){
													%>
															<option value="<%=p4.get(k) %>"><%=p4.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="WA8">
													<%
														for(int k=0;k<p6.size();k++){
													%>
															<option value="<%=p6.get(k) %>"><%=p6.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="THA8">
													<%
														for(int k=0;k<p8.size();k++){
													%>
															<option value="<%=p8.get(k) %>"><%=p8.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="FA8">
													<%
														for(int k=0;k<p10.size();k++){
													%>
															<option value="<%=p10.get(k) %>"><%=p10.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SAA8">
													<%
														for(int k=0;k<p12.size();k++){
													%>
															<option value="<%=p12.get(k) %>"><%=p12.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SUA8">
													<%
														for(int k=0;k<p14.size();k++){
													%>
															<option value="<%=p14.get(k) %>"><%=p14.get(k) %>
													<%} %>
												</select>
											</td>
										</tr>
										<tr class="success">
											<td>竹一</td>
											<td>&nbsp;
												<select name="MA9">
													<%
														for(int k=0;k<p2.size();k++){
													%>
															<option value="<%=p2.get(k) %>"><%=p2.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="TA9">
													<%
														for(int k=0;k<p4.size();k++){
													%>
															<option value="<%=p4.get(k) %>"><%=p4.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="WA9">
													<%
														for(int k=0;k<p6.size();k++){
													%>
															<option value="<%=p6.get(k) %>"><%=p6.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="THA9">
													<%
														for(int k=0;k<p8.size();k++){
													%>
															<option value="<%=p8.get(k) %>"><%=p8.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="FA9">
													<%
														for(int k=0;k<p10.size();k++){
													%>
															<option value="<%=p10.get(k) %>"><%=p10.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SAA9">
													<%
														for(int k=0;k<p12.size();k++){
													%>
															<option value="<%=p12.get(k) %>"><%=p12.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SUA9">
													<%
														for(int k=0;k<p14.size();k++){
													%>
															<option value="<%=p14.get(k) %>"><%=p14.get(k) %>
													<%} %>
												</select>
											</td>
										</tr>
										<tr class="info">
											<td>竹二</td>
											<td>&nbsp;
												<select name="MA10">
													<%
														for(int k=0;k<p2.size();k++){
													%>
															<option value="<%=p2.get(k) %>"><%=p2.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="TA10">
													<%
														for(int k=0;k<p4.size();k++){
													%>
															<option value="<%=p4.get(k) %>"><%=p4.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="WA10">
													<%
														for(int k=0;k<p6.size();k++){
													%>
															<option value="<%=p6.get(k) %>"><%=p6.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="THA10">
													<%
														for(int k=0;k<p8.size();k++){
													%>
															<option value="<%=p8.get(k) %>"><%=p8.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="FA10">
													<%
														for(int k=0;k<p10.size();k++){
													%>
															<option value="<%=p10.get(k) %>"><%=p10.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SAA10">
													<%
														for(int k=0;k<p12.size();k++){
													%>
															<option value="<%=p12.get(k) %>"><%=p12.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SUA10">
													<%
														for(int k=0;k<p14.size();k++){
													%>
															<option value="<%=p14.get(k) %>"><%=p14.get(k) %>
													<%} %>
												</select>
											</td>
										</tr>
										<tr class="warning">
											<td>竹三</td>
											<td>&nbsp;
												<select name="MA11">
													<%
														for(int k=0;k<p2.size();k++){
													%>
															<option value="<%=p2.get(k) %>"><%=p2.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="TA11">
													<%
														for(int k=0;k<p4.size();k++){
													%>
															<option value="<%=p4.get(k) %>"><%=p4.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="WA11">
													<%
														for(int k=0;k<p6.size();k++){
													%>
															<option value="<%=p6.get(k) %>"><%=p6.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="THA11">
													<%
														for(int k=0;k<p8.size();k++){
													%>
															<option value="<%=p8.get(k) %>"><%=p8.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="FA11">
													<%
														for(int k=0;k<p10.size();k++){
													%>
															<option value="<%=p10.get(k) %>"><%=p10.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SAA11">
													<%
														for(int k=0;k<p12.size();k++){
													%>
															<option value="<%=p12.get(k) %>"><%=p12.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SUA11">
													<%
														for(int k=0;k<p14.size();k++){
													%>
															<option value="<%=p14.get(k) %>"><%=p14.get(k) %>
													<%} %>
												</select>
											</td>
										</tr>
										<tr class="danger">
											<td>竹四</td>
											<td>&nbsp;
												<select name="MA12">
													<%
														for(int k=0;k<p2.size();k++){
													%>
															<option value="<%=p2.get(k) %>"><%=p2.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="TA12">
													<%
														for(int k=0;k<p4.size();k++){
													%>
															<option value="<%=p4.get(k) %>"><%=p4.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="WA12">
													<%
														for(int k=0;k<p6.size();k++){
													%>
															<option value="<%=p6.get(k) %>"><%=p6.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="THA12">
													<%
														for(int k=0;k<p8.size();k++){
													%>
															<option value="<%=p8.get(k) %>"><%=p8.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="FA12">
													<%
														for(int k=0;k<p10.size();k++){
													%>
															<option value="<%=p10.get(k) %>"><%=p10.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SAA12">
													<%
														for(int k=0;k<p12.size();k++){
													%>
															<option value="<%=p12.get(k) %>"><%=p12.get(k) %>
													<%} %>
												</select>
											</td>
											<td>&nbsp;
												<select name="SUA12">
													<%
														for(int k=0;k<p14.size();k++){
													%>
															<option value="<%=p14.get(k) %>"><%=p14.get(k) %>
													<%} %>
												</select>
											</td>
										</tr>
									</tbody>
								</table>	
								
									<p align="center"><input type="submit" value="确定"></p>
								
								</form>
							</div>
							<!-- /.table-responsive -->
						</div>
						<!-- /.panel-body -->
					</div>
					<!-- /.panel -->
				</div>
				<!-- /.col-lg-6 -->
			</div>
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