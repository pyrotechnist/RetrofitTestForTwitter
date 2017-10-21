package com.example.longyuan.retrofittestfortwitter;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by LONGYUAN on 2017/8/2.
 */

public interface TwitterApi {
    String BASE_URL = "https://api.twitter.com/";

    @FormUrlEncoded
    @POST("oauth2/token")
    Call<OAuthToken> postCredentials(@Field("grant_type") String grantType);

    @GET("/1.1/users/show.json")
    Call<UserDetails> getUserDetails(@Query("screen_name") String name);

    @FormUrlEncoded
    @POST("oauth2/token")
    Observable<OAuthToken> postCredentialsRx(@Field("grant_type") String grantType, @HeaderMap Map<String, String> headers);

    @GET("/1.1/users/show.json")
    Observable<UserDetails> getUserDetailsRx(@Query("screen_name") String name, @HeaderMap Map<String, String> headers);
}
