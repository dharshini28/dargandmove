package com.example.dargandmove.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Crimes_at_location {

    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("location_type")
    @Expose
    private String location_type;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("context")
    @Expose
    private String context;
    @SerializedName("outcome_status")
    @Expose
    private Outcome_status outcome_status;
    @SerializedName("persistent_id")
    @Expose
    private String persistent_id;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("location_subtype")
    @Expose
    private String location_subtype;
    @SerializedName("month")
    @Expose
    private String month;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation_type() {
        return location_type;
    }

    public void setLocation_type(String location_type) {
        this.location_type = location_type;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Outcome_status getOutcome_status() {
        return outcome_status;
    }

    public void setOutcome_status(Outcome_status outcome_status) {
        this.outcome_status = outcome_status;
    }

    public String getPersistent_id() {
        return persistent_id;
    }

    public void setPersistent_id(String persistent_id) {
        this.persistent_id = persistent_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation_subtype() {
        return location_subtype;
    }

    public void setLocation_subtype(String location_subtype) {
        this.location_subtype = location_subtype;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

}