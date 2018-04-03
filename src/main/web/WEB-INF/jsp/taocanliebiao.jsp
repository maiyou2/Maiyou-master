<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html class="no-js">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>套餐管理</title>

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
    <meta http-equiv="Content-Type" content="multipart/form-data; charset=utf-8" />
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
                    <a href="${pageContext.request.contextPath}/meal/tomeal?pageNum=1&pageSize=3">套餐管理</a>
                </c:if>
                <c:if test="${loginAdmin.adminRank eq '2'}">
                    <a href="${pageContext.request.contextPath}/orderForm/orderFormList?pageNum=1&pageSize=3">订单管理</a>
                    <a >酒店管理</a>
                    <a href="${pageContext.request.contextPath}/meal/tomeal?pageNum=1&pageSize=3">套餐管理</a>
                </c:if>
                <c:if test="${loginAdmin.adminRank eq '3'}">
                    <a href="${pageContext.request.contextPath}/user/toUser?pageNum=1&pageSize=3">用户列表</a>
                    <a href="${pageContext.request.contextPath}/admin/queryAllAdmin?pageNum=1&pageSize=3">权限管理</a>
                    <a href="${pageContext.request.contextPath}/orderForm/orderFormList?pageNum=1&pageSize=3">订单管理</a>
                    <a >酒店管理</a>
                    <a href="${pageContext.request.contextPath}/meal/tomeal?pageNum=1&pageSize=3">套餐管理</a>
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
                    <h3 class="am-icon-volume-up"><em></em> <a href="${pageContext.request.contextPath}/meal/tomeal?pageNum=1&pageSize=3">套餐管理</a></h3>
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
                    <h3 class="am-icon-volume-up"><em></em> <a href="${pageContext.request.contextPath}/meal/tomeal?pageNum=1&pageSize=3">套餐管理</a></h3>
                </div>
            </c:if>

            <c:if test="${loginAdmin.adminRank eq '1'}">
                <div id="taocan">
                    <h3 class="am-icon-volume-up"><em></em> <a href="${pageContext.request.contextPath}/meal/tomeal?pageNum=1&pageSize=3">套餐管理</a></h3>
                </div>
            </c:if>

        </div>
        <%--<!-- sideMenu End -->--%>

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
    <%--<!-- sideMenu End -->--%>

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







    <div class="admin-biaogelist">

        <div class="listbiaoti am-cf">
            <ul class="am-icon-users">套餐管理</ul>
            <ul>
                <input id="addTaoCanButton1" type="button" value="增加套餐" no="111"/>
            </ul>
            <dl class="am-icon-home" style="float: right;">当前位置： 首页 > <a href="#">套餐列表</a></dl>


            <!--这里打开的是新页面-->













        </div>















        <form class="am-form am-g">
            <table width="100%" class="am-table am-table-bordered am-table-radius am-table-striped">
                <thead>
                <tr class="am-success">
                    <th class="table-check"><input type="checkbox" /></th>

                    <th class="table-id">套餐ID</th>
                    <th class="table-title">套餐名称</th>
                    <th class="table-title">价格</th>
                    <th class="table-type">套餐描述</th>
                    <th class="table-type">时间</th>
                    <th class="table-title">酒店</th>
                    <th class="table-title">机票</th>
                    <th class="table-set">操作</th>
                </tr>
                </thead>

                <c:forEach items="${pageInfo.list}" var="Meal">
                    <%--<tr>--%>
                        <%--<th>--%>
                            <%--<input type="checkbox"name="mealid" value="${Meal.mealid}"/>--%>
                        <%--</th>--%>
                        <%--&lt;%&ndash;<td>${Meal.meal}</td>&ndash;%&gt;--%>
                        <%--&lt;%&ndash;<td>${Meal.mealhotel}</td>&ndash;%&gt;--%>
                        <%--<td>--%>
                            <%--&lt;%&ndash;<fmt:formatDate value="${Meal.mealsettime}" pattern="yyyy-MM-dd"></fmt:formatDate>&ndash;%&gt;--%>
                        <%--</td>--%>
                        <%--<td>--%>

                        <%--</td>--%>

                    <%--</tr>--%>
                    <tr>
                        <th>
                            <input type="checkbox"name="mealid">
                        </th>
                        <td>${Meal.mealid}</td>
                        <td>${Meal.meal}</td>

                        <td>${Meal.mealprice}</td>
                        <td>${Meal.mealxiang}</td>
                        <td>
                            <%--<fmt:formatDate value="${Meal.mealsettime}" pattern="yyyy-MM-dd"></fmt:formatDate>--%>
                            ${Meal.mealsettime}
                        </td>
                        <td>${Meal.mealhotel}</td>
                        <td>${Meal.mealair}</td>
                        <th>
                            <input type="button"  name="deleteGradeById" mealid="${Meal.mealid}" value="删除"></input>
                        </th>
                    </tr>
                </c:forEach>
            </table>


            <hr />
        </form>
        <%--<fmt:formatDate value="${Meal.mealsettime}" pattern="yyyy-MM-dd"></fmt:formatDate>--%>



        <%--c 分页--%>

        <div>
            <%@include file="page.jsp"%>
        </div>
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



