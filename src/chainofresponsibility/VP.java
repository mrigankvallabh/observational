package chainofresponsibility;

public class VP extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE ||
                (request.getRequestType() == RequestType.PURCHASE && request.getAmount() <= 1500.00)) {
            System.out.println("VP approving the Conference or Purchases up to $1500.00");
        } else {
            nextHandler.handleRequest(request);
        }
    }

}
