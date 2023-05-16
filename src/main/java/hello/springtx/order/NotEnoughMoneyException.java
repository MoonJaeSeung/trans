package hello.springtx.order;

public class NotEnoughMoneyException extends Exception { //Exception을 상속받으면 체크 예외다.

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
