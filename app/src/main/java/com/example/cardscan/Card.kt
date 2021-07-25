package com.example.cardscan

import java.net.URL

//Contains all the information from business cards
class Card(_fname: String, _lname: String, _phoneNumber: String, _companyName: String, _website: URL) {
    var phoneNumber: String = _phoneNumber
    var fname: String = _fname
    var lname: String = _lname
    var website: URL = _website

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