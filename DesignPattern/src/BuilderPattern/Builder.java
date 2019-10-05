package BuilderPattern;

public abstract class Builder {
    protected Product product;

    void buildPartA(){}

    void buildPartB(){}

    void buildPartC(){}

    Product getProduct(){
        return product;
    }
}
