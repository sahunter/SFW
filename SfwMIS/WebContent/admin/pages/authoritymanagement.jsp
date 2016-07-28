<%@ page import="hrm.model.*,java.util.List" language="java"
	language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

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
	rel="styleshejava.lang.ArrayIndexOutOfBoundsException: 1et">

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
	text{
		border:none;
	}
</style>

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
				<a class="navbar-brand" href="index.jsp">送饭网系统</a>
			</div>
			<!-- /.navbar-header -->

			<!--   <ul class="nav navbar-top-links navbar-right">
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
			<!--  </li>
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
		<!--	</li>-->
			<!-- /.dropdown -->
			<!--   <li class="dropdown">
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
			<!--   </li>
                <!-- /.dropdown -->
                
                
            <ul>  
                
			<li class="dropdown"><a class="dropdown-toggle"
				data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
					<i class="fa fa-caret-down"></i>
			</a>
				<ul class="dropdown-menu dropdown-user">
					<!--          <li><a href="#"><i class="fa fa-user fa-fw"></i> User Profile</a>
                        </li>
                        <li><a href="#"><i class="fa fa-gear fa-fw"></i> Settings</a>
                        </li>
                        <li class="divider"></li> -->
					<li><a href="../../Logout"><i class="fa fa-sign-out fa-fw"></i>
							退出</a></li>
				</ul> <!-- /.dropdown-user --></li>
			<!-- /.dropdown -->
			</ul>
			<!-- /.navbar-top-links -->

