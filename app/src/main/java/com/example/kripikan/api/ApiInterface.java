package com.example.kripikan.api;

import com.example.kripikan.model.Login.Login;
import com.example.kripikan.model.Register.Register;
import com.example.kripikan.model.produk.Response;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface ApiInterface {

    @FormUrlEncoded
    @POST("Api.php?apicall=login")
    Call<Login> loginResponse(
      @Field("username") String username,
      @Field("password") String password
    );

    @FormUrlEncoded
    @POST("Api.php?apicall=signup")
    Call<Register> registerResponse(
      @Field("username") String username,
      @Field("email") String email,
      @Field("address") String address,
      @Field("phone") String phone,
      @Field("password") String password
    );

    @FormUrlEncoded
    @GET("Api.php?apicall=list")
    Call<Response> responseItem(
            @Field("name") String name,
            @Field("price") String price,
            @Field("description") String descrip,
            @Field("img") String img
    );



}
