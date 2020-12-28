public class _04_07_while {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;  // 초기화

        while (i <= 3) {
            sum = sum + i;
            i = i + 1;
        }
        System.out.println(sum);
    }
}
