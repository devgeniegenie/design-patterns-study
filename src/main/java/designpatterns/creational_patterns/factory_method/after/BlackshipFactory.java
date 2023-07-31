package designpatterns.creational_patterns.factory_method.after;

public class BlackshipFactory implements ShipFactory{
    @Override
    public Ship createShip() {
        return new Blackship();
    }
}
