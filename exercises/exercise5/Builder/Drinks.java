package Builder;

public abstract class Drinks implements Item {

    @Override
    public Packing packing() {
        return new Container();
    }

    @Override
    public abstract float price();
}