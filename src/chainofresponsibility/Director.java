package chainofresponsibility;

public class Director extends Handler {

    @Override
    public void handleRequest(Request request) {
        if (request.getRequestType() == RequestType.CONFERENCE) {
            System.out.println("Director approving the Conference");
        } else {
            nextHandler.handleRequest(request);
        }
    }

}
