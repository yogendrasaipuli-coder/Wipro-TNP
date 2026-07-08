public class Fruit {

    protected String name;
    protected String taste;
    protected String size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println("Fruit Name : " + name);
        System.out.println("Taste : " + taste);
    }

    public static void main(String[] args) {

        Apple apple = new Apple("Apple", "Sweet", "Medium");
        Orange orange = new Orange("Orange", "Sour", "Medium");

        apple.eat();
        System.out.println();

        orange.eat();
    }
}

class Apple extends Fruit {

    public Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("Fruit Name : " + name);
        System.out.println("Taste : Sweet");
    }
}

class Orange extends Fruit {

    public Orange(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("Fruit Name : " + name);
        System.out.println("Taste : Sour");
    }
}