</body>
<%--新增--%>
<div class="modal fade" tabindex="-1" role="dialog" id="addTaoCanModel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title">新增套餐</h4>
            </div>
            <div class="modal-body">
                <form class="am-form tjlanmu" id="addFrom" action="${pageContext.request.contextPath}/meal/addMeal" method="post" enctype="multipart/form-data">
                    <div class="form-group">
                        <label >套餐名称：</label>
                        <input type="text" class="form-control"  placeholder="套餐名称" name="meal">
                    </div>
                    <div class="form-group">
                        <label >套餐酒店：</label>
                        <input type="text" class="form-control"  placeholder="酒店名称" name="meal_hotel">
                    </div>
                    <div class="form-group">
                        <label >套餐价格：</label>
                        <input type="text" class="form-control"  name="meal_price">
                    </div>
                    <div class="form-group">
                        <label >套餐机票：</label>
                        <input type="text" class="form-control"  name="meal_air">
                    </div>
                    <div class="form-group">
                        <label >下单时间：</label>
                        <input type="text" class="form-control"  name="meal_settime">
                    </div>
                    <div class="form-group">
                        <label >套餐图片：</label>
                        <input type="file" class="form-control"  name="myFiles">
                    </div>
                    <div class="form-group">
                        <label >套餐详情：</label>
                        <input type="text" class="form-control"  name="meal_xiang">
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary" id="addTaoCanButton">保存</button>
            </div>
        </div><!-- /.modal-content -->
    </div>
</div>迷你版，，


<%--添加--%>
<script type="text/javascript">
    $(function () {
       $("#addTaoCanButton").click(function () {
           $("#addFrom").submit();

       })
    })
</script>
<script type="text/javascript">
    $(function () {
        $("#addTaoCanButton1").click(function () {
            $("#addTaoCanModel").modal("show");
        })
    })
</script>

<script type="text/javascript">
    $(function () {
        $("input[name=deleteGradeById]").click(function () {
            var  mealid=$(this).attr("mealid");
            var url="${pageContext.request.contextPath}/meal/deleteGradeById";
            $.post(url,{"mealid":mealid},function (data) {
                alert(data.msg);
                location.href=location.href;
            })
        })
    })
</script>
假删除
<script type="text/javascript">
    <%--$(function () {--%>
        <%--$("input[name=deleteAdminButton]").click(function () {--%>
            <%--var mealid=$(this).attr("mealid");--%>
            <%--var url="${pageContext.request.contextPath}/meal/deleteGradeById";--%>
            <%--$.get(url,{"mealid":mealid},function (data) {--%>
                <%--alert(data.msg);--%>
                <%--location.href=location.href;--%>
            <%--})--%>

        <%--})--%>

    <%--})--%>

    <%--$(function () {--%>
        <%--$("button[name=deleteGradeButton]").click(function () {--%>
            <%--var gradeId=$(this).attr("gradeId");--%>
            <%--var url="${pageContext.request.contextPath}/grade/delete";--%>
            <%--$.get(url,{"gradeId":gradeId},function (data) {--%>
                <%--alert(data.msg);--%>
                <%--//刷新当前页--%>
                <%--location.href = location.href;--%>
            <%--});--%>
        <%--})--%>
    <%--})--%>


