import java.util.ArrayList;
import java.util.List;

public class Calc {
    public double evaluate(String expr) {
        if(expr.length()==0){
            return 0;
        }
        String [] myExpressionString = expr.split("[\\s]+");
        List<String> myExpressionStack = new ArrayList<String>();
        double myResult = 0.0;
        for(int i = 0; i< myExpressionString.length; i++){
            if(!myExpressionString[i].equals("+")&&!myExpressionString[i].equals("-")&&!myExpressionString[i].equals("*")&&!myExpressionString[i].equals("/")){
                myExpressionStack.add(myExpressionString[i]);
            }
            else{
                myResult = Double.parseDouble(myExpressionStack.get(0));
                for(int k=1; k<myExpressionStack.size();i++){
                    if(myExpressionString[i].equals("+")){
                        myResult = myResult + Double.parseDouble(myExpressionStack.get(k));
                    }
                    else if(myExpressionString[i].equals("-")){
                        myResult = myResult - Double.parseDouble(myExpressionStack.get(k));
                    }
                    else if(myExpressionString[i].equals("*")){
                        myResult = myResult * Double.parseDouble(myExpressionStack.get(k));
                    }
                    else if(myExpressionString[i].equals("/")){
                        myResult = myResult / Double.parseDouble(myExpressionStack.get(k));
                    }
                    myExpressionStack = new ArrayList<String>();
                    myExpressionStack.add(""+myResult+"");
                }
            }
        }
        if(myExpressionStack.size()!=0){
            return Double.parseDouble(myExpressionStack.get(myExpressionStack.size()-1));
        }
        else{
            return myResult;
        }
    }
}
