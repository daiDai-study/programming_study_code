package StructuralPatterns.AdapterPattern;

public class AdapterOfClass extends Adaptee implements Target  {
    @Override
    public void request() {
        super.specificRequest();
    }
}
