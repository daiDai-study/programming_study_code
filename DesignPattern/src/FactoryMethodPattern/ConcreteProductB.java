package FactoryMethodPattern;

public class ConcreteProductB implements Product {
    @Override
    public void use() {
        System.out.println("use ConcreteProductA2");
    }
}
