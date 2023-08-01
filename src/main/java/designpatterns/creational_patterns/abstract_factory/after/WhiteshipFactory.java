package designpatterns.creational_patterns.abstract_factory.after;

import designpatterns.creational_patterns.abstract_factory.before.WhiteAnchor;
import designpatterns.creational_patterns.abstract_factory.before.WhiteWheel;
import designpatterns.creational_patterns.factory_method.after.DefaultShipFactory;
import designpatterns.creational_patterns.factory_method.after.Ship;
import designpatterns.creational_patterns.factory_method.after.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
