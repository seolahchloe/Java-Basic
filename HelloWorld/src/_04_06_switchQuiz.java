public class _04_06_switchQuiz {
    public static void main(String[] args) {
        int number = 134354;

        // 나머지
        String rest="";

        switch (number % 7) {
            case 1:
                rest = "One";
                break;
            case 2:
                rest = "Two";
                break;
            case 3:
                rest = "Three";
                break;
            case 4:
                rest = "Four";
                break;
            case 5:
                rest = "Five";
                break;
            case 6:
                rest = "Six";
                break;
            default:
                rest = "Zero";
                break;
        }
        System.out.println(rest);
    }
}
