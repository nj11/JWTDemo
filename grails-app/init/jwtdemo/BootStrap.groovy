package jwtdemo

import com.jwtDemo.Authority
import com.jwtDemo.Product
import com.jwtDemo.User
import com.jwtDemo.UserAuthority

class BootStrap {

    def init = { servletContext ->
        def prod1 = new Product(prodName:"iPhone 7",prodDesc:"New iPhone 7 32GB",prodPrice:780).save flush:true
        def prod2 = new Product(prodName:"iPhone 7 Plus",prodDesc:"New iPhone 7 Plus 128GB",prodPrice:990).save flush:true
        def prod3 = new Product(prodName:"iPhone 7 SE",prodDesc:"New iPhone 7 SE 64GB",prodPrice:520).save flush:true

        //JWT token returned has the roles associated with the user who is logging in.
        def role1 = new Authority(authority:"ROLE_USER").save flush:true
        def user1 = new User(username:"user1",password:"pwd1").save flush:true

        def role2 = new Authority(authority:"ROLE_ADMIN").save flush:true
        def user2 = new User(username:"admin",password:"admin").save flush:true

        UserAuthority.create(user1,role1)
        UserAuthority.create(user2,role2)

    }
    def destroy = {
    }
}
