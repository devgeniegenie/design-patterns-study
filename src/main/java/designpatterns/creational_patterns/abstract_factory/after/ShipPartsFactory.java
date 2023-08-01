package designpatterns.creational_patterns.abstract_factory.after;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();
}
