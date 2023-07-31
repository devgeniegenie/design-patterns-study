package designpatterns.creational_patterns.factory_method.after;

public class WhiteshipFactory implements ShipFactory{
    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
