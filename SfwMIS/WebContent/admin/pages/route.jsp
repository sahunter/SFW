<%@ page import="dm.model.*,java.util.List,java.text.SimpleDateFormat"  language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">
<link href="../style/authority/basic_layout.css" rel="stylesheet" type="text/css">
<link href="../style/authority/common_style.css" rel="stylesheet" type="text/css">
<link href="../style/authority/zTreeStyle.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="../scripts/jquery/jquery-1.4.4.min.js"></script>
<script type="text/javascript" src="../scripts/zTree/jquery.ztree.core-3.2.js"></script>
<script type="text/javascript" src="../scripts/fancybox/jquery.fancybox-1.3.4.js"></script>
<script type="text/javascript" src="../scripts/fancybox/jquery.fancybox-1.3.4.pack.js"></script>
<link rel="stylesheet" type="text/css" href="../style/authority/jquery.fancybox-1.3.4.css" media="screen"/></link>
<script type="text/javascript" src="../scripts/artDialog/artDialog.js?skin=default"></script>
<title>送饭网系统</title>

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
<script type="text/javascript">
	$(document).ready(function(){
        $(".fy_table_td").fancybox({
            'width' : 900,
            'height' : 650,
            'type' : 'iframe',
            'hideOnOverlayClick' : false,
        });
        
        var lists = $('.unit-the-table tr').eq(0);
        $.each(lists, function(){
			var tds = $(this).find('td[unitname]');
			var names = {};
			$.each(tds, function(){
				var unitname = $(this).attr('unitname');
				names[unitname] = names[unitname] ? names[unitname] + 1 : 1;
			});
			
        });
	});
</script>
<style type="text/css">
	#sider{
		position: absolute;
		top: 0;
		left: 25px;
		bottom: 0px;
		width: 260px;
		border: 1px solid #DEDFDF;
	}
	
	#main{
		position: absolute;
		top: 0;
		left: 285px;
		right: 0px;
		bottom: 0px;
		border: 1px solid #DEDFDF;
		overflow: auto;
	}
	#box_border {
		border: 1px solid #EDEDED;
		height: 50px;
		line-height: 50px;
		text-align: center;
	}
	#fang_type {
		list-style-type: none;
	}
	#fang_type li{
		width: 80px;
		height: 22px;
		line-height: 22px;
		color: #FFF;
		display: inline-block;
	}
	
	.fy_table_td{
		color: #fff;
	}
	
	.fang_th{
		background: #044599 no-repeat;
		text-align: center;
		border-left: 1px solid #02397F;
		border-right: 1px solid #02397F;
		border-bottom: 1px solid #02397F;
		border-top: 1px solid #02397F;
		letter-spacing: 2px;
		text-transform: uppercase;
		font-size: 14px;
		color: #fff;
		height: 37px;
	}
</style>	
</head>

<body>


