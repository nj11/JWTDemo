package com.jwtDemo

//Can use GORM to store authentication token.
class AuthenticationToken {

    String tokenValue
    String username

    static mapping = {
        version false
    }


    static constraints = {
    }
}
