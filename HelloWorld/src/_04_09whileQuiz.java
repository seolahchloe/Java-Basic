public class _04_09whileQuiz {
    public static void main(String[] args) {
        int num = 10000;
        int key = 153;

        while (num % key > 0) {
           num--; // 하나씩 감소
        }
        System.out.println(num);
        }

    }
