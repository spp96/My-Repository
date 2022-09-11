package Q4;

public class Cricket_Score {
    static void runScore(int one, int two, int three, int four, int six){
        int total_Score = ((one) + (two*2) + (three*3) + (four*4) + (six*6));
        System.out.println(total_Score);
    }

    public static void main(String[] args) {
        runScore(1, 2, 3, 4, 6);
    }
}
