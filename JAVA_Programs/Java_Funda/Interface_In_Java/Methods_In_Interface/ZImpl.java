package Question_1;

public class ZImpl implements Z{
    @Override
    public void write() {
        System.out.println("ZImpl Can Write Letter");
    }

    @Override
    public void drink() {
        System.out.println("ZImpl Can Drink Water");
    }

    @Override
    public void sleep() {
        System.out.println("ZImpl Can Sleep");
    }
    @Override
    public void read(){
        System.out.println("read method of X interface is overridden");
    }
}
