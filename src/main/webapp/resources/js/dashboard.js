var dashboard = {
    initNodes: function () {
        $.ajax({
            type: "GET",
            url: "node/list",
            success: function (data) {
                var options = {
                    bootstrap2: false,
                    showTags: true,
                    enableLinks: false,
                    levels: 5,
                    data: data
                };
                $('#treeview').treeview(options);
            }
        });
    },

    /**
     * 点击节点
     * @param target
     */
    nodeData: function (target) {
        var item = $(target).parent();

        var c = $(target).parent().children('.expand-icon');
        var classList = c.attr('class') ? c.attr('class').split(' ') : [];
        var isParent = classList.indexOf('expand-icon') !== -1;

        //alert("isParent = " + isParent);
        var path = item.attr('path');
        //alert("path = " + path);
        if (!isParent && (path != undefined && path.length > 0)) {
            dashboard.getNodeData(path);
        }
    },

    /**
     * 点击添加节点
     * @param target
     */
    addNode: function (target) {
        alert("addNode");
    },

    /**
     * 点击删除节点
     * @param target
     */
    deleteNode: function(target) {
        alert("deleteNode");
    },

    /**
     * 访问服务，获取节点信息
     * @param path
     */
    getNodeData : function (path) {
        $.ajax({
            type: "GET",
            url: "node/data",
            data: "path=" + path,
            success: function (data) {
                alert(JSON.stringify(data));
            }
        });
    },

    buildDomTree: function buildDomTree() {
        var data = [];
        dashboard.walk($('html')[0].children, data);
        return data;
    },

    walk: function walk(nodes, data) {
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
};