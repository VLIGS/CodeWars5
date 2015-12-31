import java.util.Stack;

public class Calc {
    public double evaluate(String expr) {
        if(expr.length()==0){
            return 0;
        }
        String [] myExpressionString = expr.split("[\\s]+");
        Stack<String> myExpressionStack = new Stack<String>();
        double myResult = 0.0;
        for(int i = 0; i< myExpressionString.length; i++){
            if(!myExpressionString[i].equals("+")&&!myExpressionString[i].equals("-")&&!myExpressionString[i].equals("*")&&!myExpressionString[i].equals("/")){
                myExpressionStack.push(myExpressionString[i]);
            }
        }
        if(myExpressionStack.empty()){
            return myResult;
        }
        else{
            return Double.parseDouble(myExpressionStack.pop());
        }
    }
}
