package com.example.michel.xxtq.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Updata updata;

    public class Updata{

        public String updataTime;
    }
}
