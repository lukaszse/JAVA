package lukaszse;

public class Ferrari extends Car {

    public Ferrari(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("khkhkhiiiiin");
        super.startEngine();
    }

    @Override
    public void toBreak() {
        System.out.println("szuuuuuuuuuu");
        super.toBreak();
    }

    @Override
    public void accelerate() {
        System.out.println("bziiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        super.accelerate();
    }
}
