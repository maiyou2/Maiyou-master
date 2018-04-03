<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>迈游网</title>
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








<body>
<header class="am-topbar admin-header">
  <div class="am-topbar-brand"><img src="${pageContext.request.contextPath}/assets/i/logo.png"></div>

  <div class="am-collapse am-topbar-collapse" id="topbar-collapse">
    <ul class="am-nav am-nav-pills am-topbar-nav admin-header-list">

   <li class="am-dropdown tognzhi" data-am-dropdown>

</li>

 <li class="kuanjie">
     <c:if test="${loginAdmin.adminRank eq '1'}">
         <a>套餐管理</a>
     </c:if>
     <c:if test="${loginAdmin.adminRank eq '2'}">
         <a href="${pageContext.request.contextPath}/orderForm/orderFormList?pageNum=1&pageSize=8">订单管理</a>
         <a >酒店管理</a>
         <a href="${pageContext.request.contextPath}/meal/tomeal?pageNum=1&pageSize=8">套餐管理</a>
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
            <h3 class="am-icon-flag"><em></em> <a href="${pageContext.request.contextPath}/user/toUser?pageNum=1&pageSize=8">用户列表</a></h3>
            <h3 class="am-icon-flag"><em></em> <a href="${pageContext.request.contextPath}/admin/queryAllAdmin?pageNum=1&pageSize=8">权限管理</a></h3>
        </div>
        <div id="dingdan">
            <h3 class="am-icon-cart-plus"><em></em> <a href="${pageContext.request.contextPath}/orderForm/orderFormList?pageNum=1&pageSize=8"> 订单管理</a></h3>
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
                <h3 class="am-icon-cart-plus"><em></em> <a href="${pageContext.request.contextPath}/orderForm/orderFormList?pageNum=1&pageSize=8"> 订单管理</a></h3>
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
    <%--<!-- sideMenu End --> --%>
    <%----%>
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
		<%--</script> --%>



    
    
    
    
    
</div>
<%--列表表头--%>
<div class=" admin-content">
		<div class="daohang"></div>
</div>




</div>
<div class="" align="right">
    <img style="width: 87%;height:90%" src="/assets/i/WechatIMG188.jpeg">
</div>
</body>
</html>