package SimpleFactoryPattern;

public class ProductFactory {
    public static Product createProduct(String arg){
        if (arg=="A") {
            return new ConcreteProductA();
        }else {
            return new ConcreteProductB();
        }
    }
}
