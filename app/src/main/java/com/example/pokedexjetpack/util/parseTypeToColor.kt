package com.example.pokedexjetpack.util

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.toLowerCase
import com.example.pokedexjetpack.data.remote.responses.Stat
import com.example.pokedexjetpack.data.remote.responses.Type
import com.example.pokedexjetpack.ui.theme.AtkColor
import com.example.pokedexjetpack.ui.theme.DefColor
import com.example.pokedexjetpack.ui.theme.HPColor
import com.example.pokedexjetpack.ui.theme.SpAtkColor
import com.example.pokedexjetpack.ui.theme.SpDefColor
import com.example.pokedexjetpack.ui.theme.SpdColor
import com.example.pokedexjetpack.ui.theme.TypeBug
import com.example.pokedexjetpack.ui.theme.TypeDark
import com.example.pokedexjetpack.ui.theme.TypeDragon
import com.example.pokedexjetpack.ui.theme.TypeElectric
import com.example.pokedexjetpack.ui.theme.TypeFairy
import com.example.pokedexjetpack.ui.theme.TypeFighting
import com.example.pokedexjetpack.ui.theme.TypeFire
import com.example.pokedexjetpack.ui.theme.TypeFlying
import com.example.pokedexjetpack.ui.theme.TypeGhost
import com.example.pokedexjetpack.ui.theme.TypeGrass
import com.example.pokedexjetpack.ui.theme.TypeGround
import com.example.pokedexjetpack.ui.theme.TypeIce
import com.example.pokedexjetpack.ui.theme.TypeNormal
import com.example.pokedexjetpack.ui.theme.TypePoison
import com.example.pokedexjetpack.ui.theme.TypePsychic
import com.example.pokedexjetpack.ui.theme.TypeRock
import com.example.pokedexjetpack.ui.theme.TypeSteel
import com.example.pokedexjetpack.ui.theme.TypeWater
import java.util.Locale


/**
 * Created by Abhinay on 01/01/25.
 *
 *
 */
fun parseTypeToColor(type: Type): Color {
    return when(type.type.name.toLowerCase(Locale.ROOT)) {
        "normal" -> TypeNormal
        "fire" -> TypeFire
        "water" -> TypeWater
        "electric" -> TypeElectric
        "grass" -> TypeGrass
        "ice" -> TypeIce
        "fighting" -> TypeFighting
        "poison" -> TypePoison
        "ground" -> TypeGround
        "flying" -> TypeFlying
        "psychic" -> TypePsychic
        "bug" -> TypeBug
        "rock" -> TypeRock
        "ghost" -> TypeGhost
        "dragon" -> TypeDragon
        "dark" -> TypeDark
        "steel" -> TypeSteel
        "fairy" -> TypeFairy
        else -> Color.Black
    }
}

fun parseStatToColor(stat: Stat): Color {
    return when(stat.stat.name.toLowerCase()) {
        "hp" -> HPColor
        "attack" -> AtkColor
        "defense" -> DefColor
        "special-attack" -> SpAtkColor
        "special-defense" -> SpDefColor
        "speed" -> SpdColor
        else -> Color.White
    }
}

fun parseStatToAbbr(stat: Stat): String {
    return when(stat.stat.name.toLowerCase()) {
        "hp" -> "HP"
        "attack" -> "Atk"
        "defense" -> "Def"
        "special-attack" -> "SpAtk"
        "special-defense" -> "SpDef"
        "speed" -> "Spd"
        else -> ""
    }
}