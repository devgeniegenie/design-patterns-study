package designpatterns.structual_patterns.adapter.after.security;

import designpatterns.structual_patterns.adapter.after.security.UserDetails;
import designpatterns.structual_patterns.adapter.after.security.UserDetailsService;

public class LoginHandler {

    UserDetailsService userDetailsService;

    public LoginHandler(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    public String login(String username, String password) {
        UserDetails userDetails = userDetailsService.loadUser(username);
        if (userDetails.getPassword().equals(password)) {
            return userDetails.getUsername();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
