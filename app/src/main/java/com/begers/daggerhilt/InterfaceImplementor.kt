package com.begers.daggerhilt

import javax.inject.Inject

class InterfaceImplementor @Inject constructor() : MyInterface {

    override fun myPrintFunction() : String {
        return "my interface imlementor"
    }

}