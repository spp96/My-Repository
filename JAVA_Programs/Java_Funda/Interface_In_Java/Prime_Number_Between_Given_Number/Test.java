package Question_4;

public class Test implements Intr {
    @Override
        public int[] display ( int p){
            int n = 0;
            int count = 0;

            for (int i = 2; i <= p; i++) {
                int flag = 0;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    count++;
                }
            }
            int[] newArr = new int[count]; // 10
            for (int i = 2; i <= p; i++) {
                int flag = 0;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0) {
                    newArr[n] = i;
                    n++;
                }
            }
            return newArr;
        }
    }
