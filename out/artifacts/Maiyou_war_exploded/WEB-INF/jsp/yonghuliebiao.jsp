<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/core" %>

<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html class="no-js">
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>用户管理</title>
    <%@include file="basic.jsp"%>

    <meta name="description" content="这是一个 index 页面">
    <meta name="keywords" content="index">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/assets/i/favicon.png">
    <link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath}/assets/i/app-icon72x72@2x.png">
    <meta name="apple-mobile-web-app-title" content="Amaze UI" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/amazeui.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/admin.css">
    <%--<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>--%>
    <%--<script src="${pageContext.request.contextPath}/assets/js/app.js"></script>--%>

</head>

</head>

<body>
<header class="am-topbar admin-header">
    <div class="am-topbar-brand"><img src="${pageContext.request.contextPath}/assets/i/logo.png"></div>

    <div class="am-collapse am-topbar-collapse" id="topbar-collapse">
        <ul class="am-nav am-nav-pills am-topbar-nav admin-header-list">

            <li class="am-dropdown tognzhi" data-am-dropdown>

            </li>

            <li class="kuanjie">

                <c:if test="${loginAdmin.adminRank eq '1'}">
                    <a >套餐管理</a>
                </c:if>
                <c:if test="${loginAdmin.adminRank eq '2'}">
                    <a href="${pageContext.request.contextPath}/orderForm/orderFormList?pageNum=1&pageSize=8">订单管理</a>
                    <a >酒店管理</a>
                    <a >套餐管理</a>
                </c:if>
                <c:if test="${loginAdmin.adminRank eq '3'}">
                    <a href="${pageContext.request.contextPath}/user/toUser?pageNum=1&pageSize=8">用户列表</a>
                    <a href="${pageContext.request.contextPath}/admin/queryAllAdmin?pageNum=1&pageSize=8">权限管理</a>
                    <a href="${pageContext.request.contextPath}/orderForm/orderFormList?pageNum=1&pageSize=8">订单管理</a>
                    <a >酒店管理</a>
                    <a href="${pageContext.request.contextPath}/meal/tomeal?pageNum=1&pageSize=8">套餐管理</a>
                </c:if>
            </li>

            <li class="soso">

                <p>

                    <select data-am-selected="{btnWidth: 70, btnSize: 'sm', btnStyle: 'default'}">
                        <option value="b">全部</option>
                        <option value="o">用户</option>
                        <option value="o">订单</option>

                    </select>

                </p>

                <p class="ycfg"><input type="text" class="am-form-field am-input-sm" placeholder="搜索" /></p>
                <p><button class="am-btn am-btn-xs am-btn-default am-xiao"><i class="am-icon-search"></i></button></p>
            </li>

            <li class="am-hide-sm-only" style="float: right;"><a href="javascript:;" id="admin-fullscreen"><span class="am-icon-arrows-alt"></span> <span class="admin-fullText">开启全屏</span></a></li>
        </ul>
    </div>
</header>

