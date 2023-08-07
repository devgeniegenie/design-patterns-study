package designpatterns.creational_patterns.builder.java;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("a").append("b").toString();
        System.out.println(result);
    }
}