<%									//?????????????
     WebWebService1 userService1 = (WebWebService1) getServletContext().getAttribute("userService1");
   //  UserRoute blah = new UserRoute();
   //  List<UserRoute> blahs = userService1.getUserRoutes(blah);
   
    HttpServletRequest req = (HttpServletRequest) request; 
     Route blahh = new Route();
     
     List<Route> blahhs = userService1.getRoutes(blahh);
     //request.setAttribute("blahs", blahs);
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
				<a class="navbar-brand" href="index.jsp">送饭网系统</a>
			</div>
			<!-- /.navbar-header -->

			<!--    <ul class="nav navbar-top-links navbar-right">
                <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-envelope fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-messages">
                        <li>
                            <a href="#">
                                <div>
                                    <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                </div>
                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                </div>
                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <strong>John Smith</strong>
                                    <span class="pull-right text-muted">
                                        <em>Yesterday</em>
                                    </span>
                                </div>
                                <div>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eleifend...</div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>Read All Messages</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-messages -->
			<!--    </li>
                <!-- /.dropdown -->
			<!--    <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-tasks fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-tasks">
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Task 1</strong>
                                        <span class="pull-right text-muted">40% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="40" aria-valuemin="0" aria-valuemax="100" style="width: 40%">
                                            <span class="sr-only">40% Complete (success)</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Task 2</strong>
                                        <span class="pull-right text-muted">20% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100" style="width: 20%">
                                            <span class="sr-only">20% Complete</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Task 3</strong>
                                        <span class="pull-right text-muted">60% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%">
                                            <span class="sr-only">60% Complete (warning)</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <p>
                                        <strong>Task 4</strong>
                                        <span class="pull-right text-muted">80% Complete</span>
                                    </p>
                                    <div class="progress progress-striped active">
                                        <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                                            <span class="sr-only">80% Complete (danger)</span>
                                        </div>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>See All Tasks</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-tasks -->
			<!--   </li>
                <!-- /.dropdown -->
			<!--    <li class="dropdown">
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-bell fa-fw"></i>  <i class="fa fa-caret-down"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-alerts">
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-comment fa-fw"></i> New Comment
                                    <span class="pull-right text-muted small">4 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-twitter fa-fw"></i> 3 New Followers
                                    <span class="pull-right text-muted small">12 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-envelope fa-fw"></i> Message Sent
                                    <span class="pull-right text-muted small">4 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-tasks fa-fw"></i> New Task
                                    <span class="pull-right text-muted small">4 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">
                                <div>
                                    <i class="fa fa-upload fa-fw"></i> Server Rebooted
                                    <span class="pull-right text-muted small">4 minutes ago</span>
                                </div>
                            </a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a class="text-center" href="#">
                                <strong>See All Alerts</strong>
                                <i class="fa fa-angle-right"></i>
                            </a>
                        </li>
                    </ul>
                    <!-- /.dropdown-alerts -->
		<!-- 	</li>-->
			<!-- /.dropdown -->
		<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
					<i class="fa fa-caret-down"></i>
		</a>
				<ul class="dropdown-menu dropdown-user">
					<!-- <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                        </li>
                        <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                        </li>
                        <li class="divider"></li>-->
					<li><a href="../../Logout"><i class="fa fa-sign-out fa-fw"></i>
							退出</a></li>
				</ul> <!-- /.dropdown-user -->
			
				</li>
			<!-- /.dropdown -->
		<!--	</ul>-->
			<!-- /.navbar-top-links -->

			<div class="navbar-default sidebar" role="navigation">
				<div class="sidebar-nav navbar-collapse">
					<ul class="nav" id="side-menu">
						<!-- <li class="sidebar-search">
                            <div class="input-group custom-search-form">
                                <input type="text" class="form-control" placeholder="搜索...">
                                <span class="input-group-btn">
                                    <button class="btn btn-default" type="button">
                                        <i class="fa fa-search"></i>
                                    </button>
                                </span>
                            </div>
                            <!-- /input-group -->
					  <!--	</li>-->
						<li><a href="index.jsp"><i class="fa fa-dashboard fa-fw"></i>
								主面板</a></li>
						  <li>
                            <a href="#"><i class="fa fa-table fa-fw"></i> 人事管理<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                            
                        <% if(req.getSession().getAttribute("position").equals("admin")){%>                                  <li>
                                    <a href="usermanagement.jsp">用户管理</a>
                                </li>
                                <li>
                                    <a href="authoritymanagement.jsp">权限管理</a>
                                </li>
                                 <li>
                                    <a href="rolemanagement.jsp">角色管理</a>
                                </li>
                                
                               <%  }%> 
                                 <li>
                                    <a href="userinformation.jsp">个人信息</a>
                                </li> 
                                  <li>
                                    <a href="modifyinformation.jsp">用户信息修改</a>
                                </li> 
                                 
                                
                            </ul>
                            <!-- /.nav-second-level -->
						<!--  </li>-->
						<li><a href="tables.jsp"><i class="fa fa-table fa-fw"></i>
								值班管理</a></li>




						<li class="active"><a href="#"><i  class="fa fa-table fa-fw"></i>工作变动管理<span class="fa arrow"></span></a>
						 <!--	<ul class="nav nav-second-level">
								<li><a class="active" href="blank.jsp">添加商品页</a></li>
								<li><a href="login.jsp">登录页</a></li>
							</ul> <!-- /.nav-second-level -->
							</li>
	
				
					<li>
                            <a href="#"><i class="fa fa-table fa-fw"></i> 配送管理<span class="fa arrow"></span></a>
						 <ul class="nav nav-second-level">
                                <li>
                                    <a href="route.jsp">配送路线</a>
                                </li>
                                <% if(req.getSession().getAttribute("position").equals("admin")){%> 
                                <li>
                                    <a href="routemanagement.jsp">配送路线管理</a>
                                </li>
                                <%} %>		
								 </ul>
								
				</li>
					<li><a href=" "><i class="fa fa-table fa-fw"></i>
								工资管理</a></li>
					<li><a href=" "><i class="fa fa-table fa-fw"></i>
								活动管理</a></li>
					</ul>
				</div>
				<!-- /.sidebar-collapse -->
			</div>
			<!-- /.navbar-static-side -->
		</nav>

		<!-- Page Content -->
		<!--<div id="page-wrapper">
			<div class="container-fluid">
				<div class="row">
					<div class="col-lg-12">
						<h1 class="page-header">添加商品</h1>
					</div>
					<!-- /.col-lg-12 -->
				</div>
				<!-- /.row -->

			<!--	<table style="">
					<tr>
						<td><br> <br> <br> <br>
							<form action="addgoods.do" method='post'>
								商品名称：<input type="text" name="gname"><br>
								<br> 商品介绍：<input type="text" name="introduction"><br>
								<br> 商品数量：<input type="text" name="quantity"><br>
								<br> 商品价格：<input type="text" name="price"><br>
								<br> 商品图片名称：<input type="file" name="picture"><br>
								<br> 商品类别：<select name="category">
									<option value="生活用品">生活用品
									<option value="水果生鲜">水果生鲜</option>
									<option value="食品饮料">食品饮料</option>
								</select><br>
								<br> <input type="submit" value="添加">
							</form> <br> <br></td>
					</tr>
				</table>
				<a href="tablegoods.jsp">查看商品信息</a>
			</div>
			<!-- /.container-fluid -->
	<!--	</div>
		<!-- /#page-wrapper -->

	<!--</div>
	<!-- /#wrapper -->
 <form id="submitForm" name="submitForm" action="  " method="post" enctype=" "> 
		<div id="container">
			<div id="sider">
				<ul id="tree" class="ztree"></ul>
			</div>
			<div id="main">
				<div id="box_border">
					<ul id="fang_type">
						<li style="width: 160px;"><span class="ui_txt_bold05">宿舍楼</span></li>
						
						<li style="background-color: #b51d1a;">起点</li>
						<li style="background-color: #000EFF;">终点</li>
						
					</ul>
				</div>
				<table class="unit-the-table table" cellspacing="0" cellpadding="0" width="100%" align="center" border="0">
					<thead ><tr>
								<th>楼区</th>				
												
											
											</tr></thead>
					<tbody>
						 
						 	<tr>
								<td style="color:#1853A1;"  width="10%"   >1层</td>
								<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">A1031</a>
										</td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">A1032</a>
										</td>
						        <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">A1041</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">A1042</a>
										</td>
							
					            <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">A1051</a>
										</td>
							<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">A1052</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A1061</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A1062</a>
										</td>
				<td  width="10" style="background-color: #000EFF"></td>
				
					<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">B1062</a>
										</td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">B1061</a>
										</td>
						        <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">B1052</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">B1051</a>
										</td>
							
					            <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">B1042</a>
										</td>
							<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">B1041</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B1032</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B1031</a>
										</td>
				
							</tr>
						 
						 	<tr>
								<td style="color:#1853A1;"  width="10%" >2层</td>
								<td width="10"  style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">A2031</a></td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">A2032</a>
										</td>
						        <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">A2051</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">A2052</a>
										</td>
					            <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">A2071</a>
										</td>
							<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">A2072</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A2091</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A2092</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A2111</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A2112</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A2131</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A2132</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A2151</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A2152</a>
										</td>											
				<td width="10" style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">2171</a>
										</td>
				<td width="10"  style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">2172</a>
										</td>
				<td width="10" style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">2191</a>
										</td>
				<td width="10"  style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">2192</a>
										</td>	
										
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">B2152</a>
										</td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">B2151</a>
										</td>
						        <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">B2132</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">B2131</a>
										</td>
							
					            <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">B2112</a>
										</td>
							<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">B2111</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B2092</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B2091</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B2072</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B2071</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B2052</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B2051</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B2032</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B2031</a>
										</td>												
	
							</tr>
							
							
			<tr>
								<td style="color:#1853A1;"  width="10%"   >2层</td>
								<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">A2042</a>
										</td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">A2041</a>
										</td>
						        <td width="10" style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">A2062</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">A2061</a>
										</td>
							
					            <td width="10"  style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">A2082</a>
										</td>
							<td width="10"  style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">A2081</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A2102</a>
										</td>
				<td width="10"  style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A2101</a>
										</td>
			<td width="10" style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A2122</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A2121</a>
										</td>
				<td width="10" style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A2142</a>
										</td>
				<td width="10"  style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A2141</a>
										</td>
				<td width="10" style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A2162</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A2161</a>
										</td>						
										
				<td width="10" style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">2182</a>
										</td>
				<td width="10"  style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">2181</a>
										</td>
										
					
								<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">B2161</a>
										</td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">B2162</a>
										</td>
						        <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">B2141</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">B2142</a>
										</td>
							
					            <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">B2121</a>
										</td>
							<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">B2122</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B2101</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B2102</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B2081</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B2082</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B2061</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B2062</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B2041</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B2042</a>
										</td>											
										
							</tr>
					<tr>
					
					<td style="color:#1853A1;"  width="10%"   >3层</td>
								<td width="10"  style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">A3031</a></td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">A3032</a>
										</td>
						        <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">A3051</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">A3052</a>
										</td>
					            <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">A3071</a>
										</td>
							<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">A3072</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A3091</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A3092</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A3111</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A3112</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A3131</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A3132</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A3151</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A3152</a>
										</td>																
										
				<td width="10" style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">3171</a>
										</td>
				<td width="10"  style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">3172</a>
										</td>
				<td width="10" style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">3191</a>
										</td>
				<td width="10"  style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">3192</a>
										</td>	
										
					<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">B3152</a>
										</td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">B3151</a>
										</td>
						        <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">B3132</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">B3131</a>
										</td>
							
					            <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">B2112</a>
										</td>
							<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">B2111</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B3092</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B3091</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B3072</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B3071</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B3052</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B3051</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B3032</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B3031</a>
										</td>							
										
										
																
							</tr>
							
							
			<tr>
								<td style="color:#1853A1;"  width="10%"   >3层</td>
								<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">A3042</a>
										</td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">A3041</a>
										</td>
						        <td width="10" style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">A3062</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">A3061</a>
										</td>
							
					            <td width="10"  style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">A3082</a>
										</td>
							<td width="10"  style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">A3081</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A3102</a>
										</td>
				<td width="10"  style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A3101</a>
										</td>
			<td width="10" style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A3122</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A3121</a>
										</td>
				<td width="10" style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A3142</a>
										</td>
				<td width="10"  style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A3141</a>
										</td>
				<td width="10" style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A3162</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A3161</a>
										</td>						
										
				<td width="10" style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">3182</a>
										</td>
				<td width="10"  style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">3181</a>
										</td>
										
					
					<td width="10"  style="background-color: #917430">		
					<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">B3161</a>
										</td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">B3162</a>
										</td>
						        <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">B3141</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">B3142</a>
										</td>
							
					            <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">B3121</a>
										</td>
							<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">B3122</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B3101</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B3102</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B3081</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B3082</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B3061</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B3062</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B3041</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B3042</a>
										</td>											
										
										
							</tr>	
					
					
					
			<tr>
			<td style="color:#1853A1;"  width="10%"   >4层</td>
								<td width="10"  style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">A4031</a></td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">A4032</a>
										</td>
						        <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">A4051</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">A4052</a>
										</td>
					            <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">A4071</a>
										</td>
							<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">A4072</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A4091</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A4092</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A4111</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A4112</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A4131</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A4132</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A4151</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A4152</a>
										</td>																
										
				<td width="10" style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">4171</a>
										</td>
				<td width="10"  style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">4172</a>
										</td>
				<td width="10" style="background-color: #000EFF">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">4191</a>
										</td>
				<td width="10"  style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">4192</a>
										</td>	
										
					<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">B4152</a>
										</td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">B4151</a>
										</td>
						        <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">B4132</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">B4131</a>
										</td>
							
					            <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">B4112</a>
										</td>
							<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">B4111</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B4092</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B4091</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B4072</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B4071</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B4052</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B4051</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B4032</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B4031</a>
										</td>							
										
										
																
							</tr>
							
							
			<tr>
								<td style="color:#1853A1;"  width="10%"   >4层</td>
								<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">A4042</a>
										</td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">A4041</a>
										</td>
						        <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">A4062</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">A4061</a>
										</td>
							
					            <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">A4082</a>
										</td>
							<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">A4081</a>
										</td>
			<td width="10" style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A4102</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A4101</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A4122</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A4121</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A4142</a>
										</td>
				<td width="10"  style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A4141</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A4162</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A4161</a>
										</td>						
										
				<td width="10" style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">4182</a>
										</td>
				<td width="10"  style="background-color: #000EFF">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">4181</a>
										</td>
					<td width="10"  style="background-color: #917430">		
					<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">B4161</a>
										</td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">B4162</a>
										</td>
						        <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">B4141</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">B4142</a>
										</td>
							
					            <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">B4121</a>
										</td>
							<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">B4122</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B4101</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B4102</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B4081</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B4082</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B4061</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B4062</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B4041</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B4042</a>
										</td>											
										
										
							</tr>			
					
					
					
				<tr>
				<td style="color:#1853A1;"  width="10%"   >5层</td>
								<td width="10"  style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">A5031</a></td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">A5032</a>
										</td>
						        <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">A5051</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">A5052</a>
										</td>
					            <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">A5071</a>
										</td>
							<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">A5072</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A5091</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A5092</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A5111</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A5112</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A5131</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A5132</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A5151</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A5152</a>
										</td>																
										
				<td width="10" style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">5171</a>
										</td>
				<td width="10"  style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">5172</a>
										</td>
				<td width="10" style="background-color: #000EFF">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">5191</a>
										</td>
				<td width="10"  style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">5192</a>
										</td>	
										
					<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">B5152</a>
										</td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">B5151</a>
										</td>
						        <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">B5132</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">B5131</a>
										</td>
							
					            <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">B5112</a>
										</td>
							<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">B5111</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B3092</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B5091</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B5072</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B5071</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B5052</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B5051</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B5032</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B5031</a>
										</td>							
										
										
																
							</tr>
							
							
			<tr>
								<td style="color:#1853A1;"  width="10%"   >5层</td>
								<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">A5042</a>
										</td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">A5041</a>
										</td>
						        <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">A5062</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">A5061</a>
										</td>
							
					            <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">A5082</a>
										</td>
							<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">A5081</a>
										</td>
			<td width="10" style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A5102</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A5101</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A5122</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A5121</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A5142</a>
										</td>
				<td width="10"  style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A5141</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A5162</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A5161</a>
										</td>						
										
				<td width="10" style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">5182</a>
										</td>
				<td width="10"  style="background-color: #000EFF">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">5181</a>
										</td>
					<td width="10"  style="background-color: #917430">		
					<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">B5161</a>
										</td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">B5162</a>
										</td>
						        <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">B5141</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">B5142</a>
										</td>
							
					            <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">B5121</a>
										</td>
							<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">B5122</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B5101</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B5102</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B5081</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B5082</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B5061</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B5062</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B5041</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B5042</a>
										</td>											
										
										
							</tr>		
					
					
					
					<tr>
					<td style="color:#1853A1;"  width="10%"   >6层</td>
								<td width="10"  style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">A6031</a></td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">A6032</a>
										</td>
						        <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">A6051</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">A6052</a>
										</td>
					            <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">A6071</a>
										</td>
							<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">A6072</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A6091</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A6092</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A6111</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A6112</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A6131</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A6132</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A6151</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A6152</a>
										</td>																
										
				<td width="10" style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">6171</a>
										</td>
				<td width="10"  style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">6172</a>
										</td>
				<td width="10" style="background-color: #000EFF">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">6191</a>
										</td>
				<td width="10"  style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">6192</a>
										</td>	
										
					<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">B6152</a>
										</td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">B6151</a>
										</td>
						        <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">B6132</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">B6131</a>
										</td>
							
					            <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">B6112</a>
										</td>
							<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">B6111</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B6092</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B6091</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B6072</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B6071</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B6052</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B6051</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B6032</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B6031</a>
										</td>							
										
										
																
							</tr>
							
							
			<tr>
								<td style="color:#1853A1;"  width="10%"   >6层</td>
								<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">A6042</a>
										</td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">A6041</a>
										</td>
						        <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">A6062</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">A3061</a>
										</td>
							
					            <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">A6082</a>
										</td>
							<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">A6081</a>
										</td>
			<td width="10" style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A6102</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A6101</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A6122</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A6121</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A6142</a>
										</td>
				<td width="10"  style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A6141</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A6162</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A6161</a>
										</td>						
										
				<td width="10" style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">6182</a>
										</td>
				<td width="10"  style="background-color: #000EFF">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">6181</a>
										</td>
					<td width="10"  style="background-color: #917430">		
					<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">B6161</a>
										</td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">B6162</a>
										</td>
						        <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">B6141</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">B6142</a>
										</td>
							
					            <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">B6121</a>
										</td>
							<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">B6122</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B6101</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B6102</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B6081</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B6082</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B6061</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B6062</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B6041</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B6042</a>
										</td>											
										
										
							</tr>	
					
					
					 	<tr>
								<td style="color:#1853A1;"  width="10%" >7层</td>
								<td width="10"  style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">A7031</a></td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">A7032</a>
										</td>
						        <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">A7051</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">A2052</a>
										</td>
					            <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">A7071</a>
										</td>
							<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">A2072</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A7091</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A7092</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A7111</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A7112</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A7131</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A7132</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A7151</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A7152</a>
										</td>											
				<td width="10" style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">7171</a>
										</td>
				<td width="10"  style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">7172</a>
										</td>
				<td width="10" style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">7191</a>
										</td>
				<td width="10"  style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">7192</a>
										</td>	
										
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">B7152</a>
										</td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">B7151</a>
										</td>
						        <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">B7132</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">B7131</a>
										</td>
							
					            <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">B7112</a>
										</td>
							<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">B7111</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B7092</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B7091</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B7072</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B2071</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B7052</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B7051</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B7032</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B7031</a>
										</td>												
	
							</tr>
							
							
			<tr>
								<td style="color:#1853A1;"  width="10%"   >7层</td>
								<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">A7042</a>
										</td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">A7041</a>
										</td>
						        <td width="10" style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">A7062</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">A7061</a>
										</td>
							
					            <td width="10"  style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">A7082</a>
										</td>
							<td width="10"  style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">A7081</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A7102</a>
										</td>
				<td width="10"  style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A7101</a>
										</td>
			<td width="10" style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A7122</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A7121</a>
										</td>
				<td width="10" style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A7142</a>
										</td>
				<td width="10"  style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A7141</a>
										</td>
				<td width="10" style="background-color: #917430">
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">A7162</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">A7161</a>
										</td>						
										
				<td width="10" style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">7182</a>
										</td>
				<td width="10"  style="background-color: #000EFF" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">7181</a>
										</td>
										
					
								<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458579642011" class="fy_table_td" style="color:#fff;">B7161</a>
										</td>
	                            <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458625716623" class="fy_table_td" style="color:#fff;">B7162</a>
										</td>
						        <td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458667159302" class="fy_table_td" style="color:#fff;">B2141</a>
										</td>
			                    <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458709870134" class="fy_table_td" style="color:#fff;">B7142</a>
										</td>
							
					            <td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458815023215" class="fy_table_td" style="color:#fff;">B7121</a>
										</td>
							<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458856106360" class="fy_table_td" style="color:#fff;">B7122</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B7101</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B7102</a>
										</td>
			<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B7081</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B7082</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B7061</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B7062</a>
										</td>
				<td width="10" style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458895470090" class="fy_table_td" style="color:#fff;">B7041</a>
										</td>
				<td width="10"  style="background-color: #917430" >
										<a href="/xngzf/archives/fangyuanRentHistory.action?fyID=14458937394501" class="fy_table_td" style="color:#fff;">B7042</a>
										</td>											
										
							</tr>		

					</tbody>
				</table>
				
			
			
		<!-- <div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header"></h1>
				</div>
				<!-- /.col-lg-12 -->
		<!-- 	</div>
			<!-- /.row -->
		<!-- 	<div class="row">

				<!-- /.row -->
			
			<!-- 	<div class="row">
					<div class="col-lg-6">
						<div class="panel panel-default">
							<div class="panel-heading"></div>
							<!-- /.panel-heading -->
				<!-- 			<div class="panel-body">
								<div class="table-responsive">
									
								
								<br><br>
								
									<table class="table table-striped table-bordered table-hover">
										<thead>
										
										
											<tr>
												<th>选择</th>
												<th>员工</th>
												<th>路线</th>
												
												<th>开始时间</th>
												<th>结束时间</th>
                                                
											</tr>
										</thead>
										<tbody>
									<%
			 //	for (int i = 0; i < blahs.size(); i++) { 
			 //	UserRoute bh = blahs.get(i);%>	 
											<tr>
												
												<td> <input type="text"  name="userNO" value="//bh.getUserNO() %>" ></td>
												<td> <input type="text"  name="routeNO" value="//bh.getRouteNO() %>" ></td>
												
													<td><input type="text"  name="starttime" value="//bh.getStarttime() %>" > </td>
												<td><input type="text"  name="finishtime"  value="//bh.getFinishtime() %>"></td>
											</tr>
										<% //}%>
			 
				
							</tbody>
									</table>
						
								</div>
								
								
								<!-- /.table-responsive -->
						<!-- 	</div>
							<!-- /.panel-body -->
						<!-- </div>
						<!-- /.panel -->
					<!-- </div>
					<!-- /.col-lg-6 -->

					<!-- /.col-lg-6 -->
			<!-- 	</div>
				</div></div>
				<!-- /.row -->

				<!-- /.panel-body -->
	
			<!-- /.panel -->

		<!-- /.col-lg-6 -->
	     <div class="row">
					<!-- /.col-lg-6 -->
				  <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                                                                           路线表
                        </div>
                        <!-- /.panel-heading -->
 			  <div class="panel-body">
                        <div class="dataTable_wrapper">
								<table class="table table-striped table-bordered table-hover"
									id="dataTables-example">
                                    <thead>
                                    
                                    
                                        <tr>
                                            <th>选择</th>
                                            <th>路线编号</th>
                                            <th>创建时间</th>
                                            <th>宿舍楼</th>
                                             <th>路线顺序</th>
                                              <th>最迟配送</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    
                                  <%  
                                  
                                  java.util.Date dt=new  	java.util.Date();
              		      		SimpleDateFormat  sdf=new  SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
              		      		String  currentTime=sdf.format(dt);	
                                  for (int i = 0; i < blahhs.size(); i++) { 
			 	                   Route bhh = blahhs.get(i);
			 	                   if(bhh.getCreatetime().substring(0,10).equals(currentTime.substring(0,10))&&bhh.getRouteNO().equals("2")){
			 	                   
			 	                   
			 	                   %>	 
                                        <tr>
                                       <td>&nbsp;&nbsp;<input type="radio"  name="check"  value="<%=bhh.getId() %>"></td>
                                       
												<td> <input type="text"  name="routeNO" value="<%=bhh.getId() %>" ></td>
												<td> <input type="text"  name="CreatetimeNO" value="<%=bhh.getCreatetime() %>" ></td>
												<td><input type="text"  name="domitory" value="<%=bhh.getDomitory() %>" > </td>
													<td><input type="text"  name="route" value="<%=bhh.getRoute() %>" > </td>
												<td><input type="text"  name="lastestDelivery"  value="<%=bhh.getLastestDelivery() %>"></td>
												                                     </tr>
										<%} }%>		                                     
												                                     
												                                     
                                       <!--  <tr>
                                            <td>2</td>
                                            <td>Jacob</td>
                                            <td>Thornton</td>
                                            <td>@fat</td>
                                        </tr>
                                        <tr>
                                            <td>3</td>
                                            <td>Larry</td>
                                            <td>the Bird</td>
                                            <td>@twitter</td>
                                        </tr> -->
                                    </tbody>
                                </table>
                            </div>
                            <!-- /.table-responsive -->
				</div>			
		</div>	</div>	</div>	
	<!-- jQuery -->
	<script src="../bower_components/jquery/dist/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="../bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="../bower_components/metisMenu/dist/metisMenu.min.js"></script>

	<!-- Custom Theme JavaScript -->
	
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
   
    <script type="text/javascript" id="sourcecode">
	$(document).ready(function(){
    getInf();
    //每1秒取一次
    setInterval(getInf, 1000*60);
    });
    function getInf() {
    //向服务器获取数据
   
    	$.post("../../AddRoute", function(data) {
			if (data==1) {
				alert("");
			} 					
		})							
	$('.scroll-pane').jScrollPane();
}
</script>
	
    
    
    
    


</body>

</html>
