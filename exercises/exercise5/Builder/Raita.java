package Builder;

public class Raita extends Drinks {

    @Override
    public float price() {
        return 3.0f;
    }

    @Override
    public String name() {
        return "Raita";
    }
}