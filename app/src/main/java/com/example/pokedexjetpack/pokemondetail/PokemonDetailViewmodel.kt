package com.example.pokedexjetpack.pokemondetail

import androidx.lifecycle.ViewModel
import com.example.pokedexjetpack.data.remote.responses.Pokemon
import com.example.pokedexjetpack.repository.PokemonRepository
import com.example.pokedexjetpack.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


/**
 * Created by Abhinay on 31/12/24.
 *
 *
 */
@HiltViewModel
class PokemonDetailViewmodel @Inject constructor(
    private val repository: PokemonRepository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String) : Resource<Pokemon> {
          return repository.getPokemonInfo(pokemonName)
    }
}