package com.begers.daggerhilt

import javax.inject.Inject

class SecontInterfaceImplementor @Inject constructor() : MyInterface{

    override fun myPrintFunction(): String {
         return "My Second interface implementor"
    }
}