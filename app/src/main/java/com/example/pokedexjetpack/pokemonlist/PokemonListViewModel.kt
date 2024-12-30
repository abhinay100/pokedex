package com.example.pokedexjetpack.pokemonlist

import android.graphics.Bitmap
import androidx.compose.ui.graphics.Color

import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable

import androidx.lifecycle.ViewModel
import androidx.palette.graphics.Palette
import com.example.pokedexjetpack.repository.PokemonRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


/**
 * Created by Abhinay on 27/12/24.
 *
 *
 */
@HiltViewModel
class PokemonListViewModel @Inject constructor(
    private val repository: PokemonRepository

): ViewModel() {
    fun calcDominantColor(drawable: Drawable, onFinish: (Color) -> Unit) {

        val bmp = (drawable as BitmapDrawable).bitmap.copy(Bitmap.Config.ARGB_8888, true)
        Palette.from(bmp).generate { palette ->
            palette?.dominantSwatch?.rgb?.let { colorValue ->
                onFinish(Color(colorValue))
            }

        }

    }
}