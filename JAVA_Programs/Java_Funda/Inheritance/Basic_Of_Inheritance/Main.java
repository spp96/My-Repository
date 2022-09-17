package Question_1;

public class Main {
    public static void main(String[] args){
        Bird b1 = new Parrot();
        b1.fly();

        Parrot p = (Parrot)b1;
        p.sing();
    }
}
