package com.example.longyuan.retrofittestfortwitter;

import com.google.gson.annotations.SerializedName;

/**
 * Created by LONGYUAN on 2017/8/2.
 */

public class OAuthToken {

    @SerializedName("access_token")
    private String accessToken;

    @SerializedName("token_type")
    private String tokenType;

    public String getAccessToken() {
        return accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public String getAuthorization() {
        return getTokenType() + " " + getAccessToken();
    }
}
