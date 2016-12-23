package org.zkTrump.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zkTrump.bean.Node;
import org.zkTrump.bean.TreeNode;
import org.zkTrump.util.GsonUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by Toephy on 2016.12.14 17:09
 */
@Controller
public class dashController {

    @RequestMapping("/node/list")
    @ResponseBody
    public List<TreeNode> nodeTree() {
        TreeNode hubei = new TreeNode("湖北省", "hubei");
        TreeNode child1 = new TreeNode("武汉", "hubei/wuhan");
        TreeNode child2 = new TreeNode("黄石", "hubei/huangshi");
        TreeNode child3 = new TreeNode("荆州", "hubei/jingzhou");

        TreeNode qu1 = new TreeNode("大冶", "hubei/huangshi/daye");
        TreeNode qu2 = new TreeNode("阳新", "hubei/huangshi/yangxin");
        child2.addNode(qu1).addNode(qu2);
        hubei.addNode(child1).addNode(child2).addNode(child3);
        hubei.setTags(new String[]{"我的故乡", "共" + hubei.getNodes().size() + "个"});

        TreeNode hunan = new TreeNode("湖南省", "hunan");
        TreeNode hunanchild1 = new TreeNode("长沙", "hunan/changsha");
        TreeNode hunanchild2 = new TreeNode("湘潭", "hunan/xiangtan");
        TreeNode hunanchild3 = new TreeNode("岳阳", "hunan/yueyang");
        hunan.addNode(hunanchild1).addNode(hunanchild2).addNode(hunanchild3);
        hunan.setTags(new String[]{"湖南妹佗", "共" + hunan.getNodes().size() + "个"});
        List<TreeNode> treeNodes = Arrays.asList(hubei, hunan);
        System.out.println(GsonUtil.toJson(treeNodes));
        return treeNodes;
    }

    @RequestMapping("/node/data")
    @ResponseBody
    public Node getNode(@RequestParam(name = "path") String path) {

        System.out.println("path = " + path);

        Node node = new Node();
        node.setPath("/a/b/c.data");
        node.setData("第一百七十九章：老人和女人「六更求花」。 　　 黄昏，不远处的深山中，八个黑煞门的弟子尸体鲜血淋漓，现场也留下了数个鲜血大字。 　　翌日清晨，足足是在上百里之外，一处丛林内，二十六具黑煞门弟子的尸体旁边，也同样留下了鲜血大字。 　　三天之后，数百里之外，密林之内，二十六具黑煞门弟子尸体的旁边大树上，有着五个鲜血大字，五个大字写着‘誓灭黑煞门’。 　　这几天中，黑暗森林周围也传开了此事，几天的时间内，足足有着一百多黑煞门弟子被诛杀，其中包括是不少的脉灵境修为者。 　　尽管这上百人也是黑煞门弟子中的绝对精英，要不然也不会被派出来寻找宝物，但对于整个黑煞门来说，这上百人无疑是九牛一毛。");
        node.setCreateTime(new Date());
        node.setModifyTime(new Date());
        return node;
    }

}
