package Array;

public class _05_03arrayQuiz {
    public static void main(String[] args) {
        int[] intArray = new int[30];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = 1001 + i;
        }

        String[] remainders = {"Zero", "One", "Two", "Three"};
        for (int element : intArray) {
            System.out.println(remainders[element % 4]);
        }

    }
}