<div class="am-cf admin-main">

    <div class="nav-navicon admin-main admin-sidebar">


        <div class="sideMenu am-icon-dashboard" style="color:#aeb2b7; margin: 10px 0 0 0;"> 欢迎:${loginAdmin.adminName}</div>
        <div class="sideMenu">
            <c:if test="${loginAdmin.adminRank eq '3'}">
                <div id="yonghu">
                    <h3 class="am-icon-flag"><em></em> <a href="${pageContext.request.contextPath}/user/toUser?pageNum=1&pageSize=3">用户列表</a></h3>
                    <h3 class="am-icon-flag"><em></em> <a href="${pageContext.request.contextPath}/admin/queryAllAdmin?pageNum=1&pageSize=3">权限管理</a></h3>
                </div>
                <div id="dingdan">
                    <h3 class="am-icon-cart-plus"><em></em> <a href="${pageContext.request.contextPath}/orderForm/orderFormList?pageNum=1&pageSize=3"> 订单管理</a></h3>
                </div>
                <div id="jiudian">
                    <h3 class="am-icon-users"><em></em> <a href="#">酒店管理</a></h3>
                </div>
                <div id="taocan">
                    <h3 class="am-icon-volume-up"><em></em> <a href="${pageContext.request.contextPath}/meal/tomeal?pageNum=1&pageSize=8">套餐管理</a></h3>
                </div>
            </c:if>
            <c:if test="${loginAdmin.adminRank eq '2'}">
                <div id="dingdan">
                    <h3 class="am-icon-cart-plus"><em></em> <a href="${pageContext.request.contextPath}/orderForm/orderFormList?pageNum=1&pageSize=3"> 订单管理</a></h3>
                </div>
                <div id="jiudian">
                    <h3 class="am-icon-users"><em></em> <a href="#">酒店管理</a></h3>
                </div>
                <div id="taocan">
                    <h3 class="am-icon-volume-up"><em></em> <a href="${pageContext.request.contextPath}/meal/tomeal?pageNum=1&pageSize=8">套餐管理</a></h3>
                </div>
            </c:if>

            <c:if test="${loginAdmin.adminRank eq '1'}">
                <div id="taocan">
                    <h3 class="am-icon-volume-up"><em></em> <a href="${pageContext.request.contextPath}/meal/tomeal?pageNum=1&pageSize=8">套餐管理</a></h3>
                </div>
            </c:if>

        </div>
        <!-- sideMenu End -->



        <%--<script type="text/javascript">--%>
            <%--jQuery(".sideMenu").slide({--%>
                <%--titCell:"h3", //鼠标触发对象--%>
                <%--targetCell:"ul", //与titCell一一对应，第n个titCell控制第n个targetCell的显示隐藏--%>
                <%--effect:"slideDown", //targetCell下拉效果--%>
                <%--delayTime:300 , //效果时间--%>
                <%--triggerTime:150, //鼠标延迟触发时间（默认150）--%>
                <%--defaultPlay:true,//默认是否执行效果（默认true）--%>
                <%--returnDefault:true //鼠标从.sideMen移走后返回默认状态（默认false）--%>
            <%--});--%>
        <%--</script>--%>


    </div>
    <!-- sideMenu End -->

    <%--<script type="text/javascript">--%>
        <%--jQuery(".sideMenu").slide({--%>
            <%--titCell:"h3", //鼠标触发对象--%>
            <%--targetCell:"ul", //与titCell一一对应，第n个titCell控制第n个targetCell的显示隐藏--%>
            <%--effect:"slideDown", //targetCell下拉效果--%>
            <%--delayTime:300 , //效果时间--%>
            <%--triggerTime:150, //鼠标延迟触发时间（默认150）--%>
            <%--defaultPlay:true,//默认是否执行效果（默认true）--%>
            <%--returnDefault:true //鼠标从.sideMen移走后返回默认状态（默认false）--%>
        <%--});--%>
    <%--</script>--%>


</div>
<%--列表表头--%>
<div class=" admin-content">

    <div class="daohang">
    </div>


    <div class="am-popup am-popup-inner" id="my-popup">

        <div class="am-popup-hd">
            <h4 class="am-popup-title">添加商品一级分类</h4>
            <span data-am-modal-close
                  class="am-close">&times;</span>
        </div>
        <div class="am-popup-bd">
        </div>

    </div>

    <div class="am-popup am-popup-inner" id="my-popups">

        <div class="am-popup-hd">
            <h4 class="am-popup-title">修改栏目名称</h4>
            <span data-am-modal-close
                  class="am-close">&times;</span>
        </div>

        <div class="am-popup-bd">
        </div>
    </div>
    <div class="admin-biaogelist">
        <div class="listbiaoti am-cf">
            <ul class="am-icon-users">用户管理</ul>
            <dl class="am-icon-home" style="float: right;">当前位置： 首页 > <a href="#">用户列表</a></dl>
            <!--这里打开的是新页面-->
        </div>

        <form class="am-form am-g">
            <table width="100%" class="am-table am-table-bordered am-table-radius am-table-striped">
                <thead>
                <tr class="am-success">
                    <th></th>
                    <th class="table-id">ID</th>
                    <th class="table-title">用户名称</th>
                    <th class="table-type">昵称</th>
                    <th class="table-author am-hide-sm-only">手机号码</th>
                    <th width="250px" class="table-set">操作</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>

                    <c:forEach items="${pageInfo.list}" var="user">
                        <tr>
                            <td width="5%"><input type="checkbox" name="id" value="${user.id}"></td>
                            <td width="10%">${user.id}</td>
                            <td width="20%">${user.userName}</td>
                            <td width="20%">${user.nickName}</td>
                            <td width="20%">${user.phone}</td>
                    <td>
                    <div class="am-btn-toolbar">
                        <div class="am-btn-group am-btn-group-xs">
                            <button type="button" name="queryUserButton" no="${user.id}">详情</button>
                            <button type="button" name="querydeleteButton" no="${user.id}">删除</button>
                            <button type="button" name="queryUpdateButton" no="${user.id}">重置密码</button>
                        </div>
                    </div>
                    </td>
                    </td>
                </tr>
                    </c:forEach>
                </tr>
                </tbody>
            </table>
            <%--<ul class="am-pagination am-fr">--%>
                <%--<li class="am-disabled"><a href="#">«</a></li>--%>
                <%--<li class="am-active"><a href="#">1</a></li>--%>
                <%--<li><a href="#">2</a></li>--%>
                <%--<li><a href="#">3</a></li>--%>
                <%--<li><a href="#">4</a></li>--%>
                <%--<li><a href="#">5</a></li>--%>
                <%--<li><a href="#">»</a></li>--%>
            <%--</ul>--%>


            <hr/>
        </form>

        <%@include file="page.jsp"%>
        <div class="foods">
            <ul>
                @2015. 迈游收集自 <a href="#" target="_blank" title="迈游旅游网">迈游旅游网</a> -  More Templates<a href="#" title="迈游旅游网" target="_blank">迈游旅游网</a>
            </ul>
            <dl>
                <a href="" title="返回头部" class="am-icon-btn am-icon-arrow-up"></a>
            </dl>
        </div>

    </div>

