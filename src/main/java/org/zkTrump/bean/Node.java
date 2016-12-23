package org.zkTrump.bean;

import java.util.Date;

/**
 * zk节点对象
 * Created by Toephy on 2016.12.20 17:47
 */
public class Node {
    // 节点路径
    private String path;
    // 节点内容
    private String data;
    // 创建时间 对应 stat里的ctime
    private Date createTime;
    // 修改时间 对应 stat里的mtime
    private Date modifyTime;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
