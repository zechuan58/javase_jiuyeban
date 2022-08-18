package com.itheima.d1_coll;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Movie {
    //电影的属性： 名称、主演、上映时间
    private String name;
    private String actor;
    private Date createTime; //上映时间
    private String type;//类型

    public Movie() {
    }

    public Movie(String name, String actor, Date createTime, String type) {
        this.name = name;
        this.actor = actor;
        this.createTime = createTime;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreateTime() {
        //把Date对象转换为String，再返回
        SimpleDateFormat sdf =
                new SimpleDateFormat("yyyy年MM月dd日");
        return sdf.format(createTime);
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "电影名:'" + name + '\'' +
                ", 主演:'" + actor + '\'' +
                ", 上映时间:" + getCreateTime() +
                ",电影类型:'" + type + '\'' +
                '}';
    }
}
