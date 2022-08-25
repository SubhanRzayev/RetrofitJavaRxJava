package com.subhanrzayev.retrofitjava.service;

import com.subhanrzayev.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface CryptoAPI {
    //GET, POST, DELETE, UPDATE

    //https://api.nomics.com/v1/currencies/ticker?key=

    @GET("currencies/ticker?key=")
    Observable<List<CryptoModel>> getData();
    //Call<List<CryptoModel>> getData();
}
