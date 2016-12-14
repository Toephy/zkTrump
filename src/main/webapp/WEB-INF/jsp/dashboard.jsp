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
    <h1>Bootstrap Tree View - DOM Tree</h1>
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
<script type="text/javascript">
    function buildDomTree() {
        var data = [];
        function walk(nodes, data) {
            if (!nodes) {
                return;
            }
            $.each(nodes, function (id, node) {
                var obj = {
                    id: id,
                    text: node.nodeName + " - " + (node.innerText ? node.innerText : ''),
                    tags: [node.childElementCount > 0 ? node.childElementCount + ' child elements' : '']
                };
                if (node.childElementCount > 0) {
                    obj.nodes = [];
                    walk(node.children, obj.nodes);
                }
                data.push(obj);
            });
        }
        walk($('html')[0].children, data);
        return data;
    }

    $(function () {
        var options = {
            bootstrap2: false,
            showTags: true,
            levels: 5,
            data: buildDomTree()
        };
        $('#treeview').treeview(options);
    });
</script>
</html>