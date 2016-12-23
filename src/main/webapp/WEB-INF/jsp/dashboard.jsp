<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="zh-cn">
<html>
<head>
    <base href="<%=basePath%>">
    <title>zookeeper dashboard</title>
    <%@include file="common/import.jsp" %>
    <link href="resources/css/bootstrap-treeview.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <%@include file="common/nav.jsp" %>
    <div id="content" class="row">
        <div class="col-xs-3 col-sm-3 col-md-3">
            <h2>Sidebar</h2>
            <div id="treeview"></div>
        </div>
        <div class="col-xs-9 col-sm-9 col-md-9">
            <h2>Main Content Area</h2>
            <p>
                第一百七十九章：老人和女人「六更求花」。 　　
                    黄昏，不远处的深山中，八个黑煞门的弟子尸体鲜血淋漓，现场也留下了数个鲜血大字。 　　翌日清晨，足足是在上百里之外，一处丛林内，二十六具黑煞门弟子的尸体旁边，也同样留下了鲜血大字。 　　三天之后，数百里之外，密林之内，二十六具黑煞门弟子尸体的旁边大树上，有着五个鲜血大字，五个大字写着‘誓灭黑煞门’。 　　这几天中，黑暗森林周围也传开了此事，几天的时间内，足足有着一百多黑煞门弟子被诛杀，其中包括是不少的脉灵境修为者。 　　尽管这上百人也是黑煞门弟子中的绝对精英，要不然也不会被派出来寻找宝物，但对于整个黑煞门来说，这上百人无疑是九牛一毛。
            </p>
        </div>
    </div>
</div>
</body>

<script src="resources/js/bootstrap-treeview.js"></script>
<script src="resources/js/dashboard.js"></script>
<script type="text/javascript">
    $(function () {
        dashboard.initNodes();
    });
</script>
</html>