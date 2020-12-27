import java.time.Year;

public class Main {
    public static void main(String[] args) {
        // 변수 정의 (자료형 잘 선정해서)
        String name;
        name = "코드잇";
        int year, month, day;
        boolean married;

        // 값 대입
        name = "정쨈";
        year = 2020;
        month = 12;
        day = 25;
        married = false;

        // 자기 소
        System.out.print("이름: ");
        System.out.println(name);
        System.out.print("생일: ");
        System.out.print(year);
        System.out.print("년 ");
        System.out.print(month);
        System.out.print("월 ");
        System.out.print(day);
        System.out.println("일");
        System.out.print("결혼: ");
        System.out.println(married);
    }
}