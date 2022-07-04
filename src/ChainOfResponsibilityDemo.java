import chainofresponsibility.CEO;
import chainofresponsibility.Director;
import chainofresponsibility.Handler;
import chainofresponsibility.Request;
import chainofresponsibility.RequestType;
import chainofresponsibility.VP;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        Handler director = new Director();
        Handler vp = new VP();
        Handler ceo = new CEO();
        director.setNextHandler(vp);
        vp.setNextHandler(ceo);

        Request newRequest = new Request(RequestType.PURCHASE, 5000);
        vp.handleRequest(newRequest);
    }
}
