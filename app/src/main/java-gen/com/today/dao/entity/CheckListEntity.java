package com.today.dao.entity;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Unique;


@Entity
public class CheckListEntity {

    @Id
    @Unique
    private Long id;
    private String c_name;

    @Generated(hash = 712240105)
    public CheckListEntity(Long id, String c_name) {
        this.id = id;
        this.c_name = c_name;
    }

    @Generated(hash = 338594023)
    public CheckListEntity() {
    }

    @Override
    public String toString() {
        return "CheckListEntity{" +
                "id=" + id +
                ", c_name='" + c_name + '\'' +
                '}';
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getC_name() {
        return this.c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }



}
