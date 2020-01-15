package com.badboyh2o.model;

public class Test {

    private long id;
    private String name;
    private String uid;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getUid() {
        return uid;
    }
    public void setUid(String uid) {
        this.uid = uid;
    }
    @Override
    public String toString() {
        return "Test [id=" + id + ", name=" + name + ", uid=" + uid + "]";
    }
    
    
}
