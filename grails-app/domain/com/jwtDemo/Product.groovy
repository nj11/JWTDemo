package com.jwtDemo

import grails.rest.Resource

@Resource(uri='/api/product')
class Product {

    String prodName
    String prodDesc
    Double prodPrice
    Date createDate = new Date()

    static constraints = {
    }
}
