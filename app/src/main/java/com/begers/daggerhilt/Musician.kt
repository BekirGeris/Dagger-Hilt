package com.begers.daggerhilt

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton

//Constuction injection
@Singleton
class Musician {

    @Inject
    constructor(instrument: Instrument, band: Band){

    }

    fun sing() {
        println("working..")
    }
}