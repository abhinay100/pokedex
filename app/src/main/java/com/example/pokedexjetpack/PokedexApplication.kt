package com.example.pokedexjetpack

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber


/**
 * Created by Abhinay on 27/12/24.
 *
 *
 */
@HiltAndroidApp
class PokedexApplication :  Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}