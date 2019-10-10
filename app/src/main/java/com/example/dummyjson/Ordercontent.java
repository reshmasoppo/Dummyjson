package com.example.dummyjson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ordercontent {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("order_name")
    @Expose
    private String orderName;
    @SerializedName("order_value")
    @Expose
    private String orderValue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(String orderValue) {
        this.orderValue = orderValue;
    }

}