<%									//?????????????
     WebService userService = (WebService) getServletContext().getAttribute("userService");
     RoleAuthority blah = new RoleAuthority();
     List<RoleAuthority> blahs = userService.getRoleAuthoritys(blah);
     Authority blahh = new Authority();
     List<Authority> blahhs = userService.getAuthoritys(blahh);
     
     UserAuthority blahhh = new UserAuthority();
     List<UserAuthority> blahhhs = userService.getUserAuthoritys(blahhh);
     HttpServletRequest req = (HttpServletRequest) request; 
	 %> 

			<div class="navbar-default sidebar" role="navigation">
				<div class="sidebar-nav navbar-collapse">
					<ul class="nav" id="side-menu">
						<!--    <li class="sidebar-search">
                            <div class="input-group custom-search-form">
                                <input type="text" class="form-control" placeholder="Search...">
                                <span class="input-group-btn">
                                <button class="btn btn-default" type="button">
                                    <i class="fa fa-search"></i>
                                </button>
                            </span>
                            </div>
                            <!-- /input-group -->
						<!--   </li>-->
						<li><a href="index.jsp"><i class="fa fa-dashboard fa-fw"></i>主面板</a>
						</li>
					    <li>
                            <a href="#"><i class="fa fa-table fa-fw"></i>人事管理<span class="fa arrow"></span></a>
                            <ul class="nav nav-second-level">
                            
                       
                                <li>
                                    <a href="usermanagement.jsp">用户管理</a>
                                </li>
                                <li>
                                    <a href="authoritymanagement.jsp">权限管理</a>
                                </li>
                                   <li>
                                    <a href="rolemanagement.jsp">角色管理</a>
                                </li>
                                
                            
                                  <li>
                                    <a href="userinformation.jsp">个人信息</a>
                                </li> 
                               <li>
                                    <a href="modifyinformation.jsp">用户信息修改</a>
                                </li>   
                                
                            </ul>
                            <!-- /.nav-second-level -->
						<!--  </li>-->
						<li><a href=""><i class="fa fa-table fa-fw"></i>
								值班管理</a></li>





						<li><a href="#"><i class="fa fa-table fa-fw"></i> 工作变动管理<span
								class="fa arrow"></span></a>
						<!--	<ul class="nav nav-second-level">
								<!-- <li>
                                    <a href="blank.jsp">空白页</a>
                                </li>-->
								<!--<li><a href="login.jsp">登录页</a></li>
							</ul> <!-- /.nav-second-level --></li>
					<!--</ul> -->
					
					<li>
                            <a href="#"><i class="fa fa-table fa-fw"></i> 配送管理<span class="fa arrow"></span></a>
						 <ul class="nav nav-second-level">
                                <li>
                                    <a href="。。/../AddRoute">配送路线</a>
                                </li>
                                <li>
                                    <a href="routemanagement.jsp">配送路线管理</a>
                                </li>		
								 </ul>
								
								</li>
								
					<li><a href=" "><i class="fa fa-table fa-fw"></i>
								工资管理</a></li>
					
					<li><a href=" "><i class="fa fa-table fa-fw"></i>
								活动管理</a></li>
					
				</div>
				<!-- /.sidebar-collapse -->
			</div>
			<!-- /.navbar-static-side -->
		</nav>

		

		<div id="page-wrapper">
			<div class="row">
				<div class="col-lg-12">
					<h1 class="page-header">权限管理</h1>
				</div>
				<!-- /.col-lg-12 -->
			</div>
			<!-- /.row -->
		
				<!-- /.row -->

				<!-- /.row -->
				
				
				
								
				<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading"><strong></strong></div>
						<form  name="form4"  method="post">
			<input name="add1" type="button"  id="add1"  class="Common"   onclick="form4.action='../../AddRoleAuthority';form4.submit()"  value="新增"/>
								
								<input  name="update1" type="button"  id="update1"  class="Common"   onclick="form4.action='../../UpdateRoleAuthority';form4.submit()"  value="修改"/>
								
								<input  name="delete1" type="button"  id="delete1"  class="Common"   onclick="form4.action='../../DeleteRoleAuthority';form4.submit()"  value="删除"/>
								
								<br><br>
			          	<div class="panel-body">
							<div class="dataTable_wrapper">
								<table class="table table-striped table-bordered table-hover"
									id="dataTables-example">
										<thead>
											<tr>
												<th>选择</th>
												<th>角色编号</th>
												<th>权限编号</th>
												<th>权限名称</th>
											
												<th>最后修改时间</th>
											</tr>
										</thead>
										<tbody>

										<%
			 	for (int i = 0; i < blahs.size(); i++) { 
			 		RoleAuthority bh = blahs.get(i);%>
			 		
			 		
										
											 <tr>
												<td>&nbsp;&nbsp;<input type="radio"  name="check"  value="<%=bh.getId() %>"></td>
											<input type="hidden"  name="Id1"  value="<%=bh.getId()%>">
												<td> <input type="text"  name="roleNO" value="<%=bh.getRoleNO() %>" ></td>
												<td> <input type="text"  name="authorityNO" value="<%=bh.getAuthorityNO() %>" ></td>
												<td><input type="text"  name="kind" value="<%=bh.getKind() %>" > </td>
												
												<td><input type="text"  name="createtime"  value="<%=bh.getCreatetime() %>"></td>
											</tr>
										<% }%>
											<tr>
												<td>&nbsp;&nbsp;<input type="radio"  name="" value="" ></td>
												<td> <input type="text"  name="add"></td>
												<td> <input type="text"  name="add"></td>
												<td><input type="text"  name="add"> </td>
											
												<td></td>
											</tr>
											<!--    <tr>
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
                                        </tr>-->
										</tbody>
									</table>
									
									
								</div>
								<!-- /.table-responsive -->
							</div>
						
							<!-- /.panel-body -->
							</form>	
							
						</div>
						<!-- /.panel -->
						
					   
						
						
					</div>
					
					</div>
				
					
					<!-- /.col-lg-6 -->
					<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading"><strong></strong></div>
				 
					<form  name="form5"  method="post">
			<input name="add2" type="button"  id="add2"  class="Common"   onclick="form5.action='../../AddUserAuthority';form5.submit()"  value="新增"/>
								
								<input  name="update2" type="button"  id="update2"  class="Common"   onclick="form5.action='../../UpdateUserAuthority';form5.submit()"  value="修改"/>
								
								<input  name="delete2" type="button"  id="delete2"  class="Common"   onclick="form5.action='../../DeleteUserAuthority';form5.submit()"  value="删除"/>
								
								<br><br>
                
                        <!-- /.panel-heading -->
                     
                        
						<div class="panel-body">
							<div class="dataTable_wrapper">
								<table class="table table-striped table-bordered table-hover"
									id="dataTables-example">
                                    <thead>
                                    
                                    <tr>
                                            <th>选择&nbsp;</th>
                                            <th>用户编号 </th>
                                            <th>权限编号</th>
                                            <th>权限名称</th>
                                       
                                            
                                            <th>创建时间</th>
                                       
                                        </tr>
                                   
                                        
                                    </thead>
                                    <tbody>
                                    
                                      <%
			 	for (int i = 0; i < blahhhs.size(); i++) { 
			 		UserAuthority bhhh = blahhhs.get(i);%>    
                                    
                                        <tr>
                                          <td>&nbsp;&nbsp;<input type="radio"  name="check"  value="<%=bhhh.getId()  %>"></td>
                                          <input type="hidden"  name="Id"  value="<%=bhhh.getId()%>">
												<td> <input type="text"  name="userNO" value="<%=bhhh.getUserNO() %>" ></td>
												<td> <input type="text"  name="authorityNO" value="<%=bhhh.getAuthorityNO() %>" ></td>
												<td><input type="text"  name="kind" value="<%=bhhh.getKind() %>" > </td>
											
											
												<td><input type="text"  name="createtime"  value="<%=bhhh.getCreatetime() %>"></td>
                                        </tr>
                                        
                              <% }%>        
                                     <tr>
                                          <td>&nbsp;&nbsp;<input type="radio"  name="" value="" ></td>
												<td> <input type="text"  name="add"></td>
												<td> <input type="text"  name="add"  ></td>
											    <td><input type="text" name="add"  /></td>
											
												<td></td>
                                        </tr>
                                        
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
				
				<!-- /.panel-body -->
			
			
			</form>
			</div>
			<!-- /.panel -->
			
			
		</div>
		<!-- /.col-lg-6 -->
	</div>
	<!-- /.row -->
 	<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading"><strong></strong></div>						<!-- http://localhost:8080/SfwMIS/admin -->
                <form  name="form6"  method="post">
			<input name="add" type="button"  id="add"  class="Common"   onclick="form6.action='../../AddAuthority';form6.submit()"  value="新增"/>
								
		<input  name="update" type="button"  id="update"  class="Common"   onclick="form6.action='../../UpdateAuthority';form6.submit()"  value="修改"/>
								
	<input  name="delete" type="button"  id="delete"  class="Common"   onclick="form6.action='../../DeleteAuthority';form6.submit()"  value="删除"/>
								
								<br><br>
                 
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            
                        </div>
                        <!-- /.panel-heading -->
                       
 <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-hover">
                                    <thead>
                                        <tr>
                                           <th>选择</th>
                                            <th>权限编号</th>
                                            <th>权限名称</th>
                                             <th>权限描述</th>
                                          
                                            <th>最后修改时间</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    
                                   <%
			 	for (int i = 0; i < blahhs.size(); i++) { 
			 		Authority bhh = blahhs.get(i);%>    
                                    
                                        <tr>
                                          <td>&nbsp;&nbsp;<input type="radio"  name="check"  value="<%=bhh.getAuthorityNO()  %>"></td>
												<td> <input type="text"  name="authorityNO" value="<%=bhh.getAuthorityNO() %>" readonly></td>
												<td> <input type="text"  name="authorityName" value="<%=bhh.getAuthorityName() %>" ></td>
												<td> <input type="text"  name="authorityDescription" value="<%=bhh.getAuthorityDescription() %>" ></td>
												
												<td><%=bhh.getCreatetime() %></td>
                                        </tr>
                                        
                              <% }%>          
                                    
                                    
                                        <tr>
                                             <td><input type="radio"  name=""  value=""></td>
												
												<td><input type="text"  name="add"  > </td>
												<td><input type="text"  name="add"  > </td>
												
                                         <td><input type="text"  name="add"  ></td>
                                            <td></td>
                                         
                                        </tr>
                                        <!-- <tr>
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
                                        </tr>-->
	
                                    </tbody>
                                </table>
                                
                              
                            </div>
                            <!-- /.table-responsive -->
	</div>
	
	<!-- /.panel-body -->
	</div>
	<!-- /.panel -->
	
	</form>
	</div>
	<!-- /.col-lg-6 -->
	<!--   <div class="col-lg-6">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Context Classes
                        </div>
                        <!-- /.panel-heading -->
	<!--    <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table">
                                    <thead>
                                        <tr>
                                            <th>#</th>
                                            <th>First Name</th>
                                            <th>Last Name</th>
                                            <th>Username</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <tr class="success">
                                            <td>1</td>
                                            <td>Mark</td>
                                            <td>Otto</td>
                                            <td>@mdo</td>
                                        </tr>
                                        <tr class="info">
                                            <td>2</td>
                                            <td>Jacob</td>
                                            <td>Thornton</td>
                                            <td>@fat</td>
                                        </tr>
                                        <tr class="warning">
                                            <td>3</td>
                                            <td>Larry</td>
                                            <td>the Bird</td>
                                            <td>@twitter</td>
                                        </tr>
                                        <tr class="danger">
                                            <td>4</td>
                                            <td>John</td>
                                            <td>Smith</td>
                                            <td>@jsmith</td>
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
	<!-- /.col-lg-6 -->
	</div>
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
