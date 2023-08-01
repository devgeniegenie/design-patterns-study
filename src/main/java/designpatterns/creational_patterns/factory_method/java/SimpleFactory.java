package designpatterns.creational_patterns.factory_method.java;

import designpatterns.creational_patterns.factory_method.after.Blackship;
import designpatterns.creational_patterns.factory_method.after.Whiteship;

public class SimpleFactory {

    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new Whiteship();
        } else if (name.equals("blackship")){
            return new Blackship();
        }

        throw new IllegalArgumentException();
    }
}
