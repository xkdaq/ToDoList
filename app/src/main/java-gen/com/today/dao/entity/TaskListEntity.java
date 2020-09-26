package com.today.dao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Unique;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class TaskListEntity {

    @Id
    @Unique
    private Long t_id;
    private Long t_fid;
    private String t_title;
    private String t_content;
    private String t_time;
    private String t_createtime;
    private String t_type;

    @Generated(hash = 1737231364)
    public TaskListEntity(Long t_id, Long t_fid, String t_title, String t_content,
            String t_time, String t_createtime, String t_type) {
        this.t_id = t_id;
        this.t_fid = t_fid;
        this.t_title = t_title;
        this.t_content = t_content;
        this.t_time = t_time;
        this.t_createtime = t_createtime;
        this.t_type = t_type;
    }

    @Generated(hash = 284097938)
    public TaskListEntity() {
    }

    @Override
    public String toString() {
        return "TaskListEntity{" +
                "t_id=" + t_id +
                ", t_fid=" + t_fid +
                ", t_title='" + t_title + '\'' +
                ", t_content='" + t_content + '\'' +
                ", t_time='" + t_time + '\'' +
                ", t_createtime='" + t_createtime + '\'' +
                ", t_type='" + t_type + '\'' +
                '}';
    }

    public Long getT_id() {
        return this.t_id;
    }

    public void setT_id(Long t_id) {
        this.t_id = t_id;
    }

    public Long getT_fid() {
        return this.t_fid;
    }

    public void setT_fid(Long t_fid) {
        this.t_fid = t_fid;
    }

    public String getT_title() {
        return this.t_title;
    }

    public void setT_title(String t_title) {
        this.t_title = t_title;
    }

    public String getT_content() {
        return this.t_content;
    }

    public void setT_content(String t_content) {
        this.t_content = t_content;
    }

    public String getT_time() {
        return this.t_time;
    }

    public void setT_time(String t_time) {
        this.t_time = t_time;
    }

    public String getT_createtime() {
        return this.t_createtime;
    }

    public void setT_createtime(String t_createtime) {
        this.t_createtime = t_createtime;
    }

    public String getT_type() {
        return this.t_type;
    }

    public void setT_type(String t_type) {
        this.t_type = t_type;
    }
}
