package com.example.musicapp.service


import retrofit2.Call
import retrofit2.http.GET

interface MusicService {

    @GET("/v3/53b9d8b4-8323-4442-b0bd-9f97425950ba")
    fun listMusics() : Call<MusicDto>
}