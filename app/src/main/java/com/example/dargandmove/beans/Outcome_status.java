package com.example.dargandmove.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Outcome_status {

    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("date")
    @Expose
    private String date;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

}