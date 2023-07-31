package designpatterns.creational_patterns.factory_method.after;

public class BlackshipFactory extends DefaultShipFactory{
    @Override
    public Ship createShip() {
        return new Blackship();
    }
}
