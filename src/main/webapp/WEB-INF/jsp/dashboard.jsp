<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
    <title>zookeeper dashboard</title>
    <%@include file="common/head.jsp" %>
    <link href="resources/css/bootstrap-treeview.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <h1>我的一生全靠浪</h1>
    <br/>
    <div class="row">
        <div class="col-sm-12">
            <label for="treeview"></label>
            <div id="treeview"/>
        </div>
    </div>
</div>
</body>

<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="resources/js/bootstrap-treeview.js"></script>
<script src="resources/js/dashboard.js"></script>
<script type="text/javascript">
    $(function () {
        dashboard.initNodes();
    });
</script>
</html>