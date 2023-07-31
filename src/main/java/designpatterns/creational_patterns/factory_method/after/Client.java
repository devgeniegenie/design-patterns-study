package designpatterns.creational_patterns.factory_method.after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteshipFactory(), "whiteship", "asdf@mail.com");
        client.print(new BlackshipFactory(), "blackship", "bbb@mail.com");
    }

    private void print(ShipFactory whiteshipFactory, String name, String email) {
        System.out.println(whiteshipFactory.orderShip(name, email));
    }

}
