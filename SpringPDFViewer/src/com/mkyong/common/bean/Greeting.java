package com.mkyong.common.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Greeting {

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }
    @JsonIgnoreProperties
    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}