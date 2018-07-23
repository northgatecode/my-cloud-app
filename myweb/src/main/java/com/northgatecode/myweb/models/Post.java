package com.northgatecode.myweb.models;

import java.util.Date;

public class Post {
    private Integer id;
    private String content;
    private String sigature;
    private Date created;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSigature() {
        return sigature;
    }

    public void setSigature(String sigature) {
        this.sigature = sigature;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
