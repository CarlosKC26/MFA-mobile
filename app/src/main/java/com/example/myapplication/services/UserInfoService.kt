package com.example.myapplication.services

import com.example.myapplication.models.User
import retrofit2.Call
import retrofit2.http.GET

interface UserInfoService {
    @GET("")
    fun getAffectedCountryList () : Call<List<User>>
}