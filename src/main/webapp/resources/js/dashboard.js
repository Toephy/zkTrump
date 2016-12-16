var dashboard = {
    initNodes: function () {
        $.ajax({
            type: "GET",
            url: "node/list",
            success: function (data) {
                var options = {
                    bootstrap2: false,
                    showTags: true,
                    levels: 5,
                    data: data
                };
                $('#treeview').treeview(options);
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