import interpreter.AndExpression;
import interpreter.Expression;
import interpreter.OrExpression;
import interpreter.TerminalExpression;

public class InterpreterDemo {
    public static void main(String[] args) {
        String context = "Porcupine Meercats";
        Expression define = buildInterpreterTree();
        System.out.println(context + " is " + define.interpret(context));
    }

    static Expression buildInterpreterTree() {
        Expression terminal1 = new TerminalExpression("Lions");
        Expression terminal2 = new TerminalExpression("Tigers");
        Expression terminal3 = new TerminalExpression("Bears");

        Expression tigersAndBears = new AndExpression(terminal2, terminal3);
        Expression LionsOr = new OrExpression(terminal1, tigersAndBears);
        return LionsOr;
    }
}
