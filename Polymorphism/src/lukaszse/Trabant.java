package lukaszse;

public class Trabant extends Car{

    public Trabant(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("brum brum brum brum");
        super.startEngine();
    }

    @Override
    public void toBreak() {
        System.out.println("łiiiiiiiiiiiiii");
        super.toBreak();
    }

    @Override
    public void accelerate() {
        System.out.println("brrrrrruuuuuuuum brum brum bruuuuuuuuuuuuuuum");
        super.accelerate();
    }
}