</div>
</div>

</div>


<!--[if lt IE 9]>
<!--<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>-->
<%--<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>--%>
<%--<script src="assets/js/polyfill/rem.min.js"></script>--%>
<%--<script src="assets/js/polyfill/respond.min.js"></script>--%>
<%--<script src="assets/js/amazeui.legacy.js"></script>--%>
<![endif]-->

<!--[if (gte IE 9)|!(IE)]><!-->
<%--<script src="${pageContext.request.contextPath}/assets/js/amazeui.min.js"></script>--%>
<!--<![endif]-->
<!--用户详情模态框-->
<div class="modal fade" tabindex="-1" role="dialog" id="queryUserModal">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">用户详情</h4>
            </div>
            <div class="modal-body">
                <form action="" id="queryUserForm">
                    <table class="table table-bordered">
                        <tr>
                            <td style="width: 220px">用户名称：</td>
                            <td>
                                <div id="userNameDiv"></div>
                            </td>
                        </tr>
                        <tr>
                            <td>用户昵称：</td>
                            <td>
                                <div id="nickNameDiv"></div>
                            </td>
                        </tr>
                        <tr>
                            <td>手机号码：</td>
                            <td>
                                <div id="phoneDiv"></div>
                            </td>
                        </tr>
                    </table>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
<div class="modal fade" tabindex="-1" role="dialog" id="queryUserModal">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">用户详情</h4>
            </div>
            <div class="modal-body">
                <form action="" id="UpdateUserForm">
                    <table class="table table-bordered">
                        <tr>
                            <td style="width: 220px">用户名称：</td>
                            <td>
                                <div id="updateUserDiv"></div>
                            </td>
                        </tr>

                    </table>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->
</body>
<script type="text/javascript">

    $(function () {
        $("button[name=queryUserButton]").click(function () {
            var userId = $(this).attr("no");
            var url="${pageContext.request.contextPath}/user/queryUserById";
            $.get(url,{"id":userId},function (data) {

                $("#userNameDiv").html(data.userName);
                $("#nickNameDiv").html(data.nickName);
                $("#phoneDiv").html(data.phone);
            })
            $("#queryUserModal").modal("show");
        });
        $("button[name=queryUpdateButton]").click(function () {
            alert("是否要重置？");
            var userId = $(this).attr("no");
            alert("操作成功");
            var url="${pageContext.request.contextPath}/user/updateUserById";
            $.post(url,{"id":userId}),function (data) {
            }
        })
        $("button[name=querydeleteButton]").click(function () {
            var userId=$(this).attr("no");
            var url="${pageContext.request.contextPath}/user/deleteUserById";
            $.get(url,{"id":userId},function (data) {
                alert(data.msg);
                //刷新当前页
                location.href = location.href;
            });
        })
    })
</script>
</html>
