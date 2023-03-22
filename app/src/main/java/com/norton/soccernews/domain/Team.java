package com.norton.soccernews.domain;

import com.google.gson.annotations.SerializedName;

public class Team {
    @SerializedName("nome")
    private String name;
    @SerializedName("força")
    private Integer stars;
    @SerializedName("imagem")
    private String image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
