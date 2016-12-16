package org.zkTrump.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zkTrump.bean.TreeNode;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Toephy on 2016.12.14 17:09
 */
@Controller
public class dashController {


    @RequestMapping("/node/list")
    @ResponseBody
    public List<TreeNode> test(HttpServletRequest request, HttpServletResponse response) {
        TreeNode hubei = new TreeNode(1, "湖北省");
        TreeNode child1 = new TreeNode(1, "武汉");
        TreeNode child2 = new TreeNode(2, "黄石");
        TreeNode child3 = new TreeNode(3, "荆州");
        hubei.addNode(child1).addNode(child2).addNode(child3);
        hubei.setTags(new String[]{"我的故乡", "共" + hubei.getNodes().size() + "个"});

        TreeNode hunan = new TreeNode(1, "湖南省");
        TreeNode hunanchild1 = new TreeNode(1, "长沙");
        TreeNode hunanchild2 = new TreeNode(2, "湘潭");
        TreeNode hunanchild3 = new TreeNode(3, "岳阳");
        hunan.addNode(hunanchild1).addNode(hunanchild2).addNode(hunanchild3);
        hunan.setTags(new String[]{"湖南妹佗", "共" + hunan.getNodes().size() + "个"});

        return Arrays.asList(hubei, hunan);
    }
}
