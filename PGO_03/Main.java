package PGO_03;

public class Main {

    public static void main(String[] args) {


        Person person1 = new Person("Damian", "Moński",500,5000);
        Person person2 = new Person("Mariusz", "Pudzianowski",0,1500);
        Person person3 = new Person("Zydrunas", "Savickas",2500,500);

        Storage storage1 = new Storage(5);
        Storage storage2 = new Storage(7);
        Storage storage3 = new Storage(1);

        Products p1 = new Products("Cookie", ProductType.Consumable, 1.69,40);
        Products p2 = new Products("Chocolate", ProductType.Consumable, 5.99,7,storage2);
        Products p3 = new Products("Notebook", ProductType.Electronic, 3199,8);
        Products p4 = new Products("Bicycle", ProductType.Entertainment, 799,10,storage1);
        Products p5 = new Products("Balloon", ProductType.Entertainment, 29.99,20,storage3);
        Products p6 = new Products("Refridgerator", ProductType.Electronic,2999, 5);

        System.out.println(p1.isAvailable());
        p2.increaseQuantity(2);
        System.out.println(p2.getQuantity());
        System.out.println(p4.getStorage());

        System.out.println(p6.getPrice());









    }
}
