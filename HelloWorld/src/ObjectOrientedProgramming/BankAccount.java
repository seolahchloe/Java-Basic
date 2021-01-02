package ObjectOrientedProgramming;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class BankAccount {
    int balance;
    Person owner;

    // 입금 메소드
    // 파라미터 : 입금할 액수 (정수)
    // 리턴값 : 성공여부 (불린)

    boolean deposit(int amount) {
        if ((amount < 0) || (owner.cashAccount < amount)){
            System.out.println("입금 실패입니다. 잔고: " + balance + "원, 현금: " + owner.cashAccount + "원");
            return false;
        } else {
            owner.cashAccount -= amount;
            balance += amount;
            System.out.println(amount + "원 입금하였습니다. 잔고: " + balance + "현금: " + owner.cashAccount);
            return true;
        }
    }

    // 출금 메소드
    // 파라미터 : 출금할 액수 (정수)
    // 리턴값 : 성공여부 (불린)

    boolean withdraw(int amount) {
        if ((amount < 0) || (balance < amount))// 2. 코드

    }

    //계좌 이체 메소드
    // 첫번째 파라미터 : 받는 사람 (Person)
    // 두번쨰 파라미터 : 이체할 금액 (정수)
    // 리턴 : 성공여부 (불린)

//    boolean transfer(Person, int amount) {

//    }
}
