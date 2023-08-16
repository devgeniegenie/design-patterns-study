package designpatterns.structual_patterns.adapter.after.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
