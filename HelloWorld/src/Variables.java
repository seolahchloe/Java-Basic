public class Variables {
    public static void main(String[] args) {
        boolean myBoolean = true;
        myBoolean = false;

        int myInt = 123;

        long myLong = 12345678910L;

        double myDouble = 3.14;

        String myString = "Chloe!";  // 형을 나타내는 String의 색이 다릅니다.
        // 앞서 보았던 자료형들은 java의 기본 자료형 premetive type이라고 부릅니다.
        // String은 기본 자료형이 아닌 객체 또는 class라고 부릅니다.
        // 우리는 여기서 객체를 변수의 자료형으로 쓸 수 있다는 것과 변수에 객체를 담을 수 있다는 것을 배웠습니다.

        System.out.println("hello"); // print문 내부에 있는 큰 따옴표 문자열도 string이라는 것을 알 수 있습니다.

        String hello = "Hello, I'm ";
        String dot = ".";

        System.out.print(hello);
        System.out.print(27);
        System.out.print(dot); // 이렇게 문자를 변수에 담아 사용할 수 있습니다.
    }
}