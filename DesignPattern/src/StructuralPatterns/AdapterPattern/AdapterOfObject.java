package StructuralPatterns.AdapterPattern;

public class AdapterOfObject implements Target {
    private Adaptee adaptee;

    public AdapterOfObject(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
