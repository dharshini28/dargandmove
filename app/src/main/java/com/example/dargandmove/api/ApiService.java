package com.example.dargandmove.api;

import com.example.dargandmove.beans.Crimes_at_location;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import java.util.Date;
import java.util.List;
import java.util.Map;
import retrofit2.http.QueryMap;

public interface ApiService {
    @GET("api/crimes-at-location")
    Call<List<Crimes_at_location>> getCrimes_at_locations (
            @Query("date")Date date,
            @Query("lat") Float lat,
            @Query("lng") Float lng
    );
    @GET("api/crimes-at-location")
    Call<List<Crimes_at_location>> getCrimes_at_locations(
            @QueryMap Map<String,String> parameters);
}