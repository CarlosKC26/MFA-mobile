package co.pralogy.mfa.services

import co.pralogy.mfa.models.User
import retrofit2.Call
import retrofit2.http.GET

interface UserInfoService {
    @GET("")
    fun getAffectedCountryList () : Call<List<User>>
}