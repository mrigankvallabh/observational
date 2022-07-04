package chainofresponsibility;

public class CEO extends Handler {
    
    @Override
    public void handleRequest(Request request) {
        System.out.println("CEO approving any Request Type");
    }
}
