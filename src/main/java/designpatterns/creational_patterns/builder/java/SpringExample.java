package designpatterns.creational_patterns.builder.java;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

public class SpringExample {
    public static void main(String[] args) {
        UriComponents test = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("www.abc.com")
                .path("java/test")
                .queryParam("param1", "value1")
                .queryParam("param2", "value2")
                .build().encode();
        System.out.println(test);
    }
}
