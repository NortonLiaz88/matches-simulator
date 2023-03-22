package com.norton.soccernews.domain;

import com.google.gson.annotations.SerializedName;

public class Match {
    @SerializedName("descrição")
    private String description;
    @SerializedName("local")
    private Place place;
    @SerializedName("mandante")
    private Team homeTeam;
    @SerializedName("visitante")
    private Team awayTeam;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Place getPlace() {
        return place;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(Team awayTeam) {
        this.awayTeam = awayTeam;
    }
}
