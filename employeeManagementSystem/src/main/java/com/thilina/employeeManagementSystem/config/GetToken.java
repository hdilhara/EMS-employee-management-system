package com.thilina.employeeManagementSystem.config;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;

public class GetToken {
    /**static method not to be autowired so we need @Component anotation here**/
    public static String getToken(){
        String token= null;
        Authentication authentication= SecurityContextHolder.getContext().getAuthentication();
        if(authentication !=null){
            token=((OAuth2AuthenticationDetails)authentication.getDetails()).getTokenValue();
        }
        return token;
    }
}