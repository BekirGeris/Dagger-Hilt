package com.begers.daggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    //Fiel injection
    @Inject
    lateinit var lars: Musician

    @Inject
    lateinit var myClass: ClassExample

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        var instrument = Instrument()
        var band = Band()
        var james = Musician(instrument, band)

        james.sing()
        */

        lars.sing()

        println(myClass.myFunction())
    }
}

@AndroidEntryPoint
class FragmentExample() : Fragment(){

    @Inject
    lateinit var kirk: Musician
}