package designpatterns.creational_patterns.factory_method.after;

public class WhiteshipFactory extends DefaultShipFactory{
    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
