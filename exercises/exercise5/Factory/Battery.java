package Factory;


public class Battery implements Shape {

    @Override
    public void assemble() {
        System.out.println("Inside Battery::assemble() method.");
    }
}

// Square