package designpatterns.creational_patterns.abstract_factory.after;

import designpatterns.creational_patterns.factory_method.after.Ship;
import designpatterns.creational_patterns.factory_method.after.ShipFactory;

public class ShipInventory {
    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhiteShipPartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());

    }
}
