<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/13
  Time: 18:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>后台模板</title>
    <link rel="stylesheet" href="assets/css/amazeui.css"/>
    <link rel="stylesheet" href="assets/css/core.css"/>
    <link rel="stylesheet" href="assets/css/menu.css"/>
    <link rel="stylesheet" href="assets/css/index.css"/>
    <link rel="stylesheet" href="assets/css/admin.css"/>
    <link rel="stylesheet" href="assets/css/page/typography.css"/>
    <link rel="stylesheet" href="assets/css/page/form.css"/>
    <link rel="stylesheet" href="assets/css/component.css"/>
    <style>
        .top {
            margin-right: auto;
            margin-left: auto;
            width: 1500px;
            height: 311px;
        }
    </style>
</head>
<body>
<div class="top">

    <div class="admin">
        <div >
            <!-- Start content -->
            <div >
                <div class="am-g">


                    <!-- col start -->
                    <div class="am-u-md-8">
                        <div class="card-box">
                            <h4 class="header-title m-t-0 m-b-30" style="align:center">新增角色</h4>

                            <div class="am-scrollable-horizontal am-text-ms" style="font-family: '微软雅黑';">
                                <table class="am-table am-text-nowrap">
                                    <thead>
                                    <tr>
                                        <th>
                                           <table class="am-table am-text-nowrap">
                                            <tbody>
                                            <thead>
                                    <tr>
                                        <th>角色名字：</th>
                                        <td><input type="text" name="roleName" id="roleName"></td>
                                    </tr>
                                    </thead>
                                    </tbody>
                                    <tbody>
                                    <tr>
                                        <th>角色描述：</th>
                                        <td><input type="text" name="roleDepict" id="roleDepict"></td>

                                    </tr>
                                    </tbody>
                                </table>

                                </th>
                                </tr>
                                </thead>
                                </table>
                                <form name="form1" method="post" action="">
                                    <table width="357" border="0" cellspacing="0" cellpadding="0">
                                        <tr>
                                            <td width="353" align="right"><input type="submit" name="button" id="button"
                                                                                 value="新增"></td>
                                        </tr>
                                    </table>
                                </form>
                            </div>
                        </div>
                    </div>
                    <!-- col end -->
                </div>
                <!-- Row end -->


            </div>
        </div>
    </div>
</div>
</div >
<!-- navbar -->
<a href="admin-offcanvas" class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu"
   data-am-offcanvas="{target: '#admin-offcanvas'}"><!--<i class="fa fa-bars" aria-hidden="true"></i>--></a>

<script type="text/javascript" src="assets/js/jquery-2.1.0.js"></script>
<script type="text/javascript" src="assets/js/amazeui.min.js"></script>
<script type="text/javascript" src="assets/js/app.js"></script>
<script type="text/javascript" src="assets/js/blockUI.js"></script>
<script type="text/javascript" src="assets/js/charts/echarts.min.js"></script>
<script type="text/javascript" src="assets/js/charts/indexChart.js"></script>

</body>

</html>
