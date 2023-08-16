package designpatterns.structual_patterns.adapter.after;

import designpatterns.structual_patterns.adapter.after.security.LoginHandler;
import designpatterns.structual_patterns.adapter.after.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("genie", "genie");
        System.out.println(login);
    }
}
