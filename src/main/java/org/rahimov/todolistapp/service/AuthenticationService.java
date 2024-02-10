package org.rahimov.todolistapp.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

   public boolean authenticated(String username,String password){
       boolean isValidUsername = username.equalsIgnoreCase("nicat");
       boolean isValidPassword = password.equalsIgnoreCase("dummy");
       return isValidPassword & isValidUsername;
   }
}
