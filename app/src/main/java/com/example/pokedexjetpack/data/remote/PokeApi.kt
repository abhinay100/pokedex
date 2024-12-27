package com.example.pokedexjetpack.data.remote

import com.example.pokedexjetpack.data.remote.responses.Pokemon
import com.example.pokedexjetpack.data.remote.responses.PokemonList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


/**
 * Created by Abhinay on 27/12/24.
 *
 *
 */
interface PokeApi {

    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): PokemonList

    @GET("pokemon/{name}")
    suspend fun getPokemonInfo(
        @Path("name") name: String
    ): Pokemon
}