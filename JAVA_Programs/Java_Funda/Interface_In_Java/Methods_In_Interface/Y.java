package Question_1;

public interface Y {
    abstract void drink();
    default void water(){
        System.out.println("Y Can Drink Water");
    }
    static void juice(){
        System.out.println("Y Can Drink Juice");
    }
}
