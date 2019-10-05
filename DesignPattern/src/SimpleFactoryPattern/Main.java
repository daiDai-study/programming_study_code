package SimpleFactoryPattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Product p = ProductFactory.createProduct("A");
        p.use();

        p = ProductFactory.createProduct("B");
        p.use();
    }
}
