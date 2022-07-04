package interpreter;

public class TerminalExpression implements Expression {

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        String[] tokens = context.split("\\s");
        for (String t : tokens) {
            if(t.equals(data)) return true;
        }
        return false;
    }

}
