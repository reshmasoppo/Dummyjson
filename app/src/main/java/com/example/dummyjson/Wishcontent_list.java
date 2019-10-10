package com.example.dummyjson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Wishcontent_list {

    @SerializedName("content")
    @Expose
    private List<Content> content = null;

    public List<Content> getContent() {
        return content;
    }

    public void setContent(List<Content> content) {
        this.content = content;
    }

}
