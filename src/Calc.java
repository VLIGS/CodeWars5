import java.util.Stack;

public class Calc {
    public double evaluate(String expr) {
        if(expr.length()==0){
            return 0;
        }
        String [] myExpressionString = expr.split("[\\s]+");
        Stack<String> myExpressionStack = new Stack<String>();
        for(int i = 0; i< myExpressionString.length; i++){
            if(!myExpressionString[i].equals("+")&&!myExpressionString[i].equals("+")&&!myExpressionString[i].equals("+")&&!myExpressionString[i].equals("+")){

            }
        }
        return 0;
    }
}
