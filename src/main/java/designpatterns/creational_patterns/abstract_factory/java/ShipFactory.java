package designpatterns.creational_patterns.abstract_factory.java;

import designpatterns.creational_patterns.factory_method.after.Ship;
import designpatterns.creational_patterns.factory_method.after.Whiteship;
import org.springframework.beans.factory.FactoryBean;

public class ShipFactory implements FactoryBean<Ship> {
    @Override
    public Ship getObject() throws Exception {
        Ship ship = new Whiteship();
        ship.setName("whiteship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
