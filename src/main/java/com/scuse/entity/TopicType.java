package com.scuse.entity;

public class TopicType {
    private Integer id;

    private Integer mjrId;

    private Integer crsId;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMjrId() {
        return mjrId;
    }

    public void setMjrId(Integer mjrId) {
        this.mjrId = mjrId;
    }

    public Integer getCrsId() {
        return crsId;
    }

    public void setCrsId(Integer crsId) {
        this.crsId = crsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}