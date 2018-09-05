# JWTDemo
SSO using JSON Web Token - Demo

# Notes
1.The project uses  `compile "org.grails.plugins:spring-security-core:3.1.1"` and   `compile "org.grails.plugins:spring-security-rest:2.0.0.M2"1` dependencies in build.gradle file to setup securing rest endpoints with JWT.

2.application.groovy has the settings for the JWT token ( eg: expiration etc)

3.User ,Authority and UserAuthority  classes were built using the  command.`grails s2-quickstart <package_name> <User_class> <Role_class>`

4.To retrieve the JWT token then endpt `http://localhost:8080/api/login` needs to be invoked, passing in username and password.

5.Rest endpt `http://localhost:8080/product/api` is only accessible when a JWT token is passed in request header.Token name is X-Auth-Token.

6.JWT token also returns roles associated with a user.

7.The rest endpoints were tested using Google Chrome extension, Tabbed Postman ( https://chrome.google.com/webstore/detail/tabbed-postman-rest-clien/coohjcphdfgbiolnekdpbcijmhambjff?hl=en )



  
  
