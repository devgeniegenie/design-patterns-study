package designpatterns.structual_patterns.adapter.before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
