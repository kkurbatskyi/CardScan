package com.example.cardscan

import java.net.URL

//Contains all the information from business cards
class Card(fname: String, lname: String, phoneNumber: String, companyName: String, website: URL) {
    lateinit var phoneNumber: String

    fun formatName(){

    }
    fun formatNumber(){
        var newNumber = ""
        for(i in phoneNumber){
            newNumber += if(i.isDigit()) i else ""
        }
        phoneNumber = newNumber
    }
    fun formatWebsite(){

    }
    fun generateBarcode(){}
}