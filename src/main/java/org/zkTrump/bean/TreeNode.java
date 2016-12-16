package org.zkTrump.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Toephy on 2016.12.15 15:39
 * <p/>
 * 如果你需要自定义更多的内容，可以参考下面：
 * {
 *      text: "Node 1",
 *      icon: "glyphicon glyphicon-stop",
 *      selectedIcon: "glyphicon glyphicon-stop",
 *      color: "#000000",
 *      backColor: "#FFFFFF",
 *      href: "#node-1",
 *      selectable: true,
 *      state: {
 *          checked: true,
 *          disabled: true,
 *          expanded: true,
 *          selected: true
 *      },
 *      tags: ['available'],
 *      nodes: [
 *          {},
 *          ...
 *      ]
 * }
 *
 * 下面的参数可用于树节点的属性定义，如节点的文本、颜色和标签等。
 * 参数名称	        参数类型	                  参数描述
 * text	            String(必选项)	          列表树节点上的文本，通常是节点右边的小图标。
 * icon	            String(可选项)	          列表树节点上的图标，通常是节点左边的图标。
 * selectedIcon	    String(可选项)	          当某个节点被选择后显示的图标，通常是节点左边的图标。
 * href	            String(可选项)	          结合全局enableLinks选项为列表树节点指定URL。
 * selectable	    Boolean. Default: true	  指定列表树的节点是否可选择。设置为false将使节点展开，并且不能被选择。
 *
 * state	        Object(可选项)	          一个节点的初始状态。
 * state.checked	Boolean，默认值false	      指示一个节点是否处于checked状态，用一个checkbox图标表示。
 * state.disabled	Boolean，默认值false	      指示一个节点是否处于disabled状态。（不是selectable，expandable或checkable）
 * state.expanded	Boolean，默认值false	      指示一个节点是否处于展开状态。
 * state.selected	Boolean，默认值false	      指示一个节点是否可以被选择。
 *
 * color	        String. (可选项)       	  节点的前景色，覆盖全局的前景色选项。
 * backColor	    String. (可选项)	          节点的背景色，覆盖全局的背景色选项。
 * tags	            Array of Strings.(可选项)  通过结合全局showTags选项来在列表树节点的右边添加额外的信息。
 *
 * http://www.htmleaf.com/jQuery/Menu-Navigation/201502141379.html
 *
 * http://www.ssdn2007.com/bootstrap-glyphicons.html
 */
public class TreeNode {

    // 节点序号
    private int id;
    // 节点名称
    private String text = "";
    // 节点tag
    private String[] tags;
    // 子节点集合
    private List<TreeNode> nodes;

    private State State = new State();

    public TreeNode() {
    }

    public TreeNode(int id, String text) {
        this.id = id;
        this.text = text;
    }

    public TreeNode(int id, String text, String[] tags) {
        this.id = id;
        this.text = text;
        this.tags = tags;
    }

    public TreeNode addNode(TreeNode node) {
        if (nodes == null) {
            nodes = new ArrayList<TreeNode>();
        }
        nodes.add(node);
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public List<TreeNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<TreeNode> nodes) {
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TreeNode{");
        sb.append("id=").append(id);
        sb.append(", text='").append(text).append('\'');
        sb.append(", tags=").append(Arrays.toString(tags));
        sb.append(", nodes=").append(nodes);
        sb.append('}');
        return sb.toString();
    }

    static class State {

        private boolean checked = false;
        private boolean disabled = false;
        private boolean expanded = false;
        private boolean selected = false;

        public boolean isChecked() {
            return checked;
        }

        public void setChecked(boolean checked) {
            this.checked = checked;
        }

        public boolean isDisabled() {
            return disabled;
        }

        public void setDisabled(boolean disabled) {
            this.disabled = disabled;
        }

        public boolean isExpanded() {
            return expanded;
        }

        public void setExpanded(boolean expanded) {
            this.expanded = expanded;
        }

        public boolean isSelected() {
            return selected;
        }

        public void setSelected(boolean selected) {
            this.selected = selected;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("State{");
            sb.append("checked=").append(checked);
            sb.append(", disabled=").append(disabled);
            sb.append(", expanded=").append(expanded);
            sb.append(", selected=").append(selected);
            sb.append('}');
            return sb.toString();
        }
    }
}
