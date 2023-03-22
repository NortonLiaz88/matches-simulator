package com.norton.soccernews.domain;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.Nullable;

import com.google.gson.annotations.SerializedName;

import java.util.Optional;

public class Team implements Parcelable {
    @SerializedName("nome")
    private String name;
    @SerializedName("forca")
    private Integer stars;
    @SerializedName("imagem")
    private String image;
    @Nullable
    private Integer score;

    protected Team(Parcel in) {
        name = in.readString();
        if (in.readByte() == 0) {
            stars = null;
        } else {
            stars = in.readInt();
        }
        image = in.readString();
        if (in.readByte() == 0) {
            score = null;
        } else {
            score = in.readInt();
        }
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        if (stars == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(stars);
        }
        dest.writeString(image);
        if (score == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(score);
        }
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Team> CREATOR = new Creator<Team>() {
        @Override
        public Team createFromParcel(Parcel in) {
            return new Team(in);
        }

        @Override
        public Team[] newArray(int size) {
            return new Team[size];
        }
    };

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

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
