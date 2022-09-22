package Question_1;

public interface X {
    abstract void write();

    default void read(){
        System.out.println("X Can write Letter");
    }
    static void see(){
        System.out.println("X Can See Letter");
    }
}