<%--&lt;%&ndash;详情&ndash;%&gt;--%>
<%--<div class="modal fade" tabindex="-1" role="dialog" id="queryAdminModel">--%>
    <%--<div class="modal-dialog" role="document">--%>
        <%--<div class="modal-content">--%>
            <%--<div class="modal-header">--%>
                <%--<button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>--%>
                <%--<h4 class="modal-title">权限详情</h4>--%>
            <%--</div>--%>
            <%--<div class="modal-body">--%>
                <%--<form action="" id="queryAdminForm">--%>
                    <%--<table class="table table-bordered">--%>
                        <%--<tr>--%>
                            <%--<td>用户名称：</td>--%>
                            <%--<td>--%>
                                <%--<input type="text" name="adminName" id="adminName">--%>
                                <%--<input type="hidden" name="adminId" id="updateAdminId"/>--%>
                            <%--</td>--%>
                        <%--</tr>--%>
                        <%--<tr>--%>
                            <%--<td>用户级别：</td>--%>
                            <%--<td>--%>
                                <%--<select class="form-control" id="updateAdminRank"  name="adminRank" >--%>
                                    <%--<option value="1级">1级</option>--%>
                                    <%--<option value="2级">2级</option>--%>
                                    <%--<option value="3级">3级</option>--%>
                                <%--</select>--%>
                            <%--</td>--%>
                        <%--</tr>--%>
                        <%--<tr>--%>
                            <%--<td>用户角色：</td>--%>
                            <%--<td>--%>
                                <%--<input name="adminRote" id="adminRote" type="text">--%>
                            <%--</td>--%>
                        <%--</tr>--%>
                        <%--<tr>--%>
                            <%--<td>上次登陆时间：</td>--%>
                            <%--<td>--%>
                                <%--<input type="text" id="adminTime" name="adminTime">--%>
                            <%--</td>--%>
                        <%--</tr>--%>
                    <%--</table>--%>
                <%--</form>--%>
            <%--</div>--%>
            <%--<div class="modal-footer">--%>
                <%--<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>--%>
                <%--<button type="button" class="btn btn-primary" name="saveAdminRankButton">保存</button>--%>
            <%--</div>--%>
        <%--</div><!-- /.modal-content -->--%>
    <%--</div>--%>
<%--</div>--%>



<%--&lt;%&ndash;展示修改权限静态框&ndash;%&gt;--%>
<%--<script type="text/javascript">--%>
    <%--$(function () {--%>
        <%--$("input[name=updateAdminButton]").click(function () {--%>
            <%--var adminId=$(this).attr("no");--%>
            <%--alert(adminId);--%>
            <%--$.get("${pageContext.request.contextPath}/admin/queryAdminById",--%>
                <%--{"adminId":adminId},--%>
                <%--function (data) {--%>
                <%--$("#adminName").val(data.adminName);--%>
                <%--$("#adminRote").val(data.adminRote);--%>
                <%--$("#adminTime").val(data.adminTime);--%>
                <%--$("#updateAdminRank").val(data.adminRank);--%>

            <%--})--%>
            <%--$("#queryAdminModel").modal("show");--%>
        <%--})--%>
    <%--})--%>
<%--</script>--%>
<%--&lt;%&ndash;保存修改权限&ndash;%&gt;--%>
<%--<script type="text/javascript">--%>
    <%--$(function () {--%>
        <%--$("button[name=saveAdminRankButton]").click(function () {--%>
            <%--var admin=$("#queryAdminForm").serialize();--%>
            <%--$.post("${pageContext.request.contextPath}/admin/updateAdminByAdminRank",--%>
                <%--admin,function (data) {--%>
                    <%--alert(date.msg);--%>
                    <%--location.href=location.href;--%>
            <%--})--%>


        <%--})--%>

    <%--})--%>
<%--</script>--%>
<%--&lt;%&ndash;假删除&ndash;%&gt;--%>
<%--<script type="text/javascript">--%>
    <%--$(function () {--%>
        <%--$("input[name=shanchu]").click(function () {--%>
            <%--var adminId=$(this).attr("no");--%>
            <%--var url="${pageContext.request.contextPath}/admin/updateAdminByAdminId";--%>
            <%--$.post(url,{"adminId":adminId},function (data) {--%>
                <%--alert(data.msg);--%>
                <%--location.href=location.href;--%>
            <%--})--%>

        <%--})--%>

    <%--})--%>
</script>
</html>